import javax.swing.*;

public class EjercicioN2 extends JFrame {
    private JLabel label1;

    public EjercicioN2() {
        setLayout(null);
    }
    public static void main (String args []){
        EjercicioN2 formulario1 = new EjercicioN2();
        formulario1.setBounds(700,300,450,500);
        formulario1.setVisible(true);
        formulario1.setLocation(null);
        formulario1.setResizable(false);
    }
}
