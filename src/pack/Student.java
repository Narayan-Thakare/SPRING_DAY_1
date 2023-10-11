package pack;

public class Student {
	
	
	int roll;
	String name;
	String address;
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	
	public Student() {
		
	}
	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	
	public Student(int roll) {
		super();
		this.roll = roll;
		
	}
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		
	}
	
	public Student( String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
}
