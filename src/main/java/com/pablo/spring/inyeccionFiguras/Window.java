package com.pablo.spring.inyeccionFiguras;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Window extends JFrame {
    private JPanel contentPane;


    public Window() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0, 0, 800, 600);
    }

    public void paint(Graphics g) {
        super.paint(g);

        if(Main.answer.equals("H")) {
            for(int i = 0; i < Main.figuras.size(); i++) {
                Main.figura = Main.figuras.get(i);
                elegirFigura(g);

            }
        } else {
            elegirFigura(g);
        }

    }

    void elegirFigura(Graphics g) {
        if(Main.figura.getColor().equals("rojo")) g.setColor(Color.red);
        else if(Main.figura.getColor().equals("verde")) g.setColor(Color.green);
        else if(Main.figura.getColor().equals("azul")) g.setColor(Color.blue);
        else g.setColor(Color.black);

        //Cuadrado
        if (Main.figura instanceof Square) {
            Square square = (Square) Main.figura;

            if (square.isFilled()) {
                g.fillRect(square.getPosX(), square.getPosY(), square.getLongitude(), square.getLongitude());
            } else {
                g.drawRect(square.getPosX(), square.getPosY(), square.getLongitude(), square.getLongitude());
            }
        }
        //Texto
        else if (Main.figura instanceof Text) {
            Text text = (Text) Main.figura;

            g.drawString(text.getText(), text.getPosX(), text.getPosY());
        }
        //Rectangulo
        else if (Main.figura instanceof Rectangle) {
            Rectangle rect = (Rectangle) Main.figura;

            if (rect.isFilled()) {
                g.fillRect(rect.getPosX(), rect.getPosY(), rect.getWidth(), rect.getHeight());
            } else {
                g.drawRect(rect.getPosX(), rect.getPosY(), rect.getWidth(), rect.getHeight());
            }
        }
        //Linia
        else if (Main.figura instanceof Line) {
            Line line = (Line) Main.figura;

            g.drawLine(line.getPosX(), line.getPosY(), line.getFinX(), line.getFinY());
        }
        //Circulo
        else if (Main.figura instanceof Circle) {
            Circle circle = (Circle) Main.figura;

            if (circle.isFill()) {
                g.fillArc(circle.getPosX(), circle.getPosY(), circle.getRadius(), circle.getRadius(), 0, 360);
            } else {
                g.drawArc(circle.getPosX(), circle.getPosY(), circle.getRadius(), circle.getRadius(), 0, 360);
            }
        }
        //Punto
        else if (Main.figura instanceof Dot) {
            Dot dot = (Dot) Main.figura;

            g.fillArc(dot.getPosX(), dot.getPosY(), dot.getRadius(), dot.getRadius(), 0, 360);
        }
        //Poligono
        else if(Main.figura instanceof Poligon) {
            Poligon polygon = (Poligon) Main.figura;

            if (polygon.isFilled()) {
                g.fillPolygon(polygon.getCoordenatesX(), polygon.getCoordenatesY(), polygon.getnPolygon());
            } else {
                g.drawPolygon(polygon.getCoordenatesX(), polygon.getCoordenatesY(), polygon.getnPolygon());
            }
        }
    }

}
