package regForm;

import java.awt.*;
import javax.swing.*;
import java.util.*;
public class RegistrationForm extends JFrame{
	Container cp;
	JLabel lb1,lb2,lb3,lb4,lb5,lb6;
	JTextField tF1,tF2;
	JRadioButton rB1, rB2;
	JCheckBox cB1,cB2,cB3,cB4;
	JButton regbtn,resbtn;
	JComboBox cM;
	JList lt;
	
	public RegistrationForm()
	{
		cp=getContentPane();
		cp.setLayout(null);
		
		setVisible(true);
		setSize(500,300);
		setTitle("Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lb1= new JLabel("Full Name:");
		lb1.setFont(new Font("Arial", Font.BOLD,15));
		lb1.setForeground(Color.RED);
		lb1.setBounds(50, 50, 100, 30);
		cp.add(lb1);
		tF1= new JTextField(30);
		tF1.setBounds(170, 50, 300, 30);
		cp.add(tF1);
		
		lb2= new JLabel("Gender:");
		lb2.setFont(new Font("Arial", Font.BOLD,15));
		lb2.setForeground(Color.RED);
		lb2.setBounds(50,100,100,30);
		cp.add(lb2);
		rB1= new JRadioButton("Male");
		rB1.setBounds(170, 100, 100, 30);
		cp.add(rB1);
		rB2= new JRadioButton("Female");
		rB2.setBounds(320,100,100,30);
		cp.add(rB2);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(rB1);
		bg.add(rB2);
		
		lb3= new JLabel("Address:");
		lb3.setFont(new Font("Arial", Font.BOLD,15));
		lb3.setForeground(Color.RED);
		lb3.setBounds(50, 150, 100, 30);
		cp.add(lb3);
		tF2= new JTextField(30);
		tF2.setBounds(170,150,300,30);
		cp.add(tF2);
		
		lb4=new JLabel("City");
		lb4.setFont(new Font("Arial", Font.BOLD,15));
		lb4.setForeground(Color.RED);
		lb4.setBounds(50, 200, 100, 30);
		cp.add(lb4);
		cM= new JComboBox();
		cM.setBounds(170, 200, 100, 30);
		cM.addItem("Select");
		cM.addItem("Pune");
		cM.addItem("Surat");
		cM.addItem("Vadodra");
		cM.addItem("Delhi");
		cp.add(cM);
		
		lb5 = new JLabel("References:");
		lb5.setFont(new Font("Arial", Font.BOLD,15));
		lb5.setForeground(Color.RED);
		lb5.setBounds(50, 250, 100, 30);
		cp.add(lb5);
		
		Vector v = new Vector();
		v.add("Newspaper");v.add("TV");
		v.add("Social Media");v.add("Friends");
		lt=new JList(v);
		lt.setBounds(170, 250, 100, 90);
		cp.add(lt);
		
		lb6= new JLabel("Skills:");
		lb6.setFont(new Font("Arial", Font.BOLD,15));
		lb6.setForeground(Color.RED);
		lb6.setBounds(50, 350, 100, 30);
		cp.add(lb6);
		
		cB1= new JCheckBox("JAVA");
		cB2= new JCheckBox("PYTHON");
		cB3= new JCheckBox("C");
		cB4= new JCheckBox("C#");
		cB1.setBounds(50, 400, 100, 30);
		cB2.setBounds(150, 400, 100, 30);
		cB3.setBounds(250, 400, 100, 30);
		cB4.setBounds(350, 400, 100, 30);
		cp.add(cB1);
		cp.add(cB2);
		cp.add(cB3);
		cp.add(cB4);
		
		regbtn= new JButton("Register");
		resbtn= new JButton("Reset");
		regbtn.setBounds(100, 500, 100, 30);
		cp.add(regbtn);
		resbtn.setBounds(250, 500, 100, 30);
		cp.add(resbtn);
	}
	public static void main(String[] args) {
		RegistrationForm rF= new RegistrationForm();
	}

}
