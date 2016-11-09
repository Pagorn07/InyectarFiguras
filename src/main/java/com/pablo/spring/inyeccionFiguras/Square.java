package com.pablo.spring.inyeccionFiguras;

public class Square extends Figura {
    private int longitude;
    private boolean isFilled;

    public int getLongitude() {
        return longitude;
    }

    public boolean isFilled() {
        return isFilled;
    }

    @Override
    void read() {
        super.read();

        System.out.print("Cuanto mide un lado del cuadrado? (px) --> ");
        longitude = sc.nextInt();
        System.out.print("Lo quieres relleno de color? (Y | N) --> ");
        isFilled = sc.next().equals("Y");



    }
}
