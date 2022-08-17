package com.samples.S01springcoredi;

public class ShoppingCart {
	private Item Item;

	public Item getItem() {
		return Item;
	}

	public void setItem(Item item) {
		Item = item;
	}

	@Override
	public String toString() {
		return "ShoppingCart [Item=" + Item + "]";
	}
	

}
