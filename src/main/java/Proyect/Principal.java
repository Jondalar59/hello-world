package Proyect;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Jondalar
 */
public class Principal extends JFrame {

    public static Color azulbajo = new Color(36, 186, 194);
    public static Color fondo = new Color(101, 237, 124);

    public Principal() {
        super();

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
            icon = ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\main\\java\\Proyect\\vaca++.png"));
        } catch (IOException ex) {
            System.err.println("IMPOSIBLE ACCEDER AL RECURSO VACA++.PNG");
        }
        icon = new ImageIcon(icon).getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        JButton New = new JButton("Nuevo Registro", new ImageIcon(icon)); // Boton uno para registrar nuevo ganado
        New.setHorizontalTextPosition(SwingConstants.CENTER);
        New.setFont(new Font("Arial", Font.BOLD, 16));
        New.setForeground(Color.BLUE);
        New.setBounds(90, 90, 250, 250);
        base.add(New);

        New.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                NewRegister newRegister = new NewRegister();
                newRegister.setVisible(true);
            }
        });

        Image icon2 = null;
        try {
            icon2 = ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\main\\java\\Proyect\\vacaTT.png"));
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
            icon3 = ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\main\\java\\Proyect\\vaca--.png"));
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
                Sell sell = new Sell();
                sell.setVisible(true);
            }
        });

        this.add(base);//agregado del panel a Principal

    }

}
