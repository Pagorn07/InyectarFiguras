package com.pablo.spring.inyeccionFiguras;

public class Line extends Figura{
    private int finX;
    private int finY;

    public int getFinX() {
        return finX;
    }

    public int getFinY() {
        return finY;
    }

    @Override
    void read() {
        super.read();

        System.out.print("Define la posición de X destino --> ");
        finX = sc.nextInt();
        System.out.print("Define la posición de Y destino --> ");
        finY = sc.nextInt();
    }
}
