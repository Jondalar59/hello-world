/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogit;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Jondalar
 */
public class Prinicipal extends JFrame {

    public Prinicipal() {
        super();
        //Ventana de nuevo Registro
        JDialog nuevo_Registro = new JDialog();              //JDialog para el nuevo registro esta como falso para
        nuevo_Registro.setVisible(false);                      // activarse con el boton correspondiente
        nuevo_Registro.setLocation(400, 200);                    // con color de fondo y un panel para ingresar y acomodar
        nuevo_Registro.setSize(new Dimension(400, 300));          // los elementos
        nuevo_Registro.setResizable(false);
        JPanel registro = new JPanel();
        Color azulbajo = new Color(36, 186, 194);
        Color fondo = new Color(101, 237, 124);
        registro.setBackground(azulbajo);

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
        JRadioButtonMacho.setBackground(azulbajo);
        registro.add(JRadioButtonMacho);

        JLabel sexoH = new JLabel("Hembra");
        sexoH.setBounds(120, 200, 80, 20);
        registro.add(sexoH);                        // RadioButtons para escojer el sexo

        JRadioButton hembra = new JRadioButton("", false);
        hembra.setBounds(140, 230, 20, 20);
        hembra.setBackground(azulbajo);
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

        nuevo_Registro.add(registro);  //agregado de todo a la ventana de Nuevo registro

        //Ventana de Venta
        JDialog Venta = new JDialog();              //JDialog para registrar la venta o muerte esta como falso para
        Venta.setVisible(false);                      // activarse con el boton correspondiente
        Venta.setLocation(400, 200);                    // con color de fondo y un panel para ingresar y acomodar
        Venta.setSize(new Dimension(200, 200));          // los elementos
        Venta.setResizable(false);
        JPanel registroV = new JPanel();
        registroV.setBackground(azulbajo);

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
        venderbtn.setBackground(azulbajo);

        JLabel muerte = new JLabel("Muerte");
        muerte.setBounds(120, 80, 80, 20);
        registroV.add(muerte);                        // RadioButtons para escojer el motibo de la baja

        JRadioButton muertebtn = new JRadioButton("", false);
        muertebtn.setBounds(140, 120, 20, 20);

        muertebtn.setBackground(azulbajo);
        registroV.add(muertebtn);

        ButtonGroup disminucion = new ButtonGroup();  // ButtonGroup para que solo se pueda escojer uno de los dos sexos
        disminucion.add(muertebtn);
        disminucion.add(venderbtn);

        Venta.add(registroV);  // agregado de todo

        //Ventana Principal
        this.setSize(new Dimension(700, 700));
        this.setResizable(false);
        this.setVisible(false);
        this.setLocationRelativeTo(null);// La ventana aparece en el centro de la pantalla
        JPanel base = new JPanel();   // Panel Base donde estan acomodados los botones
        base.setBackground(fondo);

        base.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Interior de la Ventana
        Image icon = null;
        try {
            icon = ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\hellogit\\vaca++.png"));
        } catch (IOException ex) {
            System.err.println("IMPOSIBLE ACCEDER AL RECURSO VACA++.PNG");
        }
        icon = new ImageIcon(icon).getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        JButton Nuevo_registro = new JButton("Nuevo Registro", new ImageIcon(icon)); // Boton uno para registrar nuevo ganado
        Nuevo_registro.setHorizontalTextPosition(SwingConstants.CENTER);
        Nuevo_registro.setFont(new Font("Arial", Font.BOLD, 16));
        Nuevo_registro.setForeground(Color.BLUE);
        Nuevo_registro.setBounds(90, 90, 250, 250);
        base.add(Nuevo_registro);
        Nuevo_registro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nuevo_Registro.setVisible(true);
            }
        });

        Image icon2 = null;
        try {
            icon2 = ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\hellogit\\vacaTT.png"));
        } catch (IOException ex) {
            System.err.println("IMPOSIBLE ACCEDER AL RECURSO VACATT.PNG");
        }
        icon2 = new ImageIcon(icon2).getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        JButton Total = new JButton("Registro Total", new ImageIcon(icon2)); //Boton dos para acceder al registro Total
        Total.setHorizontalTextPosition(SwingConstants.CENTER);
        Total.setFont(new Font("Arial", Font.BOLD, 16));
        Total.setForeground(Color.BLUE);
        Total.setBounds(360, 90, 250, 250);
        base.add(Total);

        Image icon3 = null;
        try {
            icon3 = ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\hellogit\\vaca--.png"));
        } catch (IOException ex) {
            System.err.println("IMPOSIBLE ACCEDER AL RECURSO VACA--.PNG");
        }
        icon3 = new ImageIcon(icon3).getImage().getScaledInstance(260, 250, Image.SCALE_DEFAULT);
        JButton Registrar_perdida = new JButton("Registrar Venta o Deceso", new ImageIcon(icon3)); //Boton tres para registrar la venta o la muerte de una vaca
        Registrar_perdida.setHorizontalTextPosition(SwingConstants.CENTER);
        Registrar_perdida.setBounds(90, 360, 520, 250);
        Registrar_perdida.setFont(new Font("Arial", Font.BOLD, 30));
        Registrar_perdida.setForeground(Color.BLUE);
        base.add(Registrar_perdida);
        Registrar_perdida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent VM) {
                Venta.setVisible(true);
            }
        });

        this.add(base);//agregado del panel a Principal

        //Login para activar la ventana principal
        JDialog Login = new JDialog(this, "Login", false); //JDialog para hacer el Login que permite la entrada
        Login.setSize(300, 250);
        Login.setVisible(true);
        Login.setLocationRelativeTo(null);// La ventana aparece en el centro de la pantalla
        Login.setResizable(false);
        Container contenedor = Login.getContentPane();// crea el contenedor para la ventana
        contenedor.setLayout(null);     //da el contenedor hacia abajo
        Login.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        Login.setModal(true);

        //Interior de la entrada
        JLabel bienvenido = new JLabel("Bienvenido");   // JLabel para poner el bienvenido
        bienvenido.setBounds(100, 0, 100, 20);
        contenedor.add(bienvenido);// lo agrega a la ventana
        bienvenido.setFont(new Font("Arial", Font.BOLD, 18));//caracteristicas de la letra
        bienvenido.setForeground(Color.blue);// color de la letra

        JLabel iniciar = new JLabel("Iniciar Sesión"); //JLabel que dice inicio de sesion
        iniciar.setBounds(95, 30, 130, 20);
        contenedor.add(iniciar);
        iniciar.setFont(new Font("Arial", Font.BOLD, 16));
        iniciar.setForeground(Color.BLACK);

        JLabel usuario = new JLabel("Usuario:");  //Jlabel que dice que pide tu usuario
        usuario.setBounds(120, 60, 100, 20);
        contenedor.add(usuario);
        usuario.setFont(new Font("Arial", Font.PLAIN, 16));

        JTextField usuariotxt = new JTextField(""); // JText registra tu usuario para comparar con el autorizado
        usuariotxt.setBounds(80, 80, 140, 20);
        contenedor.add(usuariotxt);
        usuariotxt.setFont(new Font("Arial", Font.PLAIN, 12));

        JLabel contraseña = new JLabel("Contraseña:");//Jlabel pide que ingreses la contraseña
        contenedor.add(contraseña);
        contraseña.setBounds(110, 110, 110, 20);
        contraseña.setFont(new Font("Arial", Font.PLAIN, 16));

        JPasswordField contraseñatxt = new JPasswordField("");// JPassword registra tu contraseña para comparar
        contraseñatxt.setBounds(80, 130, 140, 20);
        contenedor.add(contraseñatxt);
        contraseñatxt.setFont(new Font("Arial", Font.PLAIN, 12));

        JButton iniciarbtn = new JButton("Entrar"); //Es el boton que valida la información y permite activar la otra pantalla
        iniciarbtn.setBounds(100, 160, 100, 20);
        contenedor.add(iniciarbtn);
        iniciarbtn.setFont(new Font("Arial", Font.PLAIN, 16));
        iniciarbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String usuario = "admin";
                String Clave = "admin";
                String texto = usuariotxt.getText();
                char[] clave = contraseñatxt.getPassword();
                String claveString = new String(clave);

                if (texto.equals(usuario) && claveString.equals(Clave)) {
                    this.setVisible(true);
                    Login.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
                    return;
                }

            }

        });
    }

}
