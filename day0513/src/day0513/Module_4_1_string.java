package day0513;

import javax.swing.JOptionPane;

import org.w3c.dom.css.CSSRule;

public class Module_4_1_string {

	public static void main(String[] args) {

//與相同字串值的記憶體位置比較	
//		String str="benny";									//記憶體位置與相同字串值相同
//		String str2="benny";								//記憶體位置與相同字串值相同
//		String str3=new String("benny");					//記憶體位置與相同字串值不同
//		String str4=JOptionPane.showInputDialog("test");	//記憶體位置與相同字串值不同
//		System.out.println(str);
//		System.out.println(str2);
//		System.out.println(str3);
//		System.out.println(str4);
//		System.out.println(str==str4);						//透過==比較的是記憶體stack區的參照值是否相同
//		System.out.println(str3.equals(str4));				//透過String的equals方法可以比較每個字是否相同
		
//		/* 對於可能會出現回傳錯誤或是空值的物件
//		 * 不要調用他的方法，不然會報錯*/
//		String str5=JOptionPane.showInputDialog("test");
//		System.out.println("benny".equals(str5));			//較好的寫法
//		System.out.println(str5.equals("benny"));			//會報錯的寫法
		
		
//常用的string用法
		String str="當我走在城市的街道上時，我總是感到自己如此微不足道，好像只是一個在人潮中被忽視的小人物。然而，當我走進大自然中時，一切都改變了。我感到自己成為了這個世界的一部分，和這個美麗而神秘的世界相互交融。\r\n"
				+ "\r\n"
				+ "每當我走進森林中時，我都感到自己被自然的魔力包圍著。樹木、花朵和草叢散發出的氣息和香氣，以及鳥兒和昆蟲的聲音，都讓我感到平靜和放松。我喜歡在河邊散步，聆聽流水的聲音和微風的吹拂。我喜歡在海灘上散步，感受海風和浪潮的氣息。在自然中，我感到自己與生俱來的和諧和平衡。\r\n"
				+ "\r\n"
				+ "我認為每個人都應該花時間在大自然中。我們生活在一個快節奏的世界，每天都在處理工作和生活的壓力。然而，當我們走進自然中時，我們可以放下這些壓力，並與我們的本性重新連接。自然可以讓我們感到更有活力、更快樂和更平衡。\r\n"
				+ "\r\n"
				+ "我相信保護自然環境是我們所有人的責任。我們應該保護我們的地球，以便未來的世代也可以享受美麗的大自然。我們可以通過減少使用化學物質、節約能源和資源、種植樹木和支持環保組織等方式，做出自己的貢獻。\r\n"
				+ "\r\n"
				+ "在自然中，我們可以找到自己和這個世界的連接。我希望每個人都能花時間在自然中，並努力保護我們的地球。";
		String str300="每個人都有自己的夢想和目標，但是實現它們並不總是容易的。成功需要付出努力和決心，需要克服困難和挑戰。\r\n"
				+ "\r\n"
				+ "在實現夢想的過程中，我們需要學會如何設定目標並制定計劃。明確的目標可以幫助我們保持方向和動力，制定計劃則可以幫助我們更好地組織和安排時間。\r\n"
				+ "\r\n"
				+ "此外，堅持也是成功的關鍵。在達成目標的過程中，我們可能會遇到許多困難和挫折，但是堅持下去可以幫助我們克服這些困難，並取得成功。\r\n"
				+ "\r\n"
				+ "另外，成功也需要學會與他人合作和交流。通過和他人合作，我們可以利用彼此的優勢和經驗來達成目標。此外，有效的交流也可以幫助我們更好地理解和解決問題。\r\n"
				+ "\r\n"
				+ "總之，成功需要努力、決心、目標、計劃、堅持和合作等多種因素。只要我們願意付出努力，相信自己，那麼我們就有可能實現自己的夢想和目標。";
		System.out.println(str.length());					//字串的長度
		System.out.println(str300.length());
		System.out.println(str.indexOf("大自然"));			//找出特定字串的索引值
		System.out.println(str.substring(0,51));			//從第一個索引值前面分割，切到第二個索引值，第二個索引值為空則切到字串尾端
		
		
	}

}
