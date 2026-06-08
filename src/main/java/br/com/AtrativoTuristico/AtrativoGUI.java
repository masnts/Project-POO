package br.com.AtrativoTuristico;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class AtrativoGUI extends JFrame{
    public AtrativoGUI(){
        setTitle("Guia de Atrativo");
        setSize(600,500);
        setLocation(0, 0);
        setResizable(false);
        getContentPane().setBackground(Color.MAGENTA);
    }
    public static void main(String [] args){
        AtrativoGUI janela= new AtrativoGUI();
        janela.setVisible(true);
        WindowListener fechaJanela = new WindowAdapter() {
            public void windowclosing(WindowEvent e){
                System.exit(0);
            }
        };
    }
}
