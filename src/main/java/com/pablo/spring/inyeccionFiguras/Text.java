package com.pablo.spring.inyeccionFiguras;

public class Text extends Figura {
    private String text;

    public String getText() {
        return text;
    }

    @Override
    void read() {
        super.read();

        System.out.print("Inserta un texto: ");
        text = sc.next();



    }
}
