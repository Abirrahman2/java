package FrameIntro;
import CLASSES.*;
import Interfaces.*;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class FirstFrame extends JFrame implements MouseListener,ActionListener{
JButton button1,button2,button3,button4,exitBtn;
JPanel panel;
JLabel label,imgLabel;
ImageIcon img;

public FirstFrame()
{
	super("WELCOME");
	this.setSize(700,463);
	this.setResizable(false);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	panel=new JPanel();
	panel.setLayout(null);
	panel.setBackground(new Color(77,199,191));
	
	label=new JLabel("WELCOME");
	label.setBounds(230,20,250,100);
	label.setFont(new Font("Serif", Font.ITALIC,28));
	label.setForeground(Color.ORANGE);
	panel.add(label);
	
	button1=new JButton("CUSTOMER MANAGEMENT");
	button1.setBounds(200,100,200,50);
	button1.setFocusable(false);
	button1.addActionListener(this);
	button1.addMouseListener(this);
	panel.add(button1);
	
	button4=new JButton("EMPLOYEE MANAGEMENT");
	button4.setBounds(200,200,200,50);
	button4.setFocusable(false);
	button4.addActionListener(this);
	button4.addMouseListener(this);
	panel.add(button4);
	
	button2=new JButton("PASSENGER OPTION");
	button2.setBounds(200,300,200,50);
	button2.setFocusable(false);
	button2.addActionListener(this);
	button2.addMouseListener(this);
	panel.add(button2);
	
	exitBtn=new JButton("EXIT");
	exitBtn.setBounds(200,370,80,30);
	exitBtn.setFocusable(false);
	exitBtn.addMouseListener(this);
	exitBtn.addActionListener(this);
	panel.add(exitBtn);
	
	button3=new JButton("SIGNOUT");
	button3.setBounds(300,370,120,30);
	button3.setFocusable(false);
	button3.addActionListener(this);
	button3.addMouseListener(this);
	panel.add(button3);
	
	img=new ImageIcon("STATION.png");
	imgLabel=new JLabel(img);
	imgLabel.setBounds(0,0,700,463);
	panel.add(imgLabel);
	
	this.add(panel);
	
}
public void mouseClicked(MouseEvent me){}
public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}
public void mouseEntered(MouseEvent me){
	if(me.getSource()==button1)
	{
		button1.setBackground(Color.GREEN);
		button1.setForeground(Color.YELLOW);
	}
	else if(me.getSource()==button2)
	{
		button2.setBackground(Color.ORANGE);
		button2.setForeground(Color.YELLOW);
	}
	else if(me.getSource()==exitBtn)
	{
		exitBtn.setBackground(Color.YELLOW);
		exitBtn.setForeground(Color.RED);
	}
	
	else if(me.getSource()==button3)
	{
		button3.setBackground(Color.YELLOW);
		button3.setForeground(Color.RED);
	}
	else if(me.getSource()==button4)
	{
		button4.setBackground(Color.BLUE);
		button4.setForeground(Color.YELLOW);
	}
	
	
	
}
public void mouseExited(MouseEvent me){
if(me.getSource()==button1)
{
	button1.setBackground(Color.WHITE);
	button1.setForeground(Color.BLACK);
	
}
else if(me.getSource()==button2)
{
	button2.setBackground(Color.WHITE);
	button2.setForeground(Color.BLACK);
}
else if(me.getSource()==exitBtn)
{
	exitBtn.setBackground(Color.WHITE);
	exitBtn.setForeground(Color.BLACK);
	
}
else if(me.getSource()==button3)
{
	button3.setBackground(Color.WHITE);
	button3.setForeground(Color.BLACK);	
}

else if(me.getSource()==button4)
{
	button4.setBackground(Color.WHITE);
	button4.setForeground(Color.BLACK);
}

}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==button1)
	{
	   CustomerManagement c1=new CustomerManagement();
	   this.setVisible(false);
	   c1.setVisible(true);
	}
	else if(ae.getSource()==button2)
	{
		Thirdframe tf=new Thirdframe();
		this.setVisible(false);
		tf.setVisible(true);
		
	}
	else if(ae.getSource()==button3)
	{
		Login l=new Login();
		this.setVisible(false);
		l.setVisible(true);
		
	}
	else if(ae.getSource()==button4)
	{
		EmployeeManagement emp=new EmployeeManagement();
		this.setVisible(false);
		emp.setVisible(true);
	}
	else if(ae.getSource()==exitBtn)
	{
		System.exit(0);
	}
	else{
		
	}
}

}