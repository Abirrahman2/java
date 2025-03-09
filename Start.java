import CLASSES.*;
import Interfaces.*;
import FrameIntro.*;
public class Start{
	public static void main(String[] args){
		Login l=new Login();
		l.setVisible(true);
		
	}

}
















/*import CLASSES.*;
import Interfaces.*;
import java.util.*;
public class Start{
public static void main(String[] args){
	/*Company com=new Company();
	Bus bus=new Bus();
	Account comacc=new Account();
	comacc.setAccNum(11111);
	comacc.setBalance(0.0);
	com.setAccount(comacc);
    boolean choice=true;
Scanner sc=new Scanner(System.in);
while(choice){
System.out.println("1.passenger option");
System.out.println("2.Manneging option");
int option=sc.nextInt();
switch(option){
	case 1:
System.out.println("Are u new?");
System.out.println("1.yes");
System.out.println("2.no");
int firstchoice=sc.nextInt();
switch(firstchoice)
{
	case 1:
	System.out.print("Enter your name: ");
	String name=sc.next();
	System.out.print("Enter your NID: ");
	String Nid=sc.next();
	System.out.print("Enter your Age: ");
	int age=sc.nextInt();
	Customer c=new Customer();
	c.setName(name);
	c.setNid(Nid);
	c.setAge(age);
	com.insertCustomer(c);
	c.showAllDetails();
     
	break;	
	
	case 2:
	System.out.println("1.Seat booking");
	System.out.println("2.other information");
	int secondchoice=sc.nextInt();
	
	switch(secondchoice)
	{
		case 1:
		
		System.out.print("Enter Your name: ");
		String pname=sc.next();
			System.out.print("Enter your Nid: ");
			String pNid=sc.next();
			System.out.print("Enter Your Age: ");
			int page=sc.nextInt();
			System.out.print("Enter Your Mobile Number: ");
		    String mobileNumber=sc.next();
			System.out.print("Enter Your Account Number: ");
			int accnum=sc.nextInt();
			System.out.print("Enter Your Account Balance: ");
			double balance=sc.nextInt();
			Account a=new Account();
			a.setAccNum(accnum);
			a.setBalance(balance);
			Passenger p=new Passenger();
			p.setAccount(a);
			
			p.setName(pname);
			p.setNid(pNid);
			p.setAge(page);
			p.setMobileNum(mobileNumber);
			
			
			
			System.out.println("Are you sure for booking this ticket?");
			System.out.println("1.yes");
			System.out.println("2.no");
			int confirm=sc.nextInt();
			if(confirm==1){
			
			a.transferMoney(comacc,600);
			}
			else if(confirm==2)
			{
				bus.removePassenger(p);
			}			
			p.showPassengerBalance();
	
		    System.out.println();
				
	}
	
break;
//case 2:

}

break;
}






}
*/

//}

//}
/*import java.lang.*;
import java.util.*;
public class Start

{
	public static void main(String arg[])
	{
		System.out.println("\n\nWelcome To Sample Bus Ticket and Managent Service \n ");
		boolean choice=true;
		Account a=new Account();
		Scanner scan= new Scanner(System.in);
		while(choice)
		{
			System.out.println(" Choice any service ");
			System.out.println("       1. Bus Managent  ");
			System.out.println("       2. Bus Ticket  ");
			System.out.println("       3. Exit from the application\n ");
			System.out.println(" What do you want to do:  ");


			int first=scan.nextInt();

			switch(first)
			{
			case 1:
				System.out.println("Welcome to our Bus Managent Service");
				break;


			case 2:
				System.out.println("Welcome to Our Bus Ticket Service \n");
				System.out.println("    1. Sign In(If you already have account)");
				System.out.println("    2. Sign Up (For New )");
				System.out.println("\nWhat do you want to do:  ");

				int second=scan.nextInt();

				switch(second)
				{
				case 1:
					System.out.println("     Enter Your Username :");
					String userName=scan.next();
					System.out.println("     Enter Your Password :");
					String password=scan.next();

					a.getCustomer(userName,password);
							break;

					



				case 2:
					System.out.println(" Welcome to your Bus Ticket Service \n For Create Account Please Follow The Step\n");

					System.out.println("   Enter your full name  : ");
					String fullName=scan.next();
					System.out.println("   Enter Your Phone Number: ");
					String phnNumber=scan.next();
					System.out.println("   Create a Password      : ");
					String pass=scan.next();
					System.out.println("   Enter your NID Number  : ");
					String nidNumber=scan.next();

					Customer c=new Customer();
					c.setFullName(fullName);
					c.setPhnNumber(phnNumber);
					c.setPass(pass);
					c.setNidNumber(nidNumber);

					a.insertCustomer(c);


					break;


				}

			case 3:
				System.out.println("You have selected to exit the application");
					System.out.println("Thank you for using Our Service");
					choice = false;
					break;
			}
		}
	}
}*/
