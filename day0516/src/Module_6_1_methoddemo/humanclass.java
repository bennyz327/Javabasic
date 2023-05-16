package Module_6_1_methoddemo;

public class humanclass {
    String name;
    int age;
    static int totalCount = 0;
    public void addHuman(){
        name = "untitled";
        age = -1;  // 使用-1來標記沒有被設定，否則會初始化為0，但人類有可能0歲
        totalCount++;
    }
    public void addHuman(String str){  
        this.addHuman();                          
        this.name = str;
    }
    public void addHuman(String str,int a){
        this.addHuman(str);  
        this.age = a;
    }
    public void printInfo(){
        System.out.println(name+" 年齡："+age+" 目前總人數："+totalCount);
    }
}
