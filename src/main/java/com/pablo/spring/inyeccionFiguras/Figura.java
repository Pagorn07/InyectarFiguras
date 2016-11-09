package com.pablo.spring.inyeccionFiguras;

import java.util.Scanner;

public class Figura {
    protected Scanner sc = new Scanner(System.in);

    private int posX;
    private int posY;
    private String color;

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public String getColor() {
        return color;
    }


    void read() {
        sc.useDelimiter(System.getProperty("line.separator"));

        System.out.print("Define la posición de X --> ");
        posX = sc.nextInt();
        System.out.print("Define la posición de Y --> ");
        posY = sc.nextInt();
        System.out.print("De que color lo quieres? (rojo | verde | azul) --> ");
        color = sc.next();



    }
}
