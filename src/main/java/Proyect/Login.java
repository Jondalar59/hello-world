package Proyect;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Jondalar
 */
public class Login extends JDialog {

    public Login() {

        //Login para activar la ventana principal
        this.setSize(300, 250);
        this.setVisible(true);
        this.setLocationRelativeTo(null);// La ventana aparece en el centro de la pantalla
        this.setResizable(false);
        Container contenedor = this.getContentPane();// crea el contenedor para la ventana
        contenedor.setLayout(null);     //da el contenedor hacia abajo
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setModal(true);

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
        Login temp = this;
        iniciarbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String usuario = "admin";
                String Clave = "admin";
                String texto = usuariotxt.getText();
                char[] clave = contraseñatxt.getPassword();
                String claveString = new String(clave);

                if (texto.equals(usuario) && claveString.equals(Clave)) {
                    Principal principal = new Principal();
                    principal.setVisible(true);
                    temp.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
                    return;
                }

            }

        });

    }
}
