package week1.day1;

public class Mobile {
	public static void main(String[] args)
	{
		Mobile ms = new Mobile();
		ms.saveContact(" saravanan");
		ms.makeCall(9876543219L);
		ms.sendMessage("hi saravanan");
		}

	public void saveContact(String name) 
	{
		System.out.println("saveContact:" + name);	
	}
public void sendMessage(String message)
{
		System.out.println("Message send:" + message);	
	}

public void makeCall(long mobileNumber)
{
	System.out.println("Call number:" +  mobileNumber);	
}

}
