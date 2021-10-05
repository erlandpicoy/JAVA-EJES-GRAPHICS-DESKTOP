import javax.swing.*;
import java.awt.event.*;

public class EjercicioN4 extends JFrame implements ActionListener{
    JLabel label1;
    JLabel label2;
    JButton button1;

    public EjercicioN4() {
        setLayout(null);
        label1 =new JLabel("Sergio la tenes adentro");
        label1.setBounds(10,20,200,20);
        label2 = new JLabel("Grega la tenes adentro");
        label2.setBounds(10,40,200,20);
        button1 = new JButton("Aceptar");
        button1.setBounds(10,60,200,20);
        button1.addActionListener(this);

        add(label1);
        add(label2);
        add(button1);

    }
    public static void main (String args []){
        EjercicioN4 formulario1 = new EjercicioN4();
        formulario1.setBounds(0,0,450,500);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button1){
            System.exit(0);
        }
    }
}
