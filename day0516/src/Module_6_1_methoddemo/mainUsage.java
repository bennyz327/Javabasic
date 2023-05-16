package Module_6_1_methoddemo;

//import java.util.Scanner;

public class mainUsage {

	public static void main(String[] args) {
		
		
//		//動態方法使用	需要建立物件
//		Employee emp01=new Employee();
//		System.out.println("請輸入英文姓名");
//		//尚未處裡例外狀況
//		Scanner sc1=new Scanner(System.in);
//		String inputName = sc1.next();	sc1.close();
//		emp01.setName(inputName);
//		System.out.println("新增完畢");		
//		System.out.println("成員已增加，"+"成員姓名: ");		
//		emp01.showName();
		
		
//		//靜態方法使用
//		double bmi = Employee.calBMI(70, 170);
//		System.out.println(bmi);

		
//		//封裝，物件導向三大特性之一
//		//減少物件之間耦合、相互黏著的問題，避免變數、方法外露，
//		
//		//簡單封裝
//		Employee emp01=new Employee();
//		emp01.setSalary(27000);
		
		
		//getter\setter使用
		
		
//		//建構子使用
//		Employee emp01=new Employee("creator");
//		emp01.setName("benny");
//		emp01.showName();
		
		
//		//自動產生getter\setter
//		Employee_auto empAuto=new Employee_auto();
//		empAuto.setGender("女");
//		System.out.println(empAuto.getGender());
		
		
//		//自我測試，利用建構子生產人類別
//		humanclass man01=new humanclass();
//		//man01.addhumanclass("name");
//		man01.addHuman("benny",18);
//		man01.printInfo();

		//使用並呼叫自動產生的建構子
		Employee_constructor emp01=new Employee_constructor("benny", "M", "0987-654-321", "高雄市");	
		//"benny", "M", "0987-654-321", "高雄市"
		System.out.println("Name:\t"+emp01.getName());
		System.out.println("Gender:\t"+emp01.getGender());
		System.out.println("Phone:\t"+emp01.getPhone());
		System.out.println("Address:\t"+emp01.getAddress());
		
	}

}
