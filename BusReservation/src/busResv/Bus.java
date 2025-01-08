package busResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	private double price;
	public Bus(int busNo, boolean ac, String startPoint, String endPoint, int capacity,double price) {
		this.busNo = busNo;
		this.ac = ac;
		this.capacity = capacity;
		this.price=price;
	}
	public int getBusNo() {
		return busNo;
	}

	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity=capacity;
	}
	public double getPrice() {
		return price;
	}

}
