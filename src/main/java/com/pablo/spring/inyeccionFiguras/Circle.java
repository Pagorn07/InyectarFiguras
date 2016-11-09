package com.pablo.spring.inyeccionFiguras;

public class Circle extends Figura{
    private int radius;
    private boolean isFill;

    public int getRadius() {
        return radius;
    }

    public boolean isFill() {
        return isFill;
    }

    @Override
    void read(){
        super.read();

        System.out.print("Define el radio del circulo --> ");
        radius = sc.nextInt() * 2;
        System.out.print("Lo quieres relleno? (S | N) --> ");
        isFill = sc.next().equals("S");


    }
}
