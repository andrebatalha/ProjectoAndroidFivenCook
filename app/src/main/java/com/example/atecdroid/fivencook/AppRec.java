package com.example.atecdroid.fivencook;

import android.app.Application;

import com.example.atecdroid.fivencook.modelo.BaseDados;
import com.example.atecdroid.fivencook.modelo.Categoria;
import com.example.atecdroid.fivencook.modelo.Receita;

import java.util.ArrayList;

/**
 * Created by lol on 28-07-2016.
 */
public class AppRec extends Application {

    Categoria catEscolhida;
    Receita recEscolhida;

    protected ArrayList <Categoria> receitas;

    @Override
    public void onCreate(){
        super.onCreate();

            receitas = BaseDados.getData();
    }

    public ArrayList<Categoria> getReceitas(){
        return receitas;
    }

    public void setReceitas(ArrayList<Categoria> receitas){
        this.receitas = receitas;
    }

    public Categoria getCatEscolhida() {
        return catEscolhida;
    }

    public void setCatEscolhida(Categoria catEscolhida) {
        this.catEscolhida = catEscolhida;
    }



    public Receita getRecEscolhida() {
        return recEscolhida;
    }

    public void setRecEscolhida(Receita recEscolhida) {
        this.recEscolhida = recEscolhida;
    }



}
