package CLASSES;

public class Ticket{
	private String ticketNo;
	private String tickeType;

	public Ticket(String ticketNo)
	{
		this.ticketNo=ticketNo;
	}
	public void setTicketNo(String ticketNo)
	{
		this.ticketNo=ticketNo;
	}
	public String getTicketNo()
	{
		return ticketNo;
	}

}