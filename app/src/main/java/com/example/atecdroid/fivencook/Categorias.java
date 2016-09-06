package com.example.atecdroid.fivencook;

import com.example.atecdroid.fivencook.modelo.Receita;

import java.util.ArrayList;

/**
 * Created by lol on 28-07-2016.
 */
public class Categorias {

    String sopas, saladas, carnes, peixes, sobremesas;

    ArrayList<Receita> receitas;


    public Categorias(String sopas){this.sopas=sopas;}

    public Categorias(String sopas, String saladas, String carnes, String peixes, String sobremesas) {
        this.sopas = sopas;
        this.saladas = saladas;
        this.carnes = carnes;
        this.peixes = peixes;
        this.sobremesas = sobremesas;
    }

    public void setSopas(String sopas) {this.sopas = sopas;}

    public void setSaladas(String saladas) {this.saladas = saladas;}

    public void setCarnes(String carnes) {this.carnes = carnes;}

    public void setPeixes(String peixes) {this.peixes = peixes;}

    public void setSobremesas(String sobremesas) {this.sobremesas = sobremesas;}

    public String getSopas() {return sopas;}

    public String getSaladas() {return saladas;}

    public String getCarnes() {return carnes;}

    public String getPeixes() {return peixes;
    }

    public String getSobremesas() {return sobremesas;
    }

    public ArrayList<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(ArrayList<Receita> receitas) {
        this.receitas = receitas;
    }

}
