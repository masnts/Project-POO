package br.com.AtrativoTuristico;

import javax.swing.*;
import java.awt.*;

public class AtrativoGUIv2 extends JFrame {
    JLabel l1,l2;
    ImageIcon aviaoImg = new ImageIcon("./img/aviao.jpg");
    public AtrativoGUIv2(){
        setTitle("Atrativo turistico");
        setSize(400,400); //tamanho da janela
        setLocation(0, 0);
        setResizable(true);
        getContentPane().setBackground(Color.white);
        l1 = new JLabel("Sistema de turismo", JLabel.CENTER);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Serif", Font.BOLD, 24));
        l2 = new JLabel(aviaoImg, JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(3,1));
        getContentPane().add(l1);
        getContentPane().add(l2);
    }
    public static void main(String [] args){
        JFrame janela = new AtrativoGUIv2();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
