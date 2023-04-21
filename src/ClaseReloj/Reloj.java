package ClaseReloj;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reloj extends JFrame implements ActionListener {
	
	 public static void main(String[] args) {
	        new Reloj();
	    }	
	
	 
    private JLabel labelTiempo;

    public Reloj() {
    	
        labelTiempo = new JLabel();
        add(labelTiempo);

        setTitle("Reloj");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(210, 80);  
        setLocationRelativeTo(null);
        setVisible(true);

        Timer timer = new Timer(1000, this); // intervalo de 1 segundo
        timer.start();
         
        
    }

    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        labelTiempo.setText(format.format(ahora));
    }

   
}
