package com.pablo.spring.inyeccionFiguras;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    protected static Figura figura;
    protected static List<Figura> figuras = new ArrayList<Figura>();
    protected static String answer;
    private static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    static void menu() {
        System.out.println("A. Texto\n" +
                "B. Punto\n" +
                "C. Linea\n" +
                "D. Círculo\n" +
                "E. Cuadrado\n" +
                "F. Rectángulo\n" +
                "G. Polígono\n\n" +
                "H. Dibujar el historial de figuras\n" +
                "I. Salir\n");

        System.out.print("Elige --> ");
        answer = sc.nextLine();

        switch (answer) {
            case "A":
                figura = (Text) context.getBean("text");
                figura.read();
                figuras.add(figura);

                callWindow();
                break;
            case "B":
                figura = (Dot) context.getBean("dot");
                figura.read();
                figuras.add(figura);

                callWindow();
                break;
            case "C":
                figura = (Line) context.getBean("line");
                figura.read();
                figuras.add(figura);

                callWindow();
                break;
            case "D":
                figura = (Circle) context.getBean("circle");
                figura.read();
                figuras.add(figura);

                callWindow();
                break;
            case "E":
                figura = (Square) context.getBean("square");
                figura.read();
                figuras.add(figura);

                callWindow();
                break;
            case "F":
                figura = (Rectangle) context.getBean("rectangle");
                figura.read();
                figuras.add(figura);

                callWindow();
                break;
            case "G":
                figura = (Poligon) context.getBean("poligon");
                figura.read();
                figuras.add(figura);

                callWindow();
                break;
            case "H":
                callWindow();
                break;
            case "I":
                return;

        }

        menu();

    }

    static void callWindow() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Window frame = new Window();
                    frame.setVisible(true);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        menu();
    }

}
