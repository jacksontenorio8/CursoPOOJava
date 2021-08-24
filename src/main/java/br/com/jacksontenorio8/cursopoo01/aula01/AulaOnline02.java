package br.com.jacksontenorio8.cursopoo01.aula01;

public class AulaOnline02 {
    String modelo;
    String cor;
    float tempo;
    boolean assistida;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tempo: "+ this.tempo);
    }

    public void assistida(){
        if (this.assistida == true){
            System.out.println("Sim! A aula foi assistida.");
        } else {
            System.out.println("ERRO! A aula nao foi assistida.");
        }
    }
}
