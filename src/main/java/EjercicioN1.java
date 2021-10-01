import javax.swing.*;
import java.text.Normalizer;

public class EjercicioN1 extends JFrame {
    private JLabel label1;
    public EjercicioN1(){
        setLayout(null);
        label1 = new JLabel("A la grande le puse cuca");
        label1.setBounds(0,0,400,500);
        add(label1);
    }
    public static void main (String args []){
        EjercicioN1 formulario1 = new EjercicioN1();
        formulario1.setBounds(0,0,400,300);
        formulario1.setVisible(true);
        formulario1.setLocation(null);
    }
}
