import javax.swing.event.*;
import javax.swing.*;


public class EjercicioN10 extends JFrame implements ChangeListener {

    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup bg;

    public EjercicioN10(){
        setLayout(null);

        bg = new ButtonGroup();
        radio1 = new JRadioButton("600x400");
        radio1.setBounds(10,20,100,30);
        radio1.addChangeListener(this);
        add(radio1);
        bg.add(radio1);

        radio2 = new JRadioButton("800x600");
        radio2.setBounds(10,40,100,30);
        radio2.addChangeListener(this);
        add(radio2);
        bg.add(radio2);

        radio3 = new JRadioButton("1024x768");
        radio3.setBounds(10,60,100,30);
        radio3.addChangeListener(this);
        add(radio3);
        bg.add(radio3);

    }

    public void stateChanged(ChangeEvent e){
        if (radio1.isSelected()){
            setSize(640,480);
        }
        if (radio2.isSelected()){
            setSize(800,600);
        }
        if (radio3.isSelected()){
            setSize(1024,768);
        }
    }

    public static void main (String []args){
        EjercicioN10 ejercicioN10 = new EjercicioN10();
        ejercicioN10.setVisible(true);
        ejercicioN10.setBounds(0,0,350,230);
        ejercicioN10.setResizable(false);

    }
}

