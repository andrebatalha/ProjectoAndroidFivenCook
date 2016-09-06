package com.example.atecdroid.fivencook.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.atecdroid.fivencook.AppRec;
import com.example.atecdroid.fivencook.R;
import com.example.atecdroid.fivencook.modelo.Categoria;
import com.example.atecdroid.fivencook.modelo.Receita;

import java.util.ArrayList;

public class AvMostraReceita extends BaseActivity {


    TextView tit, i1, i2, i3, i4, i5, desc;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_receita);

        tit = (TextView) findViewById(R.id.titulo);
        i1 = (TextView) findViewById(R.id.Ing1);
        i2 = (TextView) findViewById(R.id.Ing2);
        i3 = (TextView) findViewById(R.id.Ing3);
        i4 = (TextView) findViewById(R.id.Ing4);
        i5 = (TextView) findViewById(R.id.Ing5);
        desc = (TextView) findViewById(R.id.desc);
        img = (ImageView) findViewById(R.id.iv_receita);


        tit.setText(mApp.getRecEscolhida().getTitulo());
        i1.setText(mApp.getRecEscolhida().getIng1());
        i2.setText(mApp.getRecEscolhida().getIng2());
        i3.setText(mApp.getRecEscolhida().getIng3());
        i4.setText(mApp.getRecEscolhida().getIng4());
        i5.setText(mApp.getRecEscolhida().getIng5());
        desc.setText(mApp.getRecEscolhida().getDesc());
        img.setImageResource(mApp.getRecEscolhida().getImg());
    }
}
