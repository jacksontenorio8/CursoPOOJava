package br.com.jacksontenorio8.cursopoo.aula05;

public class aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jackson");
        p1.abrirConta("CC");


        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Daysy anne");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(1000);

        p1.sacar(150);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
