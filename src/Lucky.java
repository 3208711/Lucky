

import java.util.Scanner;

public class Lucky {
	public static void main(String[] args) {
		String yn = null;
		String[] name = new String[10];
		String[] pass = new String[10];
		int[] cardNo = new int[10];
		int index = -1;
		do {
			System.out.println("**********你好*********");
			System.out.println("1、注册");
			System.out.println("2、登录");
			System.out.println("3、抽奖");
			System.out.println("*********************");
			System.out.println("请选择：");
			Scanner input = new Scanner(System.in);
			int userSelect = input.nextInt();
			switch (userSelect) {
			case 1:
				for (int i = 0; i < name.length; i++) {
					if(name[i] == null){
						index = i;
					}
				}
				System.out.println(">注册");
				System.out.println("请填写：");
				System.out.println("用户名：");
				name[index] = input.next();
				System.out.println("密码：");
				pass[index] = input.next();
				System.out.println("用户\t密码\t卡号");
				cardNo[index] = (int) (Math.random() * 10);
				System.out.println(name + "\t" + pass + "\t" + cardNo[index]);
				break;
			case 2:
				System.out.println(">登录");
				System.out.println("用户名：");
				String name1 = input.next();
				System.out.println("密码：");
				String pass1 = input.next();
				for (int i = 0; i < cardNo.length; i++) {
					if (name[i].equals(name1) && pass[i].equals(pass1)) {
						System.out.println("登录成功！");
					} else
						System.out.println("登录失败！");
				}
				break;
			case 3:
				System.out.println(">抽奖");
				int[] cardNos = new int[5];
				//生成随机数组
				for (int i = 0; i < cardNos.length; i++) {
					cardNos[i] = (int) (Math.random() * 10);
					for (int j = 0; j < i; j++) {
						if(cardNos[i] == cardNos[j]){
							cardNos[i] = (int) (Math.random() * 10);
							j=-1;
						}
					}
				}
				//打印数组
				for (int i = 0; i < cardNos.length; i++) {
					System.out.print(cardNos[i] + "\t");
				}
				//判断是否中奖
				boolean flag = false;
				for (int i = 0; i < cardNos.length; i++) {
					if (cardNos[i] == cardNo[index]) {
						flag = true;
						break;
					}
				}
				//输出结果
				if (flag)
					System.out.println("success");
				else
					System.out.println("false");
				break;

			default:
				break;
			}
			System.out.println("是否继续吗？");
//			yn = input.next();
			yn = "y";
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("thanks!");
	}
}
