package br.com.jacksontenorio8.cursopoo01.aula04;


public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta (String modelo, String cor , float ponta){ // Este é o metódo construtor
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampar();

    }

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

    public void tampar (){
        this.tampada = true;
    }

    public void destampar () {
        this.tampada = false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta "+ this.getPonta());
        System.out.println("Cor "+ this.cor);
        System.out.println("Tampada: "+ this.tampada);

    }
}
