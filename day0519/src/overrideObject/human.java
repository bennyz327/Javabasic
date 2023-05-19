package overrideObject;

public class human extends Animal  {
	
	private int _id;
	private String name;
	private String gender;
	private String 性向;
	
	@Override
	public void breath() {
		System.out.println("用肺呼吸");

	}
	public void swim() {
		System.out.println("人的游泳");
		
	}
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	
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
	
	public String get性向() {
		return 性向;
	}
	public void set性向(String 性向) {
		this.性向 = 性向;
	}
	

//覆寫equals方法
//IDE自動產生
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + _id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		human other = (human) obj;
		if (_id != other._id)
			return false;
		return true;
	}
//IDE自動產生結束
	@Override
	public String toString() {
		return "human [name=" + name + ", gender=" + gender + ", 性向=" + 性向 + "]";
	}

	
	
	
}
