package lab_humanWearing;

public class WearingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Human {

    private String name;    // 設為private私有，不讓別人直接存取到
    private Wearing wear;   // 這個wear是內部類別Wearing的物件，是Human的欄位

    public Human(String str) {  // public，公開此建構子
        name = str;
        wear = new Wearing();   // wear是物件，還是需要利用new初始化
    }

    private class Wearing {  // private，不讓別人利用此類別建立物件
        String color;
        char size;
    }

    public void setWear(String c, char s) {  // 開放此方法，別人只能透過這個方法設定wear
        wear.color = c;
        wear.size = s;
    }

    public String getWear() {  // 開放此方法，別人只能透過此方法取得wear的內容
        return name+" 穿的服裝顏色是：" + wear.color + " 尺寸是：" + wear.size;
    }

}// end of class Human
