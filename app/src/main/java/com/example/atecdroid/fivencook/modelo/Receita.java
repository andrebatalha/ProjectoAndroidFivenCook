package com.example.atecdroid.fivencook.modelo;

/**
 * Created by lol on 28-07-2016.
 */
public class Receita {

    String Titulo, Ing1, Ing2, Ing3, Ing4, Ing5, Desc, Cat;
    int img;


    public Receita(String titulo, String ing1, String ing2, String ing3, String ing4, String ing5, String desc, String cat, int i) {
        this.Titulo = titulo;
        this.Ing1 = ing1;
        this.Ing2 = ing2;
        this.Ing3 = ing3;
        this.Ing4 = ing4;
        this.Ing5 = ing5;
        this.Desc = desc;
        Cat = cat;
        img = i;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public void setIng1(String ing1) {
        Ing1 = ing1;
    }

    public void setIng2(String ing2) {
        Ing2 = ing2;
    }

    public void setIng3(String ing3) {
        Ing3 = ing3;
    }

    public void setIng4(String ing4) {
        Ing4 = ing4;
    }

    public void setIng5(String ing5) {
        Ing5 = ing5;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getIng1() {
        return Ing1;
    }

    public String getIng2() {
        return Ing2;
    }

    public String getIng3() {
        return Ing3;
    }

    public String getIng4() {
        return Ing4;
    }

    public String getIng5() {
        return Ing5;
    }

    public String getDesc() {
        return Desc;
    }

    public String getCat() {
        return Cat;
    }

    public void setCat(String cat) {
        Cat = cat;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
