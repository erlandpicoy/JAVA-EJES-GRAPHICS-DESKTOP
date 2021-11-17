
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EjercicioN8 extends JFrame implements ActionListener {

    private JMenuBar menubar;
    private JMenu m1, m2;
    private JMenu m1_s1,m1_s2;
    private JMenu m1_s1_s1,m1_s1_s2;
    private JMenuItem m1_s1_s1_i1,m1_s1_s1_i2;
    private JMenuItem m1_s1_s2_i1,m1_s1_s2_i2;


    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    private JCheckBox check1;

    public EjercicioN8 (){

        setLayout(null);

        menubar= new JMenuBar();
        setJMenuBar(menubar);

        m1 = new JMenu("Archivo");
        menubar.add(m1);

        m1_s1 = new JMenu("Nuevo");
        m1.add(m1_s1);

        m1_s2 = new JMenu("Opciones");
        m1.add(m1_s2);

        m1_s1_s1 = new JMenu("Resolucion");
        m1_s2.add(m1_s1_s1);

        m1_s1_s2 = new JMenu("Color Pantalla");
        m1_s2.add(m1_s1_s2);

        m1_s1_s1_i1 = new JMenuItem("600*400");
        m1_s1_s1.add(m1_s1_s1_i1);
        m1_s1_s1_i1.addActionListener(this);

        m1_s1_s1_i2 = new JMenuItem("300*400");
        m1_s1_s1.add(m1_s1_s1_i2);
        m1_s1_s1_i2.addActionListener(this);

        m1_s1_s2_i1 = new JMenuItem("Fondo Rojo");
        m1_s1_s2.add(m1_s1_s2_i1);
        m1_s1_s2_i1.addActionListener(this);

        m1_s1_s2_i2 = new JMenuItem("Fondo Azul");
        m1_s1_s2.add( m1_s1_s2_i2);
        m1_s1_s2_i2.addActionListener(this);


            label1 = new JLabel("ROJO");
            label1.setBounds(60,10,50,30);
            add(label1);

            label2 = new JLabel("VERDE");
            label2.setBounds(60,50,50,30);
            add(label2);

            label3 = new JLabel("AZUL");
            label3.setBounds(60,90,90,30);
            add(label3);

            check1 = new JCheckBox();
            check1.setBounds(10,10,30,30);
            add(check1);

        }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == m1_s1_s1_i1 ) {
            setSize(600,400);

        }

        if (e.getSource() == m1_s1_s1_i2 ) {
            setSize(400,300);
        }

        if (e.getSource() == m1_s1_s2_i1 ) {
            getContentPane().setBackground(new Color(255,0,0) );
        }

        if (e.getSource() == m1_s1_s2_i2) {
            getContentPane().setBackground(new Color(0,0,255) );
        }
    }

    public static void main( String []args){
        EjercicioN8 formulario1= new EjercicioN8();
        formulario1.setBounds(0,0,200,250);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
