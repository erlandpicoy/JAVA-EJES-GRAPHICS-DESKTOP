import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EjercicioN7 extends JFrame implements ActionListener {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JButton boton1;
    private JComboBox combo1;
    private JComboBox combo2;
    private JComboBox combo3;


    public EjercicioN7 (){

        setLayout(null);

        label1 = new JLabel("ROJO");
        label1.setBounds(10,10,50,30);
        add(label1);

        label2 = new JLabel("VERDE");
        label2.setBounds(10,50,50,30);
        add(label2);

        label3 = new JLabel("AZUL");
        label3.setBounds(10,90,90,30);
        add(label3);

        boton1 = new JButton("Aplicar");
        boton1.setBounds(50,150,75,30);
        add(boton1);
        boton1.addActionListener(this);

        combo1 = new JComboBox();
        combo1.setBounds(100,10,50,30);
        for (int i=0;i<250;i++){
            combo1.addItem(String.valueOf(i));
        }
        add(combo1);

        combo2 = new JComboBox();
        combo2.setBounds(100,50,50,30);
        for (int i=0 ;i<250;i++){
            combo2.addItem(String.valueOf(i));
        }
        add(combo2);

        combo3 = new JComboBox();
        combo3.setBounds(100,90,50,30);
        for (int i=0;i<250;i++){
            combo3.addItem(String.valueOf(i));
        }
        add(combo3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1 ) {
            String st1 = combo1.getSelectedItem().toString();
            String st2 = combo2.getSelectedItem().toString();
            String st3 = combo3.getSelectedItem().toString();

            int rojo = Integer.parseInt(st1);
            int verde = Integer.parseInt(st2);
            int azul = Integer.parseInt(st3);

            Color color1=new Color(rojo,verde,azul);
            boton1.setBackground(color1);
        }
    }

    public static void main( String []args){

        EjercicioN7 formulario1= new EjercicioN7();
        formulario1.setBounds(0,0,200,250);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);

    }

}
