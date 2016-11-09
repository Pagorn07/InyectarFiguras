package com.pablo.spring.inyeccionFiguras;

public class Rectangle extends Figura{
    private int width;
    private int height;
    private boolean isFilled;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isFilled() {
        return isFilled;
    }

    @Override
    void read() {
        super.read();

        System.out.print("Ancho del rectángulo --> ");
        width = sc.nextInt();
        System.out.print("Altura del rectángulo --> ");
        height = sc.nextInt();
        System.out.print("Lo quieres relleno de color? (Y | N) --> ");
        isFilled = sc.next().equals("Y");

    }
}
