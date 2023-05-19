package overrideObject;

public abstract class Animal {

	//抽象方法的寫法，內部沒有任何程式碼，通常會留給子類別進行實作
	//通常用來表示子類別必需有的元素，但是不同子類別會差異很大的狀況使用
	public abstract void breath();
	//只要有任何一個抽象元素在類別中，這個類別就是抽象的
	
	public void 新陳代謝() {
		System.out.println("代謝");
	};

}
