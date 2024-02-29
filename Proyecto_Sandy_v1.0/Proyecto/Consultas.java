import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Consultas extends JFrame implements ActionListener{

private JLabel label1, label2, label3;
private JTextArea textarea1;
private JButton boton1;
private JMenuBar menuBar1;
private JMenu menu1;
private JMenuItem menuItem1, menuItem2;
String Name1="", Name2="", Race="", Consulta="";

public Consultas(){
setLayout(null);
setTitle("REGISTRAR CONSULTAS");
setDefaultCloseOperation(EXIT_ON_CLOSE);
menuBar1 = new JMenuBar ();
setJMenuBar(menuBar1);

menu1 =  new JMenu ("Opciones");
menuBar1.add(menu1);

menuItem1 = new JMenuItem("Actualizar datos");
menuItem2 = new JMenuItem("Ir Atrás");
menu1.add(menuItem1);
menuItem1.addActionListener(this);
menu1.add(menuItem2);
menuItem2.addActionListener(this);

getContentPane().setBackground(new Color(255,175,175));
setIconImage(new ImageIcon(getClass().getResource("images/icono-sp.png")).getImage());
Registro ventanaRegistro = new Registro();
Name1 = ventanaRegistro.txtName1;
Name2 = ventanaRegistro.txtName2;
Race = ventanaRegistro.txtRace;

label1 = new JLabel("Nombre/Dueño:  "+Name1);
label1.setBounds(50,10,250,30);
add(label1);

label2 = new JLabel("Nombre/Mascota:  "+Name2);
label2.setBounds(50,40,250,30);
add(label2);

label3 = new JLabel("Tipo/Raza:  "+Race);
label3.setBounds(50,70,250,30);
add(label3);

textarea1 = new JTextArea();
textarea1.setBounds(50,120,250,200);
add(textarea1);

boton1 = new JButton("Registrar Consulta");
boton1.setBounds(95,330,160,30);
boton1.addActionListener(this);
add(boton1);
}
public void actionPerformed(ActionEvent e){
if(e.getSource() == boton1){
Consulta = textarea1.getText().toUpperCase();

if(textarea1.equals("")){
JOptionPane.showInputDialog(null,"Ingrese la consulta por favor, casillero vacio");
}
else{
JOptionPane.showMessageDialog(null,"Datos Registrados"
                                   +"\n\n Nombre/Dueño: "+Name1
                                   +"\n Nombre/Mascota: "+Name2
                                   +"\n Tipo/Raza: "+Race
                                   +"\n Resumen: "+Consulta);
  }
 }
if(e.getSource() == menuItem1){
   textarea1.setText(null);
 }
if(e.getSource() == menuItem2){
  Registro registro1 = new Registro();
  registro1.setBounds(0,0,350,430);
  registro1.setVisible(true);
  registro1.setResizable(false);
  registro1.setLocationRelativeTo(null);
  this.setVisible(false);
}
}
public static void main(String args[]){
Consultas consultas1 = new Consultas();
consultas1.setBounds(0,0,370,450);
consultas1.setVisible(true);
consultas1.setResizable(false);
consultas1.setLocationRelativeTo(null);
 }
}