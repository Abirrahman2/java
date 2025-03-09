package CLASSES;
import Interfaces.*;
import FrameIntro.*;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class CustomerManagement extends JFrame implements ICustomerOperation,ActionListener,MouseListener{
private Customer customers[]=new Customer[50];
Customer c;
JPanel panel;
JLabel label,label2,label3,label4,label5,label6,label7,label8;
JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
JButton insertBtn,removeBtn,exitBtn,signout,searchBtn,backBtn;
public CustomerManagement(){
	super("CUSTOMER MANAGEMENT OPTION");
	this.setSize(850,730);
	this.setResizable(false);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	panel=new  JPanel();
	panel.setLayout(null);
	panel.setBackground(new Color(136,220,190));
	
	label8=new JLabel("CUSTOMER INFORMATION");
	label8.setBounds(200,0,400,100);
	label8.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,30));
	label8.setForeground(Color.ORANGE);
	panel.add(label8);
	
	
	label=new JLabel("Customer NAME");
	label.setBounds(50,100,150,40);
	panel.add(label);
	
	tf1=new JTextField("");
	tf1.setBounds(150,100,150,40);
	panel.add(tf1);
	
	
	label2=new JLabel("NID");
	label2.setBounds(50,180,150,40);
	panel.add(label2);
	
	tf2=new JTextField();
	tf2.setBounds(150,180,150,40);
	panel.add(tf2);
	
	label3=new JLabel("AGE");
	label3.setBounds(50,260,150,40);
	panel.add(label3);
	
	tf3=new JTextField();
	tf3.setBounds(150,260,150,40);
	panel.add(tf3);
	
	label4=new JLabel("MOBILENUM");
	label4.setBounds(50,330,150,40);
	panel.add(label4);
	
	tf4=new JTextField();
	tf4.setBounds(150,330,150,40);
	panel.add(tf4);
	
	label7=new JLabel("ACCOUNT:");
	label7.setBounds(50,400,150,40);
	panel.add(label7);
	
	tf7=new JTextField();
	tf7.setBounds(150,400,150,40);
	panel.add(tf7);
	
	
	
	insertBtn=new JButton("INSERT");
	insertBtn.setBounds(150,450,80,30);
	insertBtn.setFocusable(false);
	insertBtn.setBorder(null);
	insertBtn.addActionListener(this);
	insertBtn.addMouseListener(this);
	panel.add(insertBtn);
	
	label5=new JLabel("REMOVE CUSTOMER");
	label5.setBounds(400,100,170,40);
	panel.add(label5);
	
	tf5=new JTextField("");
	tf5.setBounds(530,100,150,40);
	panel.add(tf5);
	
	removeBtn=new JButton("REMOVE");
	removeBtn.setBounds(530,150,120,30);
	removeBtn.setFocusable(false);
	removeBtn.addActionListener(this);
	removeBtn.addMouseListener(this);
	panel.add(removeBtn);
	
	label6=new JLabel("SEARCH CUSTOMER");
	label6.setBounds(400,200,170,40);
	panel.add(label6);
	
	tf6=new JTextField("");
	tf6.setBounds(530,200,170,40);
	panel.add(tf6);
	
	searchBtn=new JButton("SEARCH");
	searchBtn.setBounds(530,260,120,30);
	searchBtn.setFocusable(false);
	searchBtn.addActionListener(this);
	searchBtn.addMouseListener(this);
	panel.add(searchBtn);
	
	
	
		
	exitBtn=new JButton("EXIT");
	exitBtn.setBounds(300,500,80,30);
	exitBtn.setFocusable(false);
	exitBtn.addActionListener(this);
	exitBtn.addMouseListener(this);
	panel.add(exitBtn);
	
	signout=new JButton("SIGNOUT");
	signout.setBounds(380,500,120,30);
	signout.setFocusable(false);
	signout.addActionListener(this);
	signout.addMouseListener(this);
	
	panel.add(signout);
	
	backBtn=new JButton("BACK");
	backBtn.setBounds(500,500,80,30);
	backBtn.setFocusable(false);
	backBtn.addActionListener(this);
	backBtn.addMouseListener(this);
	panel.add(backBtn);

	this.add(panel);
	
	
}

public void insertCustomer(String name)
{
	int flag=0;
	c=new Customer(name);	
for(int i=0;i<customers.length;i++)
{
	
	if(customers[i]==null)
	{
		customers[i]=c;
		flag=1;
		break;
	}
}
if(flag==1)
{
	showMessageDialog(null,"CUSTOMER INSERTED");
}
else
{
	showMessageDialog(null,"CAN NOT INSERTED.PLEASE CHECK AGAIN");
}

}

public void getCustomer(String name)
{
	Customer c1=null;
	try{
	for(int i=0;i<customers.length;i++)
	{
		if(customers[i]!=null)
		{
			if(customers[i].getName().equals(name))
			{
				c1=customers[i];
				break;
			}
		}
	}
	}
	catch(NullPointerException c)
	{
		System.out.println("CAN NOT FOUND CUSTOMER");
	}
	if(c1!=null)
	{
		showMessageDialog(null,"Customer founded!");
	}
	else
	{
		showMessageDialog(null,"Can not found customer");
	}
	
}





public void removeCustomer(String name)
{   
	int flag=0;
	try{
	for(int i=0;i<customers.length;i++)
	{
		if(customers[i].getName().equals(name))
		{
			customers[i]=null;
			flag=1;
			break;
		}
	}
	}
	catch(NullPointerException c){
		System.out.println("CAN NOT REMOVE CUSTOMER");
		c.printStackTrace();
	}	
	if(flag==1)
	{
		showMessageDialog(null,"Removed customer");
	}
	else{
		showMessageDialog(null,"Can not Removed");
	}
}
public void mouseClicked(MouseEvent me){}
public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}
public void mouseEntered(MouseEvent me){
	if(me.getSource()==insertBtn)
	{
		insertBtn.setBackground(Color.GREEN);
		insertBtn.setForeground(Color.YELLOW);
	}
	else if(me.getSource()==removeBtn)
	{
		removeBtn.setBackground(Color.ORANGE);
		removeBtn.setForeground(Color.YELLOW);
	}
	else if(me.getSource()==exitBtn)
	{
		exitBtn.setBackground(Color.YELLOW);
		exitBtn.setForeground(Color.RED);
	}
	
	else if(me.getSource()==signout)
	{
		signout.setBackground(Color.YELLOW);
		signout.setForeground(Color.RED);
	}
	else if(me.getSource()==searchBtn)
	{
		searchBtn.setBackground(Color.YELLOW);
		searchBtn.setForeground(Color.BLACK);
	}
	else if(me.getSource()==backBtn)
	{
		backBtn.setBackground(Color.BLUE);
		backBtn.setForeground(Color.RED);
	}
	
	
}
public void mouseExited(MouseEvent me){
if(me.getSource()==insertBtn)
{
	insertBtn.setBackground(Color.WHITE);
	insertBtn.setForeground(Color.BLACK);
	
}
else if(me.getSource()==removeBtn)
{
	removeBtn.setBackground(Color.WHITE);
	removeBtn.setForeground(Color.BLACK);
}
else if(me.getSource()==exitBtn)
{
	exitBtn.setBackground(Color.WHITE);
	exitBtn.setForeground(Color.BLACK);
	
}
else if(me.getSource()==signout)
{
	signout.setBackground(Color.WHITE);
	signout.setForeground(Color.BLACK);	
}

else if(me.getSource()==searchBtn)
{
   searchBtn.setBackground(Color.WHITE);
   searchBtn.setForeground(Color.BLACK);
}
else if(me.getSource()==backBtn)
{
	backBtn.setBackground(Color.WHITE);
	backBtn.setForeground(Color.BLACK);
}
}
public void actionPerformed(ActionEvent ae)
{
	String s1=tf1.getText();
	
	String s2=tf5.getText();
	String s3=tf6.getText();
	
	if(ae.getSource()==insertBtn)
	{
		insertCustomer(s1);
	}
	
	else if(ae.getSource()==removeBtn)
	{
		removeCustomer(s2);
	}
	
	else if(ae.getSource()==signout)
	{
		Login l=new Login();
		l.setVisible(true);
		this.setVisible(false);
	}
	else if(ae.getSource()==searchBtn)
	{
		getCustomer(s3);
	}
	else if(ae.getSource()==exitBtn)
	{
		System.exit(0);
	}
	else if(ae.getSource()==backBtn)
	{
		FirstFrame f=new FirstFrame();
		this.setVisible(false);
		f.setVisible(true);
	}
}
}