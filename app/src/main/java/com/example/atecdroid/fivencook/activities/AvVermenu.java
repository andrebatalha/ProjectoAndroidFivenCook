package com.example.atecdroid.fivencook.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.atecdroid.fivencook.AppRec;
import com.example.atecdroid.fivencook.CustomList;
import com.example.atecdroid.fivencook.R;
import com.example.atecdroid.fivencook.modelo.Categoria;
import com.example.atecdroid.fivencook.modelo.Receita;

import java.util.ArrayList;

public class AvVermenu extends BaseActivity {

       ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vermenu);


        final Categoria cat = mApp.getCatEscolhida();
        final ArrayList<Receita> recs = cat.getReceitas();

        final AdaptReceitas adapter = new
                AdaptReceitas(this, cat.getReceitas());
        lv=(ListView)findViewById(R.id.listView);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                mApp.setRecEscolhida(recs.get(position));
                Intent i = new Intent(AvVermenu.this, AvMostraReceita.class);
                startActivity(i);



            }
        });
    }


    private class AdaptReceitas extends ArrayAdapter<Receita> {

        private final Activity context;
        private final ArrayList<Receita> receitas;
 //       private final Integer[] imageId;

        public AdaptReceitas(Activity context,
                          ArrayList<Receita> rec) {
            super(context, R.layout.list_single2, rec);
            this.context = context;
            this.receitas = rec;
 //           this.imageId = imageId;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView= inflater.inflate(R.layout.list_single2, null, true);
            TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

            Receita rec = receitas.get(position);
 //           ImageView imageView = (ImageView) rowView.findViewById(R.id.img);

            txtTitle.setText(rec.getTitulo());
          //  imageView.setImageResource(rec.getImage());
            return rowView;
        }
    }
}
