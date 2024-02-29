import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Registro extends JFrame implements ActionListener{

private JLabel label1, label2, label3, label4;
private JTextField textfield1, textfield2, textfield3;
private JButton boton1, boton2;
private JMenuBar menuBar1;
private JMenu menu1;
private JMenuItem menuItem1;
public static String txtName1="", txtName2="", txtRace="";

public Registro(){
setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setTitle("REGISTRO - Sandy PET");

menuBar1 = new JMenuBar ();
setJMenuBar(menuBar1);

menu1 =  new JMenu ("Opciones");
menuBar1.add(menu1);

menuItem1 = new JMenuItem("Actualizar datos");
menu1.add(menuItem1);
menuItem1.addActionListener(this);


getContentPane().setBackground(new Color(255,175,175));
setIconImage(new ImageIcon(getClass().getResource("images/icono-sp.png")).getImage());

ImageIcon imagen = new ImageIcon("images/logo-sp-jt.png");
label4 = new JLabel(imagen);
label4.setBounds(40,170,240,180);
add(label4);

label1 = new JLabel("Nombre/Dueño(a)");
label1.setBounds(40,10,100,30);
add(label1);

label2 = new JLabel("Nombre/Mascota");
label2.setBounds(40,40,100,30);
add(label2);

label3 = new JLabel("Tipo/Raza");
label3.setBounds(40,70,100,30);
add(label3);

textfield1 = new JTextField();
textfield1.setBounds(160,10,120,30);
add(textfield1);

textfield2 = new JTextField();
textfield2.setBounds(160,40,120,30);
add(textfield2);

textfield3 = new JTextField();
textfield3.setBounds(160,70,120,30);
add(textfield3);

boton1 = new JButton("CONSULTA");
boton1.setBounds(40,120,105,30);
boton1.addActionListener(this);
add(boton1);

boton2 = new JButton("GENERAR CITA");
boton2.setBounds(150,120,130,30);
boton2.addActionListener(this);
add(boton2);
}
public void actionPerformed(ActionEvent e){

if(e.getSource() == menuItem1){
   textfield1.setText(null);
   textfield2.setText(null);
   textfield3.setText(null);
 }
if(e.getSource()==boton1){

txtName1 = textfield1.getText().trim().toUpperCase();
txtName2 = textfield2.getText().trim().toUpperCase();
txtRace = textfield3.getText().trim().toUpperCase();

if(txtName1.equals("")){
JOptionPane.showMessageDialog(null,"Ingrese nombre del Dueño, porfavor");
}
if(txtName2.equals("")){
JOptionPane.showMessageDialog(null, "Ingrese nombre de la mascota, por favor");
}
if(txtRace.equals("")){
JOptionPane.showMessageDialog(null, "Ingrese la raza de la mascota, por favor");
}
else{
JOptionPane.showMessageDialog(null, "Abriendo la ventana de Consultas...");
Consultas consultas1 = new Consultas();
consultas1.setBounds(0,0,370,450);
consultas1.setVisible(true);
consultas1.setResizable(false);
consultas1.setLocationRelativeTo(null);
this.setVisible(false);
}
}
if(e.getSource()==boton2){

txtName1 = textfield1.getText().trim().toUpperCase();
txtName2 = textfield2.getText().trim().toUpperCase();
txtRace = textfield3.getText().trim().toUpperCase();

if(txtName1.equals("")){
JOptionPane.showMessageDialog(null,"Ingrese nombre del Dueño, porfavor");
}
if(txtName2.equals("")){
JOptionPane.showMessageDialog(null, "Ingrese nombre de la mascota, por favor");
}
if(txtRace.equals("")){
JOptionPane.showMessageDialog(null, "Ingrese la raza de la mascota, por favor");
}
else{
JOptionPane.showMessageDialog(null, "Abriendo la ventana de Citas...");
Citas citas1 = new Citas();
citas1.setBounds(0,0,370,450);
citas1.setVisible(true);
citas1.setResizable(false);
citas1.setLocationRelativeTo(null);
this.setVisible(false);
  }
 }
}
public static void main(String args[]){
Registro registro1 = new Registro();
registro1.setBounds(0,0,350,430);
registro1.setVisible(true);
registro1.setResizable(false);
registro1.setLocationRelativeTo(null);
}
}