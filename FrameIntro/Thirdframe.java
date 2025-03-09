package FrameIntro;
import CLASSES.*;
import Interfaces.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Thirdframe extends JFrame implements MouseListener,ActionListener{
 
 
 JButton button1,button2,exitBtn,backBtn;
 
 JPanel panel;

 public Thirdframe(){
   super("PASSENGER MANAGEMENT");
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    panel=new JPanel();
    panel.setLayout(null);
	panel.setBackground(new Color(51,255,255));

    this.setSize(600,500);

     
    button1=new JButton("BOOK TICKET");
	button1.setBounds(200,100,170,40);
	button1.setFocusable(false);
	button1.addActionListener(this);
	button1.addMouseListener(this);
	panel.add(button1);
	
	button2=new JButton("OTHER INFORMATION");
	button2.setBounds(200,200,170,40);
	button2.setFocusable(false);
	button2.addActionListener(this);
	button2.addMouseListener(this);
	panel.add(button2);
	
	
	
	backBtn=new JButton("GO BACK");
	backBtn.setBounds(220,260,100,40);
	backBtn.setFocusable(false);
	backBtn.addActionListener(this);
	backBtn.addMouseListener(this);
	panel.add(backBtn);
	
	exitBtn=new JButton("EXIT");
	exitBtn.setBounds(320,260,100,40);
	exitBtn.setFocusable(false);
	exitBtn.addActionListener(this);
	exitBtn.addMouseListener(this);
	panel.add(exitBtn);
	
    this.add(panel);
 }
 public void mouseClicked(MouseEvent me){}
public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}
public void mouseEntered(MouseEvent me){
	if(me.getSource()==button1)
	{
		button1.setBackground(Color.BLUE);
		button1.setForeground(Color.YELLOW);
	}
	else if(me.getSource()==button2)
	{
		button2.setBackground(Color.BLUE);
		button2.setForeground(Color.YELLOW);
	}
	else if(me.getSource()==exitBtn)
	{
		exitBtn.setBackground(Color.YELLOW);
		exitBtn.setForeground(Color.RED);
	}
	else if(me.getSource()==backBtn)
	{
		backBtn.setBackground(Color.BLUE);
		backBtn.setForeground(Color.YELLOW);
	}
	else{
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
else if(me.getSource()==backBtn)
{
	backBtn.setBackground(Color.WHITE);
	backBtn.setForeground(Color.BLACK);
}
else{
	
}
}

 public void actionPerformed(ActionEvent ae){
	 
	 if(ae.getSource()==button1)
	 {
		 Bus b=new Bus();
		 b.setVisible(true);
		 this.setVisible(false);
	 }
	 else if(ae.getSource()==button2)
	 {
		 BusInfo bf=new BusInfo();
		 this.setVisible(false);
		 bf.setVisible(true);
		 
	 }
	 else if(ae.getSource()==backBtn)
	 {
		 FirstFrame f=new FirstFrame();
		 f.setVisible(true);
		 this.setVisible(false);
		 
	 }
	 else if(ae.getSource()==exitBtn)
	 {
		 System.exit(0);
	 }
	 else{
	 }
 }
}