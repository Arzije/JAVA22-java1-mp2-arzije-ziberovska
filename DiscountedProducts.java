package Minipro2;

class DiscountedProducts extends Products {
		final double discount;

		DiscountedProducts (String items, int amountItems, double price, double discount) {
			super(items, amountItems, price);
			this.discount=discount;
		}
			double priceWithDiscount() {
				return getPrice()*discount;
			}
}
