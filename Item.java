class Item {
	int id;
	String name;
	double price;
	

	//TODO add variable.
	double tax;
	//TODO constructor
	public Item(double tax,int id, String name, double price){
	this.id=id;
	this.name=name;
	this.price=price;
	this.tax=tax;
	}
	
	//TODO setters and getters
	int getTax(){
	return tax;
	}
	void setTax(double tax){
	this.tax=tax;
	}
	    

	double taxReturn () {
		
	}
}
