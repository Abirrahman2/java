package FrameIntro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BusInfo extends JFrame implements ActionListener{
	JPanel panel1,panel2;
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14;
	JButton back,signout;
	public BusInfo(){
		super("Bus Information");
		this.setSize(600,600);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(0,0,300,600);
		panel1.setBackground(new Color(136,220,190));
		
		panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(300,0,300,600);
		panel2.setBackground(new Color(236,220,190));
	
        label1=new JLabel("BUS 1");
		label1.setBounds(100,0,100,30);
		label1.setForeground(Color.BLACK);
		label1.setFont(new Font("Serif",Font.BOLD,17));
		panel1.add(label1);
		
		label2=new JLabel("BUS 2");
		label2.setBounds(450,0,100,30);
		label2.setForeground(Color.BLACK);
		label2.setFont(new Font("Serif",Font.BOLD,17));
		panel2.add(label2);
		
		label3=new JLabel("BUS NAME: SHAYMOLI");
		label3.setBounds(0,50,200,30);
	    panel1.add(label3);
		
		label4=new JLabel("ROUTE: DHAKA TO BANDARBAN TO DHAKA");
		label4.setBounds(0,100,280,30);
		panel1.add(label4);
		
		label5=new JLabel("FIRST TRIP:6:00PM");
		label5.setBounds(0,150,200,30);
		panel1.add(label5);
		
		label6=new JLabel("LAST TRIP:11:00PM");
		label6.setBounds(0,200,200,30);
		panel1.add(label6);
		
		label7=new JLabel("BUS TYPE: AC");
		label7.setBounds(0,250,200,30);
		panel1.add(label7);
		
		label8=new JLabel("TICKET PRICE:700 TK");
		label8.setBounds(0,300,280,30);
		panel1.add(label8);
		
		label9=new JLabel("BUS NAME: IMAD");
		label9.setBounds(300,50,200,30);
	    panel2.add(label9);
		
		label10=new JLabel("ROUTE:DHAKA TO KHULNA TO DHAKA");
		label10.setBounds(300,100,280,30);
		panel2.add(label10);
		
		label11=new JLabel("FIRST TRIP:7:00 AM");
		label11.setBounds(300,150,200,30);
		panel2.add(label11);
		
		label12=new JLabel("LAST TRIP:11:00 AM");
		label12.setBounds(300,200,200,30);
		panel2.add(label12);
		
		label13=new JLabel("BUS TYPE: NON-AC");
		label13.setBounds(300,250,200,30);
		panel2.add(label13);
		
		label14=new JLabel("TICKET PRICE:500 TK");
		label14.setBounds(300,300,280,30);
		panel2.add(label14);
		
		back=new JButton("BACK");
		back.setBounds(100,350,80,30);
		back.setFocusable(false);
		back.addActionListener(this);
		panel1.add(back);
		
		signout=new JButton("SIGNOUT");
		signout.setBounds(450,350,120,30);
		signout.setFocusable(false);
		signout.addActionListener(this);
		panel2.add(signout);
		
		
		this.add(panel1);
		this.add(panel2);
		
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
