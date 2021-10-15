
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EjercicioN8 extends JFrame implements ActionListener {

    private JMenuBar menubar;
    private JMenu menu1,menu1_sub1,menu1_sub2;
    private JMenu menu2,menu2_sub1,menu2_sub2;
    private JMenuItem menuitem1,menuitem2,menuitem3,menuitem4;

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    private JCheckBox check1;

    public EjercicioN8 (){

        setLayout(null);

        menubar= new JMenuBar();
        setJMenuBar(menubar);

        menu1 = new JMenu("Archivo");
        menubar.add(menu1);

        submenu1 = new JMenu("Nuevo");
        menu1.add(submenu1);

        submenu2 = new JMenu("Opciones");
        menu1.add(submenu2);

        menuitem1 = new JMenuItem("600*400");
        submenu2.add(menuitem1);
        menuitem1.addActionListener(this);

        menuitem2 = new JMenuItem("300*400");
        submenu2.add(menuitem2);
        menuitem1.addActionListener(this);

        menuitem3 = new JMenuItem("Fondo Rojo");
        submenu1.add(menuitem3);
        menuitem3.addActionListener(this);

        menuitem4 = new JMenuItem("Fondo Azul");
        submenu1.add(menuitem4);
        menuitem4.addActionListener(this);


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
        if (e.getSource() == menuitem1 ) {
            setSize(600,400);

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
