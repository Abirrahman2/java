package FrameIntro;
import CLASSES.*;
import exception.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class Login extends JFrame implements MouseListener, ActionListener{
	
	ImageIcon img;
	JLabel label1,label2,userLabel,passLabel,success,imgLabel;
	JTextField userTF;
	JPasswordField  passPF;
	JButton signinBtn, signupBtn,exitBtn;
	JPanel panel;
	
	
	
	public Login(){
		super("BUS MANAGEMENT SYSTEM");
		this.setSize(800,566);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	
		panel=new JPanel(); 
		panel.setLayout(null);
		

		label1=new JLabel("BUS MANAGEMENT SYSTEM");
		label1.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,28));
		label1.setForeground(Color.BLUE);
	    label1.setBounds(270,45,390,90);
	    panel.add(label1);
	    

	    userLabel=new JLabel("USER NAME: ");
	    userLabel.setBounds(280,150,150,40);
		userLabel.setForeground(Color.YELLOW);
	    panel.add(userLabel);

	    userTF=new JTextField();
	    userTF.setBounds(360,150,150,40);
	    panel.add(userTF);

        passLabel=new JLabel("PASSWORD");
        passLabel.setBounds(280,200,150,40);
		passLabel.setForeground(Color.YELLOW);
        panel.add(passLabel);


        passPF=new JPasswordField();
        passPF.setBounds(360,200,150,40);
        passPF.setEchoChar('*');
        panel.add(passPF);

        signinBtn=new JButton("SIGNIN");
        signinBtn.setBounds(350,250,80,30);
        signinBtn.addMouseListener(this);
        signinBtn.addActionListener(this);
        panel.add(signinBtn);


        exitBtn=new JButton("EXIT");
        exitBtn.setBounds(440,250,80,30);
        exitBtn.addMouseListener(this);
        exitBtn.addActionListener(this);
        panel.add(exitBtn);


      

        success=new JLabel();
        success.setBounds(350,285,350,40);
		success.setFont(new Font("Serif",Font.ITALIC,25));
		success.setForeground(Color.ORANGE);
        panel.add(success);


        img=new ImageIcon("bus4.png");
		imgLabel=new JLabel(img);
		imgLabel.setBounds(0,0,800,566);
		panel.add(imgLabel);


	    this.add(panel);


	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
	   if(me.getSource()==signinBtn)
	{
		signinBtn.setBackground(Color.ORANGE);
		signinBtn.setForeground(Color.YELLOW);
	}
	else if(me.getSource()==exitBtn)
	{
		exitBtn.setBackground(Color.ORANGE);
		exitBtn.setForeground(Color.YELLOW);
	}
	
		
	}
public void mouseExited(MouseEvent me){
	if(me.getSource()==signinBtn)
	{
		signinBtn.setBackground(Color.WHITE);
		signinBtn.setForeground(Color.BLACK);
	}
	else if(me.getSource()==exitBtn)
	{
		exitBtn.setBackground(Color.WHITE);
		exitBtn.setForeground(Color.BLACK);
	}
	
		
	}
	
	public void actionPerformed(ActionEvent ae){
		
     String command=ae.getActionCommand();
        
	
	 if(signinBtn.getText().equals(command))
	 {
		
		 String s1=userTF.getText();
			String s2=passPF.getText();
			
			try{
				if(s2.length()<8)
				{
					
					throw new Myexception();
				}
			}
			catch(Myexception m)
			{
				showMessageDialog(null,m.getMsg());
			}
			
			 if(s1.equals("ADMIN") && s2.equals("11111111"))
            {
			


             success.setText("SUCCESFULLY LOG IN");
             showMessageDialog(null,"INFORMATION VALID");
           
            FirstFrame f1=new FirstFrame();
			f1.setVisible(true);
			this.setVisible(false);
					
			}
	
	
	 }
	
	
		else if(exitBtn.getText().equals(command))
		{
			System.exit(0);
		}
	}
}
