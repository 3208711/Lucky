

public class Master {
	public static void main(String[] args) {
		//ʵ����
		Dog myDog = new Dog();
		myDog.setName("����");
		myDog.setAge(44);
		String sound = myDog.bark();
		System.out.println(sound);
		String s = "��ͷ";
		myDog.eat(s);
		myDog.sleep();
		myDog.lookDoor();
		
		Cat cat = new Cat();
		
		
		Master m = new Master();
		String userName = "����";
		m.sayHello(userName);
		System.out.println(userName);
	}
	public String sayHello(String name ){
		name = "hello " + name;
		return name;
	}
	
}
