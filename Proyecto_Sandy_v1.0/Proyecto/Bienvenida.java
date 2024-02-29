import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

  private JTextField textfield1;
  private JPasswordField jpwdfield1;
  private JLabel label1, label2, label3, label4, label5;
  private JButton boton1;

  public Bienvenida(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Bienvenido a Sandy PET");
    getContentPane().setBackground(new Color(255,175,175));
    setIconImage(new ImageIcon(getClass().getResource("images/icono-sp.png")).getImage());
    
    ImageIcon imagen = new ImageIcon("images/logo-sp-jt.png");
    label1 = new JLabel(imagen);
    label1.setBounds(40,10,255,180);
    add(label1);

    label2 = new JLabel("SANDY PET");
    label2.setBounds(100,190,300,30);
    label2.setFont(new Font("Andale Mono", 1, 25));
    label2.setForeground(new Color(255,255,255));
    add(label2);

    label3 = new JLabel("Ingrese su ID");
    label3.setBounds(40,212,200,30);
    label3.setFont(new Font("Andale Mono", 1, 12));
    label3.setForeground(new Color(255,255,255));
    add(label3);

    label5 = new JLabel("Ingrese su contraseña");
    label5.setBounds(40,265,200,30);
    label5.setFont(new Font("Andale Mono", 1, 12));
    label5.setForeground(new Color(255,255,255));
    add(label5);

    label4 = new JLabel("©Derechos Reservados por JTaboada");
    label4.setBounds(65,375,300,30);
    label4.setFont(new Font("Andale Mono", 1, 12));
    label4.setForeground(new Color(255,255,255));
    add(label4);

    textfield1 = new JTextField ();
    textfield1.setBounds(40,240,255,25);
    textfield1.setBackground(new Color(224,224,224));
    textfield1.setFont(new Font("Andale Mono", 1, 14));
    textfield1.setForeground(new Color(0,0,255));
    add(textfield1);
    
    jpwdfield1 = new JPasswordField ();
    jpwdfield1.setBounds(40,295,255,25);
    jpwdfield1.setEchoChar('\u25cf');
    jpwdfield1.setBackground(new Color(224,224,224));
    jpwdfield1.setFont(new Font("Andale Mono", 1, 14));
    jpwdfield1.setForeground(new Color(0,0,255));
    add(jpwdfield1);

    boton1 = new JButton("Ingresar");
    boton1.setBounds(120,335,100,30);
    boton1.setBackground(new Color(255,255,255));
    boton1.setFont(new Font("Andale Mono", 1, 14));
    boton1.setForeground(new Color(255,0,0));
    boton1.addActionListener(this);
    add(boton1);
  }


   public void actionPerformed(ActionEvent e){
     if(e.getSource() == boton1){
      if(textfield1.getText().equalsIgnoreCase("TEST") && jpwdfield1.getText().equals("123456")){
       
        Registro registro1 = new Registro();
        registro1.setBounds(0,0,350,430);
        registro1.setVisible(true);
        registro1.setResizable(false);
        registro1.setLocationRelativeTo(null);
        this.setVisible(false);
      }
      else if(textfield1.getText().equalsIgnoreCase("JTABOADA") && jpwdfield1.getText().equals("74381697")){
       
        Registro registro1 = new Registro();
        registro1.setBounds(0,0,350,430);
        registro1.setVisible(true);
        registro1.setResizable(false);
        registro1.setLocationRelativeTo(null);
        this.setVisible(false);
      }else{
       JOptionPane.showMessageDialog(null,"Id y/o Contraseña Incorrecta");
      }
     }
    }

   public static void main(String args[]){
     Bienvenida ventanabienvenida = new Bienvenida();
     ventanabienvenida.setBounds(0,0,350,450);
     ventanabienvenida.setVisible(true);
     ventanabienvenida.setResizable(false);
     ventanabienvenida.setLocationRelativeTo(null);
   }
}