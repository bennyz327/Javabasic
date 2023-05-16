package Module_6_1_methoddemo;

public class Employee_constructor {
	private String name;
	private String gender;
	private String phone;
	private String address;
//	private long salary;	
//	private String hireDate;
//	private String nameCreator;
	
	public Employee_constructor() {super();}
	public Employee_constructor(String name, String gender, String phone, String address) {
		super();
		this.setName(name);
		this.setGender(gender);
		this.setPhone(phone);
		this.setAddress(address);
	}
//	public Employee_constructor(String name,String gender) {
//		this(name,gender);
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
