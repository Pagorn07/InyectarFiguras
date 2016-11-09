package com.pablo.spring.inyeccionFiguras;

public class Poligon extends Figura{
    private boolean filled;
    int nPolygon;
    int[] coordenatesX;
    int[] coordenatesY;

    public boolean isFilled() {
        return filled;
    }

    public int[] getCoordenatesX() {
        return coordenatesX;
    }

    public int[] getCoordenatesY() {
        return coordenatesY;
    }

    public int getnPolygon() {
        return nPolygon;
    }

    @Override
    void read() {
        super.read();

        System.out.print("Cuantas esquinas posee el magnífico polígono que quieres crear de la nada? --> ");
        nPolygon = sc.nextInt();
        coordenatesX = new int[nPolygon + 1];
        coordenatesY = new int[nPolygon + 1];
        coordenatesX[0] = this.getPosX();
        coordenatesY[0] = this.getPosY();

        for(int i = 1; i < coordenatesX.length - 1; i++) {
            System.out.print("Define la posición de X --> ");
            coordenatesX[i] = sc.nextInt();
            System.out.print("Define la posición de Y --> ");
            coordenatesY[i] = sc.nextInt();
        }

        System.out.print("Lo quieres relleno? (S | N) --> ");
        filled = sc.next().equals("S");

        coordenatesX[coordenatesX.length - 1] = this.getPosX();
        coordenatesY[coordenatesY.length - 1] = this.getPosY();
    }
}
