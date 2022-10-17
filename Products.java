package Minipro2;

class Products {
		private String items;
		private int amountInStock;
		final double price;
		
		Products (String items, int amountInStock, double price){
			this.amountInStock=amountInStock;
			this.items=items;
			this.price=price;
		}
			public void setItems(String items) {
				this.items = items;
			}
			public String getItems() {
				return items;
			}
			public int getUpdateStock() {
				return amountInStock--;
			}
			public double getPrice() {
				return price;
			}
			public int getAmountInStock() {
				return amountInStock;
			}


	
			
			
			
	
}
