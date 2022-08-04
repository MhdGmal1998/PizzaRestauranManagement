import java.util.*;
import java.util.ArrayList;

public class Order {
	private ArrayList<Pizza> piz;
	private int orderNo ;
	private Date orderDate;
	private String deliveryAddress;
	private Client cl;
	private Empolyee emp;
	private double total ;
	
	public Order() {
		piz = new ArrayList<Pizza>();
		total=0.0;
		
	}
	
	
	public void startOrder(Client cl, Empolyee emp) {
		piz.removeAll(piz);
		this.cl=cl;
		this.emp = emp;
		cl.order(this);
		deliver(cl.getAddress());
		
		orderDate = new Date();
		
	}
	
	public void setOrderNo(int a) {
		orderNo=a;
	}
	
	public void addPizza(Pizza pz, int qnt) {
		pz.setQuantity(qnt);
		pz.setTotal(pz.getPrice()*qnt);
		piz.add(pz);
		
		if(qnt>1)
			for(int i=0;i<qnt;i++)
				{
				  total+=pz.getPrice();
				}
		else
			total+=pz.getPrice();
	}
	
	
	public void deliver(String deliveryAddress) {
		this.deliveryAddress=deliveryAddress;
	}
	
	public void cancel() {
		piz.removeAll(piz);
		total=0.0;
		System.out.println("The order have been cancelled");
		
	}
	
	public double getTotal() {
		return total;
	}
	
	public int getOrderNo () {
		return orderNo;
	}
	
	public void orderInfo() {
		System.out.println("---------------------**********---------------------");
		
		System.out.println();
		System.out.println("Customer name : "+cl.getName());
		for(int i=0;i<piz.size();i++) {
			System.out.println((i+1)+" - Shape : "+piz.get(i).getShape()+" | Content : "+piz.get(i).getContene()+" | Size : "+piz.get(i).getSize() +" | Price : "+
					piz.get(i).getPrice() +" | quantity : "+piz.get(i).getQuantity()+" | Total : "+piz.get(i).getTotal());
		}
		
		System.out.println("The Total Price : "+total +" SAR");
		System.out.println("The delivery address : "+deliveryAddress);
		System.out.println("Date and Time : "+orderDate);
		System.out.println("Empolyee name : "+emp.getName());
		System.out.println("------------------------------------------\n\n");
		
	}
}
