package br.com.projetomouse.main;

import br.com.projetomouse.model.Mouse;

public class Main {
    public static void main(String[] args) {


        System.out.println("-----------------------------------------");
        System.out.println("------ Inicializando Projeto Mouse ------");
        System.out.println("-----------------------------------------");

        Mouse mouse1 = new Mouse("Vermelho", 800, 100);

        mouse1.deslocarPonteiro(720, 480);
        mouse1.deslocarPonteiro(200, 400);

        mouse1.scrollar(2);
        mouse1.scrollar(-3);
        mouse1.scrollar(0);

        System.out.println("\nCaracterísticas do Mouse: " +
                "\nCor: " + mouse1.getCor() +
                "\nDPI: " + mouse1.getDPI() +
                "\nPeso em Gramas: " + mouse1.getPesoEmGramas());
    }
}
