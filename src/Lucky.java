

import java.util.Scanner;

public class Lucky {
	public static void main(String[] args) {
		String yn = null;
		String[] name = new String[10];
		String[] pass = new String[10];
		int[] cardNo = new int[10];
		int index = -1;
		do {
			System.out.println("**********���*********");
			System.out.println("1��ע��");
			System.out.println("2����¼");
			System.out.println("3���齱");
			System.out.println("*********************");
			System.out.println("��ѡ��");
			Scanner input = new Scanner(System.in);
			int userSelect = input.nextInt();
			switch (userSelect) {
			case 1:
				for (int i = 0; i < name.length; i++) {
					if(name[i] == null){
						index = i;
					}
				}
				System.out.println(">ע��");
				System.out.println("����д��");
				System.out.println("�û�����");
				name[index] = input.next();
				System.out.println("���룺");
				pass[index] = input.next();
				System.out.println("�û�\t����\t����");
				cardNo[index] = (int) (Math.random() * 10);
				System.out.println(name + "\t" + pass + "\t" + cardNo[index]);
				break;
			case 2:
				System.out.println(">��¼");
				System.out.println("�û�����");
				String name1 = input.next();
				System.out.println("���룺");
				String pass1 = input.next();
				for (int i = 0; i < cardNo.length; i++) {
					if (name[i].equals(name1) && pass[i].equals(pass1)) {
						System.out.println("��¼�ɹ���");
					} else
						System.out.println("��¼ʧ�ܣ�");
				}
				break;
			case 3:
				System.out.println(">�齱");
				int[] cardNos = new int[5];
				//�����������
				for (int i = 0; i < cardNos.length; i++) {
					cardNos[i] = (int) (Math.random() * 10);
					for (int j = 0; j < i; j++) {
						if(cardNos[i] == cardNos[j]){
							cardNos[i] = (int) (Math.random() * 10);
							j=-1;
						}
					}
				}
				//��ӡ����
				for (int i = 0; i < cardNos.length; i++) {
					System.out.print(cardNos[i] + "\t");
				}
				//�ж��Ƿ��н�
				boolean flag = false;
				for (int i = 0; i < cardNos.length; i++) {
					if (cardNos[i] == cardNo[index]) {
						flag = true;
						break;
					}
				}
				//������
				if (flag)
					System.out.println("success");
				else
					System.out.println("false");
				break;

			default:
				break;
			}
			System.out.println("�Ƿ������");
//			yn = input.next();
			yn = "y";
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("thanks!");
	}
}
