package br.com.projetomouse.model;

public class Mouse {
    private long dpi;
    private String cor;
    private double pesoEmGramas;

    private double xAtual = 0;
    private double yAtual = 0;
    private int pixelsPorScroll = 100;
    private boolean corDefinida = false;
    private boolean pesoDefinido = false;

    public Mouse (String cor, long dpi, double pesoEmGramas) {
        this.setCor(cor);
        this.setDpi(dpi);
        this.setPesoEmGramas(pesoEmGramas);
    }

    public void deslocarPonteiro (final double x, final double y) {
        System.out.println("\nDeslocando ponteiro...");

        System.out.println("\nCoordenada anterior: (" + this.xAtual + ", " + this.yAtual + ")");

        double distanciaDeslocada = Math.sqrt(Math.pow((y - this.yAtual), 2) + Math.pow((x - this.xAtual), 2));
        double centimetrosDeslocados = (distanciaDeslocada / this.dpi) * 2.54; // 2.54 equivale a quantidade de centím. de uma polegada.
        this.xAtual = x;
        this.yAtual = y;

        System.out.println("Coordenada atual: (" + x + ", " + y + ")");
        System.out.println("Distância deslocada em pixels: " + distanciaDeslocada);
        System.out.println("Deslocamento do mouse em cm: " + centimetrosDeslocados);

        System.out.println(" ");
    }

    public void scrollar (int passosScroll) {

        System.out.println("\nVerificando deslocamento com scroll...\n");

        int deslocamentoEmPixelsScroll = passosScroll * this.pixelsPorScroll;

        if (passosScroll > 0) {
            System.out.println("Deslocamento de " + deslocamentoEmPixelsScroll + " para cima!");
        } else if (passosScroll < 0) {
            System.out.println("Deslocamento de " + (-1 * deslocamentoEmPixelsScroll) + " para baixo!");
        } else {
            System.out.println("Não houve deslocamento utilizando o scroll do mouse!");
        }

        System.out.println(" ");

    }

    private void setCor(String cor) {
        if (corDefinida == false) {
            this.cor = cor;
            this.corDefinida = true;
        } else {
            System.out.println("A cor já do mouse já foi definida anteriormente");
        }

    }

    // Mantive o dpi alterável mais de uma vez porque tem mouses que possuem essa opção
    private void setDpi(long dpi) {
        if (dpi > 0) {
            this.dpi = dpi;
        } else {
            System.out.println("Esse valor não é válido para ser atribuido ao DPI");
        }
    }

    private void setPesoEmGramas(double pesoEmGramas) {
        if (pesoDefinido == false) {
            if (pesoEmGramas >= 30) {
                this.pesoEmGramas = pesoEmGramas;
                this.pesoDefinido = true;
            } else {
                System.out.println("Esse peso não é válido para o mouse");
            }
        } else {
            System.out.println("O peso(g) já do mouse já foi definida anteriormente");
        }
    }

    public String getCor() {
        return cor;
    }

    public long getDpi() {
        return dpi;
    }

    public double getPesoEmGramas() {
        return pesoEmGramas;
    }
}
