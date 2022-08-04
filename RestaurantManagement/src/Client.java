
public class Client {
	private String clientName ;
	private int ID;
	private double balance ;
	private String address ;
	private Order myOrder;
	
	public Client() {
		myOrder = null;
	}
	
	public Client (String name, int id, double bln, String add) {
		clientName = name;
		ID=id;
		balance = bln;
		address = add;
	}
	
	public void setClientName(String name) {
		clientName = name;
	}
	public void setClientID (int id) {
		ID=id;
	}
	public void setClientBalance(double bln) {
		balance = bln;
	}
	public void setClientAddress (String address) {
		this.address=address;
	}
	
	public void order(Order or) {
		myOrder=or;
	}
	
	
	public String getName() {
		return clientName;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getAddress() {
		return address;
	}

	public void cancelOrder() {
		myOrder = null;
	}
	
	public void pay() {
		if(myOrder ==null) {
			System.out.println("You haven't any orders ");
			return;
		}
		
		if(myOrder.getTotal()<=balance) {
			balance-=myOrder.getTotal();
			System.out.println("The payment process has bees successfully done ");
			System.out.println("Your curren balance now is "+balance);
			System.out.println("---------Your order info------");
			myOrder.orderInfo();
		}
		else {
			System.out.println("Your balance is not enough to complete your payment process ...");
			
		}
	}
	
	
	public void ClientInfo() {
		
		System.out.println("---------------------**********---------------------");
		System.out.println("Client name : "+clientName);
		System.out.println("Client ID : "+ID);
		System.out.println("Client Balance : "+balance);
		System.out.println("Client Address : "+address);
		
	}
}
