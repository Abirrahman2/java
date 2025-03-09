package CLASSES;
import Interfaces.*;
import FrameIntro.*;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class EmployeeManagement extends JFrame implements IEmployeeOperation,ActionListener,MouseListener{
private Employee employees[]=new Employee[20];
Employee e;
JPanel panel;
JLabel label1,label2,label3,label4,label5,label6;
JTextField tf1,tf2,tf3,tf4,tf5,tf6;
JButton insertBtn,removeBtn,exitBtn,signout,searchBtn,backBtn;
public EmployeeManagement(){
	super("EMPLOYEE MANAGEMENT");
	this.setSize(800,800);
	this.setResizable(false);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel=new JPanel();
	panel.setLayout(null);
	
	panel.setBackground(new Color(236,220,190));
	
	label6=new JLabel("EMPLOYEE INFORMATION");
	label6.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,30));
	label6.setBounds(200,0,400,100);
	label6.setForeground(Color.ORANGE);
	panel.add(label6);
	
	label1=new JLabel("Employee Name");
	label1.setBounds(50,150,150,40);
	panel.add(label1);
	
	tf1=new JTextField();
	tf1.setBounds(150,150,150,40);
	panel.add(tf1);
	
	label2=new JLabel("Employee ID");
	label2.setBounds(50,220,150,40);
	panel.add(label2);
	
	tf2=new JTextField();
	tf2.setBounds(150,220,150,40);
	panel.add(tf2);
	
	label3=new JLabel("Account number");
	label3.setBounds(50,290,170,40);
	panel.add(label3);
	
	tf3=new JTextField();
	tf3.setBounds(150,290,150,40);
	panel.add(tf3);
	
	insertBtn=new JButton("INSERT");
	insertBtn.setBounds(150,340,80,30);
	insertBtn.setFocusable(false);
	insertBtn.addActionListener(this);
	insertBtn.addMouseListener(this);
	panel.add(insertBtn);
	
	label4=new JLabel("Remove Employee");
    label4.setBounds(400,100,150,40);
    panel.add(label4);

    tf4=new JTextField("");
    tf4.setBounds(580,100,150,40);
	panel.add(tf4);
	
	removeBtn=new JButton("REMOVE");
	removeBtn.setBounds(580,150,120,30);
	removeBtn.setFocusable(false);
	removeBtn.addActionListener(this);
	removeBtn.addMouseListener(this);
	panel.add(removeBtn);
	
	label5=new JLabel("SEARCH EMPLOYEE");
	label5.setBounds(400,200,170,40);
	panel.add(label5);
	
	tf6=new JTextField("");
	tf6.setBounds(580,200,170,40);
	panel.add(tf6);
	
	searchBtn=new JButton("SEARCH");
	searchBtn.setBounds(580,250,120,30);
	searchBtn.setFocusable(false);
	searchBtn.addActionListener(this);
	searchBtn.addMouseListener(this);
	panel.add(searchBtn);
	
		
	exitBtn=new JButton("EXIT");
	exitBtn.setBounds(320,500,80,30);
	exitBtn.setFocusable(false);
	exitBtn.addActionListener(this);
	exitBtn.addMouseListener(this);
	panel.add(exitBtn);
	
	signout=new JButton("SIGNOUT");
	signout.setBounds(400,500,120,30);
	signout.setFocusable(false);
	signout.addActionListener(this);
	signout.addMouseListener(this);
	
	
	panel.add(signout);
	
	backBtn=new JButton("BACK");
	backBtn.setBounds(520,500,80,30);
	backBtn.setFocusable(false);
	backBtn.addActionListener(this);
	backBtn.addMouseListener(this);
	panel.add(backBtn);
	
	this.add(panel);

}

public void insertEmployee(String empId)
{
	int flag=0;
	e=new Employee(empId);
	for(int i=0;i<employees.length;i++)
	{
		if(employees[i]==null)
		{
			employees[i]=e;
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		showMessageDialog(null,"Employee Inserted");
	}
	else
	{
		showMessageDialog(null,"Sorry can not inserted");
	}
}
public void removeEmployee(String empId)
{
	int flag=0;
	try{
	for(int i=0;i<employees.length;i++)
	{
		if(employees[i].getEmpId().equals(empId))
		{
			employees[i]=null;
			flag=1;
			break;
		}
	}
	}
	catch(NullPointerException n)
	{
		System.out.println("CAN NOT REMOVE EMPLOYEE");
	}
	if(flag==1)
	{
		showMessageDialog(null,"Removed employee");
	}
	else
	{
		showMessageDialog(null,"CAN NOT REMOVED");
	}
		
}

public void getEmployee(String empId)
{
	Employee e=null;
	try{
	for(int i=0;i<employees.length;i++)
	{
		if(employees[i]!=null)
		{
			if(employees[i].getEmpId().equals(empId))
			{
				e=employees[i];
				break;
			}
		}
	}
	}
	catch(NullPointerException c)
	{
		System.out.println("CAN NOT FOUND EMPLOYEE");
	}
	if(e!=null)
	{
		showMessageDialog(null,"Employee founded!");
	}
	else
	{
		showMessageDialog(null,"Can not found employee!");
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
	String s1=tf2.getText();
	String s2=tf4.getText();
	String s3=tf6.getText();
	
	if(ae.getSource()==insertBtn)
	{
		insertEmployee(s1);
	}
	else if(ae.getSource()==removeBtn)
	{
		removeEmployee(s2);
	}
	else if(ae.getSource()==searchBtn)
	{
		getEmployee(s3);
	}
	else if(ae.getSource()==signout)
	{
		
		Login l=new Login();
		this.setVisible(false);
		l.setVisible(true);
	}
	else if(ae.getSource()==backBtn)
	{
		FirstFrame f=new FirstFrame();
		this.setVisible(false);
		f.setVisible(true);
	}
}
}