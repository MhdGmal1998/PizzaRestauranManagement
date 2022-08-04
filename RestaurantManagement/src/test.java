
public class test {
	public test() {
		
	}
	
	
	public void runApp() {
		System.out.println("Welcome Back ...");
		
		// Client -----**-----
		Client cl1 = new Client ();
		cl1.setClientName("Mona Ali ");
		cl1.setClientBalance(120.4);
		cl1.setClientID(1);
		cl1.setClientAddress("Makah");
//		cl1.ClientInfo();
		
		Client cl2 = new Client("Foton Ahmed ",2,20.2,"Riyadh");
//		cl2.ClientInfo();
		
		Client cl3 = new Client("Ahmed Nader",3,120.2,"Jidah");
//		cl3.ClientInfo();
		
		Client cl4 = new Client("Khalid ",4,1220.2,"Riyadh");
//		cl4.ClientInfo();
		
		
		// Pizza -----**-----
		
		Pizza pz1 = new Pizza();
		pz1.setSize("Big");
		pz1.setShape("Circle");
		pz1.setContent("cheese");
		pz1.setPrice(30.2);
//		pz1.pizzaInfo();
		
		Pizza pz2 = new Pizza("Circle","meat","Small",20.3);
//		pz2.pizzaInfo();
		
		Pizza pz3 = new Pizza("Circle","meat","Middle ",25.3);
//		pz3.pizzaInfo();
		
		
		// Order -----**-----
		
		Empolyee emp1 = new Empolyee("Morad ",3);
		Empolyee emp2 = new Empolyee("Sami ",2);
		
		Order ord = new Order();
		
		ord.startOrder(cl1,emp1);
		ord.addPizza(pz1,1);
		ord.addPizza(pz2,2);
		
		cl1.pay();
		
		ord.startOrder(cl2, emp2);
		ord.addPizza(pz2,1);
//		ord.addPizza(pz2,2);
		cl2.pay();
//		ord.orderInfo();
	}
}
