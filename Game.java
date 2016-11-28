package day1128;

import java.util.Scanner;

public class Game {
	int count;
	Person person = new Person();
	Computer computer = new Computer();

	public void initial() {
		System.out.println("--------欢 迎 进 入 游 戏 世 界--------");
		System.out.println();
		System.out.println("        *************");
		System.out.println("        **  猜拳开始    **");
		System.out.println("        *************");
		System.out.println();
		System.out.println("出拳规则:1.剪刀 2.石头 3.布");
		Scanner sc = new Scanner(System.in);
		System.out.print("请选择对方角色:1：刘备 2：孙权 3：曹操:");
		int input = sc.nextInt();
		System.out.print("请输入你的姓名:");
		person.name = sc.next();
		computer.name = input == 1 ? "刘备" : input == 2 ? "孙权" : "曹操";
		System.out.println(person.name + " VS " + computer.name + " 对战");
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("要开始吗？ (y/n) :");
		while (true) {
			String x = sc.next();
			System.out.println();
			if ("y".equals(x)) {
				int a = person.fist();
				int b = computer.fist();
				count ++;
				if(isWin(a, b)){
					System.out.println("结果：恭喜，你赢了！");
					person.score ++;
				} else if (a == b) {
					System.out.println("结果：和局！");
				} else {
					System.out.println("结果：你是大笨蛋");
					computer.score ++;
				}
			} else {
				break;
			}
			System.out.println();
			System.out.print("继续下一轮? y/n :");
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
		System.out.println("对战次数：" + count);
		System.out.println();
		System.out.println("姓名" + "     得分");
		System.out.println(person.name + "   " + person.score);
		System.out.println(computer.name + "     " + computer.score);
		System.out.println();
		if (person.score > computer.score) {
			System.out.println("结果：恭喜恭喜！");
		} else if (person.score == computer.score) {
			System.out.println("结果：平局！");
		} else {
			System.out.println("结果：你是大笨蛋！");
		}
		System.out.println("--------------------------------");
	}
}
