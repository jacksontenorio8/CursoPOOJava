package br.com.jacksontenorio8.cursopoo.aula05;

public class aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jackson");
        p1.abrirConta("CC");
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
    }
}
