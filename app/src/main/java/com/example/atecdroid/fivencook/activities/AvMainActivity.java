package com.example.atecdroid.fivencook.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.app.Activity;
import android.widget.TextView;

import com.example.atecdroid.fivencook.R;
import com.example.atecdroid.fivencook.modelo.Categoria;

import java.util.ArrayList;

public class AvMainActivity extends BaseActivity {
    ListView list;

    Integer[] imageId = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final CustomList adapter = new
        CustomList(AvMainActivity.this, mApp.getReceitas() , imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                mApp.setCatEscolhida( mApp.getReceitas().get(position));
                Intent i = new Intent(AvMainActivity.this, AvVermenu.class);
//                i.putExtra("n", position);
                startActivity(i);



            }
        });


    }

    private class CustomList extends ArrayAdapter<Categoria> {

        private final Activity context;
        private final ArrayList<Categoria> categorias;
        private final Integer[] imageId;
        public CustomList(Activity context,
                          ArrayList<Categoria> categorias, Integer[] imageId) {
            super(context, R.layout.list_single, categorias);
            this.context = context;
            this.categorias = categorias;
            this.imageId = imageId;
        }
        @Override
        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView= inflater.inflate(R.layout.list_single, null, true);
            TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

            Categoria cat = categorias.get(position);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.img);

            txtTitle.setText(cat.getNome());
            imageView.setImageResource(cat.getImage());
            return rowView;
        }
    }

}