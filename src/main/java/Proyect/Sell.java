package Proyect;

import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Jondalar
 */
public class Sell extends JDialog {

    public Sell() {
        //Ventana de Venta
        //JDialog para registrar la venta o muerte esta como falso para
        this.setVisible(false);                      // activarse con el boton correspondiente
        this.setLocation(420, 250);                    // con color de fondo y un panel para ingresar y acomodar
        this.setSize(new Dimension(200, 200));          // los elementos
        this.setResizable(false);
        JPanel registroV = new JPanel();
        registroV.setBackground(Principal.azulbajo);

        registroV.setLayout(null);

        //Interior de Venta
        JLabel AreteV = new JLabel("N° de Arete");   //Label indica lo que se solicita
        AreteV.setBounds(20, 10, 100, 20);
        registroV.add(AreteV);

        JTextField AreteVtxt = new JTextField("");// text fiel para poder ingresar el numero de arete
        AreteVtxt.setBounds(20, 50, 100, 20);
        registroV.add(AreteVtxt);

        JLabel vender = new JLabel("Venta");
        vender.setBounds(20, 80, 80, 20); //Labels para poder distinguir Venta de muete
        registroV.add(vender);

        JRadioButton venderbtn = new JRadioButton("", true);
        venderbtn.setBounds(30, 120, 20, 20);
        registroV.add(venderbtn);
        venderbtn.setBackground(Principal.azulbajo);

        JLabel muerte = new JLabel("Muerte");
        muerte.setBounds(120, 80, 80, 20);
        registroV.add(muerte);                        // RadioButtons para escojer el motibo de la baja

        JRadioButton muertebtn = new JRadioButton("", false);
        muertebtn.setBounds(140, 120, 20, 20);

        muertebtn.setBackground(Principal.azulbajo);
        registroV.add(muertebtn);

        ButtonGroup disminucion = new ButtonGroup();  // ButtonGroup para que solo se pueda escojer uno de los dos sexos
        disminucion.add(muertebtn);
        disminucion.add(venderbtn);

        JButton ButtonSave = new JButton("Guardar");
        ButtonSave.setBounds(60, 140, 90, 20);
        registroV.add(ButtonSave);

        this.add(registroV);  // agregado de todo

    }

}
