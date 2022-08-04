public class Pizza {
	private String shape;
	private String content ;
	private String size;
	private double price;
	private double total;
	
	private int quantity ;
	public Pizza() {
		
	}
	
	public Pizza(String shape, String content, String size, double price) {
		this.shape=shape;
		this.content=content;
		this.size=size;
		this.price=price;
	}
	
	public void setShape (String shape) {
		this.shape=shape;
	}
	public void setContent(String content) {
		this.content=content;
	}
	public void setSize(String size) {
		this.size=size;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	
	public void setTotal(double total) {
		this.total=total;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	public void setQuantity(int qnt) {
		quantity=qnt;
	}
	public String getShape() {
		return shape;
	}
	
	public String getSize() {
		
		return size;
	}
	
	public String getContene() {
		return content;
	}
	public double getTotal() {
		return total;
	}
	
	public void prepare() {
		
	}
	public void cook() {
		
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void pizzaInfo() {
		System.out.println("---------------------**********---------------------");
		System.out.println("Pizza shape : "+shape);
		System.out.println("Pizza content : "+content);
		System.out.println("Pizza size : "+size );
		System.out.println("Pizza price : "+price );
	}
}
