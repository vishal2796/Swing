package productApp;
import java.awt.*;
import javax.swing.*;
public class ProductApp extends JFrame{
	
	Container cp;
	JLabel pc,pn,pr;
	JTextField pctf,pntf,prtf;
	JButton save,load,update,delete,reset;
	JPanel p1,p2;
	
	public ProductApp()
	{
		cp=getContentPane();
		cp.setLayout(new BorderLayout());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setTitle("Products Application");
		
		pc= new JLabel("Product Code:");
		pctf= new JTextField(20);
		pn= new JLabel("Product  Name:");
		pntf= new JTextField(20);
		pr= new JLabel("Price:");
		prtf= new JTextField(20);
		save= new JButton("Save");
		load= new JButton("Load");
		update= new JButton("Update");
		delete= new JButton("Delete");
		reset=new JButton("Reset");
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(3,2,20,20));
		p1.add(pc);p1.add(pctf);
		p1.add(pn);p1.add(pntf);
		p1.add(pr);p1.add(prtf);
		
		p2=new JPanel();
		p2.setLayout(new FlowLayout());
		p2.add(save);p2.add(load);p2.add(update);p2.add(delete);p2.add(reset);
		
		cp.add(p1,"Center");
		cp.add(p2,"South");
		
	}

		public static void main(String[] args) {
			ProductApp p= new ProductApp();
		}
}
