package CLASSES;
import java.lang.*;

public class Customer{
protected String name;
protected String Nid;
protected String age;
private String mobileNum;

public Customer(){}

public Customer(String name,String Nid,String age,String mobileNum)
{
	this.name=name;
	this.Nid=Nid;
	this.age=age;
	this.mobileNum=mobileNum;
}

public Customer(String name){
	this.name=name;
}

public void setName(String name)
{
	this.name=name;
}
public void setNid(String Nid)
{
	this.Nid=Nid;
}
public void setAge(String age)
{
	this.age=age;
}
public String getName()
{
	return name;
}
public String getNid()
{
	return Nid;
}
public String getAge()
{
	return age;
}
public void setMobileNum(String mobileNum)
{
   this.mobileNum=mobileNum;
}
public String getMobileNum()
{
	return mobileNum;
}
public void showAllDetails()
{
	System.out.println("NAME: "+getName());
	System.out.println("NID: "+getNid());
	System.out.println("AGE: "+age);
	System.out.println("MOBILE NUMBER: "+getMobileNum());
	
}


}