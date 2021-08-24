package com.jacksontenorio.CursoPOOJava.aula04;


public class Caneta {
    public String modelo;
    private float ponta;

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }
    public float setPonta(float p) {
        return this.ponta = p;
    }

    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ponta "+ this.ponta);
    }
}
