package ingretient;

public class Egg {
	
	String shape;
	public String shellColor;
	public String size;
//	public String eggWhite;	//不需要的可刪除
	public String yolk;
	public double mistrueContent;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("雞蛋已回收");
//		super.finalize();
	}
	
}
