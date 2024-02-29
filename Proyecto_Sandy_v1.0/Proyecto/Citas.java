import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Citas extends JFrame implements ActionListener{

private JLabel label1, label2, label3, label4, label5;
private JTextArea textarea1;
private JComboBox combo1_dia, combo2_mes, combo3_año;
private JButton boton1;
private JMenuBar menuBar1;
private JMenu menu1;
private JMenuItem menuItem1, menuItem2;

String Name1="", Name2="", Race="", Citas="", comboMes="";
int a = 0 , comboDia=0, comboAño=0;

public Citas(){
setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setTitle("Registrar Citas - Sandy PET");

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
textarea1.setBounds(50,120,255,80);
add(textarea1);

label4 = new JLabel("Fecha");
label4.setBounds(50,210,120,30);
add(label4);

label5 = new JLabel("Resolución");
label5.setBounds(145,95,100,30);
add(label5);

combo1_dia = new JComboBox ();
combo1_dia.setBounds(50,245,40,30);
add(combo1_dia);

for(a=1;a<=31;a++){
combo1_dia.addItem(a);
}

combo2_mes = new JComboBox ();
combo2_mes.setBounds(100,245,105,30);
add(combo2_mes);

combo2_mes.addItem("ENERO");
combo2_mes.addItem("FEBRERO");
combo2_mes.addItem("MARZO");
combo2_mes.addItem("ABRIL");
combo2_mes.addItem("MAYO");
combo2_mes.addItem("JUNIO");
combo2_mes.addItem("JULIO");
combo2_mes.addItem("AGOSTO");
combo2_mes.addItem("SEPTIEMBRE");
combo2_mes.addItem("OCTUBRE");
combo2_mes.addItem("NOVIEMBRE");
combo2_mes.addItem("DICIEMBRE");

combo3_año = new JComboBox();
combo3_año.setBounds(215,245,90,30);
add(combo3_año);

for(a=2024;a<=2030;a++){
combo3_año.addItem(a);
}

boton1 = new JButton("Registrar Cita");
boton1.setBounds(95,330,160,30);
boton1.addActionListener(this);
add(boton1);
}
public void actionPerformed(ActionEvent e){
if(e.getSource() == boton1){
Citas = textarea1.getText().toUpperCase();
comboDia = (int)combo1_dia.getSelectedItem();
comboMes = (String)combo2_mes.getSelectedItem();
comboAño = (int)combo3_año.getSelectedItem();

if(Citas.equals("")){
JOptionPane.showMessageDialog(null, "Ingrese informacion en el campo de resolución");
}
else{
JOptionPane.showMessageDialog(null,"Datos Registrados"
                                   +"\n\n Nombre/Dueño:  "+Name1
                                   +"\n Nombre/Mascota:  "+Name2
                                   +"\n Tipo/Raza:  "+Race
                                   +"\n\n--------Fecha de Cita-------"
                                   +"\n Día: "+comboDia+" Mes: "+comboMes+" Año: "+comboAño
                                   +"\n Resolución:  "+Citas);
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
Citas citas1 = new Citas();
citas1.setBounds(0,0,370,450);
citas1.setVisible(true);
citas1.setResizable(false);
citas1.setLocationRelativeTo(null);
 }
}