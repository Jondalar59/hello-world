package hellogit;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class NewRegister extends JDialog {

    public NewRegister() {

        //Ventana de nuevo Registro
        //JDialog para el nuevo registro esta como falso para
        this.setVisible(false);                      // activarse con el boton correspondiente
        this.setLocation(400, 200);                    // con color de fondo y un panel para ingresar y acomodar
        this.setSize(new Dimension(400, 300));          // los elementos
        this.setResizable(false);
        JPanel registro = new JPanel();

        registro.setBackground(Prinicipal.azulbajo);

        registro.setLayout(null);

        //Interior de nuevo Registro
        JLabel Arete = new JLabel("N° de Arete");   //Label indica lo que se solicita
        Arete.setBounds(20, 10, 100, 20);
        registro.add(Arete);

        JTextField Aretetxt = new JTextField("");// text fiel para poder ingresar el numero de arete
        Aretetxt.setBounds(20, 50, 100, 20);
        registro.add(Aretetxt);

        JLabel peso = new JLabel("Peso del elemento");// label para pedir el peso
        peso.setBounds(20, 80, 150, 20);
        registro.add(peso);

        JTextField pesotxt = new JTextField("");// textField para poder ingresar el peso
        pesotxt.setBounds(20, 110, 100, 20);
        registro.add(pesotxt);

        JLabel raza = new JLabel("Raza");// label que pide ingresar la raz
        raza.setBounds(20, 140, 100, 20);
        registro.add(raza);

        JTextField razatxt = new JTextField("");//textField para poder ingresar la raza
        razatxt.setBounds(20, 170, 100, 20);
        registro.add(razatxt);

        JLabel sexoM = new JLabel("Macho");
        sexoM.setBounds(20, 200, 80, 20); //Labels para poder distinguir machos de  hembras
        registro.add(sexoM);

        JRadioButton JRadioButtonMacho = new JRadioButton("", true);
        JRadioButtonMacho.setBounds(30, 230, 20, 20);
        JRadioButtonMacho.setBackground(Prinicipal.azulbajo);
        registro.add(JRadioButtonMacho);

        JLabel sexoH = new JLabel("Hembra");
        sexoH.setBounds(120, 200, 80, 20);
        registro.add(sexoH);                        // RadioButtons para escojer el sexo

        JRadioButton hembra = new JRadioButton("", false);
        hembra.setBounds(140, 230, 20, 20);
        hembra.setBackground(Prinicipal.azulbajo);
        registro.add(hembra);

        ButtonGroup sexos = new ButtonGroup();  // ButtonGroup para que solo se pueda escojer uno de los dos sexos
        sexos.add(JRadioButtonMacho);
        sexos.add(hembra);

        JLabel nacimiento = new JLabel("Fecha de Nacimiento");// label que pide la fecha de nacimiento
        nacimiento.setBounds(200, 10, 150, 20);
        registro.add(nacimiento);

        JTextField nacimientotxt = new JTextField("");// textfield para poder ingresar la fecha de nacimiento
        nacimientotxt.setBounds(200, 50, 120, 20);
        registro.add(nacimientotxt);

        JButton ButtonSave = new JButton("Guardar");
        ButtonSave.setBounds(220, 180, 100, 40);
        this.add(ButtonSave);

        this.add(registro);  //agregado de todo a la ventana de Nuevo registro

    }

}
