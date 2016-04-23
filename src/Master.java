

public class Master {
	public static void main(String[] args) {
		//实例化
		Dog myDog = new Dog();
		myDog.setName("旺财");
		myDog.setAge(44);
		String sound = myDog.bark();
		System.out.println(sound);
		String s = "骨头";
		myDog.eat(s);
		myDog.sleep();
		myDog.lookDoor();
		
		Cat cat = new Cat();
		
		
		Master m = new Master();
		String userName = "张三";
		m.sayHello(userName);
		System.out.println(userName);
	}
	public String sayHello(String name ){
		name = "hello " + name;
		return name;
	}
	
}
