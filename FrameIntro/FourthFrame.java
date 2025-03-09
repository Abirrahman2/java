package FrameIntro;
import CLASSES.*;
import Interfaces.*;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class FourthFrame extends JFrame implements ActionListener{
	JLabel label1,label2,label3,label4;
	JPanel panel;
	JButton signout,back;
	public FourthFrame(String s1,String s2,String s3,String s4,String s5,Bus b)
	{
		super("DETAILS");
		this.setSize(420,420);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255,204,229));
		
		label1=new JLabel("Bus type:"+s1);
		label1.setBounds(50,0,250,40);
		panel.add(label1);
		
		label2=new JLabel("TICKET NO:"+s2);
		label2.setBounds(50,50,250,40);
		panel.add(label2);
		
		label3=new JLabel("SEAT NO:"+s3);
		label3.setBounds(50,100,250,40);
		panel.add(label3);
		
		label4=new JLabel("FROM: "+s4+" TO "+s5);
		label4.setBounds(50,150,250,40);
		panel.add(label4);
		
		
		signout=new JButton("SIGNOUT");
		signout.setBounds(140,200,100,30);
	    signout.setFocusable(false);
		signout.addActionListener(this);
		panel.add(signout);
		
		back=new JButton("BACK");
		back.setBounds(250,200,100,30);
		back.setFocusable(false);
		back.addActionListener(this);
		panel.add(back);
		
		
		this.add(panel);
		}
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==signout)
			{
				Login l=new Login();
				l.setVisible(true);
				this.setVisible(false);
			}
			else if(ae.getSource()==back)
			{
				Thirdframe t=new Thirdframe();
				t.setVisible(true);
				this.setVisible(false);
			}
		}
}