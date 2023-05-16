package Module_6_1_methoddemo;

public class Employee {
//VO POJO DTO
//資料載體
	
	//用private私有化，只能供內部使用
	private String name;
	private long salary;	
	private String nameCreator;
	//private String gender;
	//private String phone;
	//private String address;
	//private String hireDate;
	
	
	//建構方法，預設建構子
	public Employee() {
	}
	//建構方法，有給參數的建構子
	//同名的建構方法可選擇給不給參數，稱為覆載
	public Employee(String nameCreator) {
		this.nameCreator = nameCreator;
	}
	
	
	//動態方法	需要建立物件
	public void setName(String nameinput) {
		if(nameinput.length()<2) {
			return;		//void不需要回傳值，直接return
		}
		this.name=nameinput;
	}
	public void showName() {
		System.out.println(this.name);
		System.out.println("建立者: "+this.nameCreator);
	}
	
	
	//靜態方法	不需建立物件
	public static double calBMI(double weight,int height) {
		return weight/(double)(height*height)*10000;
	}
	
	
	public void setSalary(long salaryinput) {
		if(salaryinput>=28000&&salaryinput<=33000) {
		//在變數名稱有歧異的時候，會以方法內部的變數優先
		//若想要調用物件的屬性，可以選擇改變變數名稱，或是在前面加上this.
		/*this.*/salary = salaryinput;
		}
		else if(salaryinput<28000){
			System.out.println("太低");
		}else {
			System.out.println("太高");
		}
	}
	
	
	
}
