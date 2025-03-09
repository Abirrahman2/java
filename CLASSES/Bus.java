package CLASSES;
import Interfaces.*;
import FrameIntro.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class Bus extends JFrame implements IticeketOperation,ActionListener{
	
	private Ticket tickets[]=new Ticket[40];
	private String busType;
    private String busNum;
    Ticket t;
	JComboBox combo2;
    JRadioButton r1,r2;
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    JButton btn1,btn2,backBtn,signOut,payment;
    ButtonGroup btg;
    JPanel panel;
public Bus(){
	super("TICKET BOOKING");
	this.setSize(800,600);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	panel=new JPanel();
	panel.setLayout(null);
	panel.setBackground(new Color(229,204,255));
	
	label1=new JLabel("BUS TYPE");
	label1.setBounds(50,0,100,30);
	
	panel.add(label1);
	
	
	
	r1=new JRadioButton("AC BUS");
	r1.setBounds(50,40,100,30);
	panel.add(r1);
	
	btg=new ButtonGroup();
	btg.add(r1);
	btg.add(r2);

	r2=new JRadioButton("NON-AC BUS");
	r2.setBounds(50,80,110,30);
	panel.add(r2);
	
	btg=new ButtonGroup();
	btg.add(r1);
	btg.add(r2);
	
	label2=new JLabel("FROM:");
	label2.setBounds(50,120,120,30);
	panel.add(label2);
	
	tf1=new JTextField();
	tf1.setBounds(100,120,120,30);
	panel.add(tf1);
	
	label3=new JLabel("TO:");
	label3.setBounds(50,150,120,30);
	panel.add(label3);
	
	tf2=new JTextField();
	tf2.setBounds(100,150,120,30);
	panel.add(tf2);
	
	label4=new JLabel("SEAT NO:");
	label4.setBounds(300,0,120,30);
	panel.add(label4);
	
	tf6=new JTextField();
	tf6.setBounds(300,50,100,30);
	panel.add(tf6);
	
	
	
	label9=new JLabel("SEAT NUMBER");
	label9.setBounds(300,100,120,30);
	panel.add(label9);
	
	String items2[]={"01","02","03","04"};
	combo2=new JComboBox(items2);
	combo2.setBounds(300,150,100,30);
	panel.add(combo2);
	
	label7=new JLabel();
	label7.setBounds(200,320,80,30);
	label7.setFont(new Font("Serif",Font.ITALIC,17));
	panel.add(label7);
	
	label8=new JLabel("TOTAL PRICE:");
	label8.setBounds(50,320,140,30);
	label8.setFont(new Font("Serif",Font.BOLD,17));
	label8.setForeground(Color.RED);
	panel.add(label8);
	
	
	label5=new JLabel("TICKET NO");
	label5.setBounds(50,200,120,30);
	panel.add(label5);
	
	tf3=new JTextField();
	tf3.setBounds(120,200,120,30);
	panel.add(tf3);
	
	btn1=new JButton("INSERT TICKET");
	btn1.setBounds(80,240,140,30);
	btn1.setFocusable(false);
	btn1.addActionListener(this);
	panel.add(btn1);
	
	label6=new JLabel("CANCEL TICKET");
	label6.setBounds(450,50,140,30);
	panel.add(label6);
	
	tf4=new JTextField();
	tf4.setBounds(550,50,120,30);
	panel.add(tf4);
	
	btn2=new JButton("CANCEL");
	btn2.setBounds(550,100,100,30);
	btn2.addActionListener(this);
	panel.add(btn2);
	
	backBtn=new JButton("BACK");
	backBtn.setBounds(400,390,100,30);
	backBtn.setFocusable(true);
	backBtn.addActionListener(this);
	panel.add(backBtn);
	
	signOut=new JButton("SIGN OUT");
	signOut.setBounds(500,390,120,30);
	signOut.setFocusable(false);
	signOut.addActionListener(this);
	panel.add(signOut);
	
	payment=new JButton("PAYMENT");
	payment.setBounds(50,390,100,30);
	payment.setFocusable(false);
	payment.addActionListener(this);
	panel.add(payment);
	
	tf5=new JTextField();
	tf5.setBounds(200,390,100,30);
	panel.add(tf5);
	
	this.add(panel);
	
	
}
public void setBusNum(String busNum)
{
	this.busNum=busNum;
}
public String getBusNum()
{
	return busNum;
}



public void ticketInsert(String ticketNo){
	t=new Ticket(ticketNo);
	int flag=0;
for(int i=0;i<tickets.length;i++)
{
	
	if(tickets[i]==null)
	{
		tickets[i]=t;
		flag=1;
		
		break;
	}
	
}
if(flag==1)
{
	showMessageDialog(null,"TICKET INSERTED");
	
	
}
else 
{
showMessageDialog(null,"CAN NOT INSERTED");
}
}
public void ticketRemove(String ticketNo){
	int flag=0;
	for(int i=0;i<tickets.length;i++)
	{
		if(tickets[i].getTicketNo().equals(ticketNo)){
			tickets[i]=null;
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		showMessageDialog(null,"CANCELED");
	}
	else{
	   showMessageDialog(null,"CAN NOT CANCELED");
}
}

public void actionPerformed(ActionEvent ae){
	String s1=tf3.getText();
	String s2=tf4.getText();
	String s3=tf5.getText();
	if(ae.getSource()==btn1)
	{
		ticketInsert(s1);
		if(r1.isSelected())
		{
			int a=700;
			int b=combo2.getSelectedIndex();
			int sum=a*(b+1);
			label7.setText(String.valueOf(sum));
			
		}
		else if(r2.isSelected())
		{
			int a=500;
			int b=combo2.getSelectedIndex();
			int sum=a*(b+1);
			label7.setText(String.valueOf(sum));
		}
		
	}
    else if(ae.getSource()==btn2)
	{
		ticketRemove(s2);
		label7.setText(null);
	}
	else if(ae.getSource()==backBtn)
	{
		Thirdframe tf=new Thirdframe();
		this.setVisible(false);
		tf.setVisible(true);
		
	}
	else if(ae.getSource()==signOut)
	{
		Login l=new Login();
		this.setVisible(false);
		l.setVisible(true);
	}
	else if(ae.getSource()==payment)
	{
		String p1="";
		String p2=tf3.getText();
		
		String p3=tf6.getText();
		
		
		
		String p4=tf1.getText();
		String p5=tf2.getText();
         
		
		if(r1.isSelected())
		{
			p1=r1.getText();
		}
		else if(r2.isSelected())
		{
			p1=r2.getText();
		}
		if(r1.isSelected())
		{
			if(label7.getText().equals(tf5.getText()))
			{
			FourthFrame f=new FourthFrame(p1,p2,p3,p4,p5,this);
			this.setVisible(false);
			f.setVisible(true);
			}
			else
			{
				showMessageDialog(null,"PLEASE PAY CAREFULLY");
			}
		}
		else if(r2.isSelected())
		{
			if(label7.getText().equals(tf5.getText()))
			{
				FourthFrame f=new FourthFrame(p1,p2,p3,p4,p5,this);
			this.setVisible(false);
			f.setVisible(true);
			}
		}
		
		else 
		{
			showMessageDialog(null,"PLS PAY CAREFULLY");
		}
	}
}
}