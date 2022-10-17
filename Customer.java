package Minipro2;

class Customer {
		private int amountItems;
		private double totalCost;

		Customer(int amountItems, double totalCost){
			this.amountItems=amountItems;
			this.totalCost=totalCost;	
		}
			int getUpdatedAmountItemsPurchased(){//
				return amountItems++;
			}
			void setUpdateTotalCost(double itemPrice){//
				totalCost += itemPrice;
		    }
			public double getTotalCost() {//
				return totalCost;
			}				
}
