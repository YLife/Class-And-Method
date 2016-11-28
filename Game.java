package day1128;

import java.util.Scanner;

public class Game {
	int count;
	Person person = new Person();
	Computer computer = new Computer();

	public void initial() {
		System.out.println("--------�� ӭ �� �� �� Ϸ �� ��--------");
		System.out.println();
		System.out.println("        *************");
		System.out.println("        **  ��ȭ��ʼ    **");
		System.out.println("        *************");
		System.out.println();
		System.out.println("��ȭ����:1.���� 2.ʯͷ 3.��");
		Scanner sc = new Scanner(System.in);
		System.out.print("��ѡ��Է���ɫ:1������ 2����Ȩ 3���ܲ�:");
		int input = sc.nextInt();
		System.out.print("�������������:");
		person.name = sc.next();
		computer.name = input == 1 ? "����" : input == 2 ? "��Ȩ" : "�ܲ�";
		System.out.println(person.name + " VS " + computer.name + " ��ս");
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Ҫ��ʼ�� (y/n) :");
		while (true) {
			String x = sc.next();
			System.out.println();
			if ("y".equals(x)) {
				int a = person.fist();
				int b = computer.fist();
				count ++;
				if(isWin(a, b)){
					System.out.println("�������ϲ����Ӯ�ˣ�");
					person.score ++;
				} else if (a == b) {
					System.out.println("������;֣�");
				} else {
					System.out.println("��������Ǵ󱿵�");
					computer.score ++;
				}
			} else {
				break;
			}
			System.out.println();
			System.out.print("������һ��? y/n :");
		}

	}
	
	private boolean isWin(int a, int b){
		String[] win = { "13", "21", "32" };
		for (String string : win) {
			if(string.equals(""+a+b)){
				return true;
			}
		}
		return false;
	}

	public void result() {
		System.out.println("--------------------------------");
		System.out.println(computer.name + "  VS " + person.name);
		System.out.println("��ս������" + count);
		System.out.println();
		System.out.println("����" + "     �÷�");
		System.out.println(person.name + "   " + person.score);
		System.out.println(computer.name + "     " + computer.score);
		System.out.println();
		if (person.score > computer.score) {
			System.out.println("�������ϲ��ϲ��");
		} else if (person.score == computer.score) {
			System.out.println("�����ƽ�֣�");
		} else {
			System.out.println("��������Ǵ󱿵���");
		}
		System.out.println("--------------------------------");
	}
}
