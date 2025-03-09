package CLASSES;
public class Employee{
private String empName;
private String empId;

private Account ac;
public Employee(String empId)
{
	this.empId=empId;
}
public void setEmpId(String empId)
{
	this.empId=empId;
}
public String getEmpId(){
	return empId;
}
public void setEmpName(String empName)
{
	this.empName=empName;
}
public String getEmpName(){
	return empName;
}
public void setAccount(Account ac){
	this.ac=ac;
}
public Account getAccount(){
	return ac;
}



}