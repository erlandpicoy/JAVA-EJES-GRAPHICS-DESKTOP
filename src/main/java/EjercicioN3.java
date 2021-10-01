import javax.swing.*;

public class EjercicioN3 extends JFrame {
    private JLabel label1;
    private JLabel label2;

    public EjercicioN3() {
        setLayout(null);
        label1 =new JLabel("Sergio la tenes adentro");
        label1.setBounds(10,20,200,20);
        label2 = new JLabel("Grega la tenes adentro");
        label2.setBounds(10,40,200,20);
        add(label1);
        add(label2);

    }
    public static void main (String args []){
        EjercicioN3 formulario1 = new EjercicioN3();
        formulario1.setBounds(700,300,450,500);
        formulario1.setVisible(true);
        formulario1.setLocation(null);
        formulario1.setResizable(false);
    }
}
