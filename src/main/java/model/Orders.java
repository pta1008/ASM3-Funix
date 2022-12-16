package model;

import java.util.Date;
import java.util.List;

public class Orders {
	private int orderId;
	private float price;
	private int status;
	private Date orderDate;
	private String address;
	private String phoneNumber;
	private List<ProductOders> lp;
	private String useMail;
	private Date receivedDate; 
	private String Discount;
	
	
	
	public Orders(List<ProductOders> lp) {
		super();
		
	}
	public Orders(int orderId, float price, int status, Date orderDate, String address, String phoneNumber,
			List<ProductOders> lp, String useMail, Date receivedDate, String discount) {
		super();
		this.orderId = orderId;
		this.price = price;
		this.status = status;
		this.orderDate = orderDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.lp = lp;
		this.useMail = useMail;
		this.receivedDate = receivedDate;
		Discount = discount;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<ProductOders> getLp() {
		return lp;
	}
	public void setLp(List<ProductOders> lp) {
		this.lp = lp;
	}
	public String getUseMail() {
		return useMail;
	}
	public void setUseMail(String useMail) {
		this.useMail = useMail;
	}
	public Date getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}
	public String getDiscount() {
		return Discount;
	}
	public void setDiscount(String discount) {
		Discount = discount;
	}
	
	
	
}
