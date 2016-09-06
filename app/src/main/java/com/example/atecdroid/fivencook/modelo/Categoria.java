package com.example.atecdroid.fivencook.modelo;

import java.util.ArrayList;

/**
 * Created by lol on 28-07-2016.
 */
public class Categoria {
    String nome;
    ArrayList<Receita> receitas;
    int image;

    public Categoria(String n, int img){
        this.nome = n;
        receitas = new ArrayList<>();
        this.image  = img;
    }

    public void addReceita(Receita r) {
        this.receitas.add(r);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(ArrayList<Receita> receitas) {
        this.receitas = receitas;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
