package com.samples.S01springcoredi;

public class Item {
	private int Id;
	private String name;
	private int price;
	private int quantity;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [Id=" + Id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}
