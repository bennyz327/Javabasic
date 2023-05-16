package example.conn;
//private用例
//單例工廠
public class ConnectionFactory {
	
	static ConnectionFactory connF=null;
	//建構子設為private	只能由自己建構
	private ConnectionFactory() {
		//執行連線工作
	}
	
	//先判斷是否有人連線了，確認null再透過自己調用創建物件
	public static ConnectionFactory createConnectionFactory() {
		if(connF!=null) {
			return connF;
		}else {
			connF=new ConnectionFactory();
			return connF;
		}	
	}
}
