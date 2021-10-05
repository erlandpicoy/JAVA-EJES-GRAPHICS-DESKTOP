import javax.swing.*;
import java.awt.event.*;

public class EjercicioN5 extends JFrame implements ActionListener{
    private JLabel texto1;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;


    public EjercicioN5(){

        setLayout(null);

        texto1 = new JLabel("Seleccione el numero par para salir");
        texto1.setBounds(20,20,500,20);

        boton1 =new JButton("1");
        boton1.setBounds(1,80,60,30);
        boton1.addActionListener(this);

        boton2 =new JButton("2");
        boton2.setBounds(200,80,60,30);
        boton2.addActionListener(this);

        boton3 =new JButton("3");
        boton3.setBounds(450,80,60,30);
        boton3.addActionListener(this);

        add(boton1);
        add(boton2);
        add(boton3);
        add(texto1);
    }

    public static void main(String []args){
        EjercicioN5 formulario1=new EjercicioN5();
        formulario1.setBounds(0,0,500,200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1){
            System.exit(0);
        }
    }
}