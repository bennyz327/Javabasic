package overrideObject;

public class TestOverrideObject {

	public static void main(String[] args) {

		human h1=new human();
		human h2=new human();
//		h1.set_id(10);
//		h2.set_id(10);	//20
//		System.out.println(h1.equals(h2));
		
		h1.set_id(10);
		h1.setName("大中天");
		h1.setGender("男子漢");
		h1.set性向("老練的棒棒");
		
		System.out.println(h1.toString());

	}

}
