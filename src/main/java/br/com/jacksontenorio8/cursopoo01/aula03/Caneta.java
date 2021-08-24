package com.jacksontenorio.CursoPOOJava.aula03;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    private boolean tampada;

    // void significa sem retorno!
    public void status(){
        //this significa autoreferência e também representa o nome do objeto que chamou.
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Está tampada "+ this.tampada);

    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Nao posso rabiscar");
        } else{
            System.out.println("Estou rabiscando!");
        }
    }

    public void tampar() {

        this.tampada = true;
    }

    public void destampar() {

        this.tampada = false;
    }
}
