

public class Pet {
	private String name;
	private int age;
	private String kind;

	public String bark() {
		return "ÍôÍô";
	}

	public void eat(String food) {
		System.out.println(name + age + "³Ô" + food);
	}

	public void sleep() {
		System.out.println(name + "ÔÚË¯¾õ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 20 || age < 0) {
			System.out.println("Êı¾İ´íÎó");
		} else
			this.age = age;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
}
