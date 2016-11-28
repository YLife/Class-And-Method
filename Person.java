package day1128;

import java.util.Scanner;

public class Person {
	String name;
	int score;
	public int fist(){
		System.out.print("请出拳:1.剪刀 2.石头 3.布(输入相应数字):");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if (input==1) {
			System.out.println("你出拳:剪刀");
		}else if(input==2){
			System.out.println("你出拳:石头");
		}else if(input==3){
			System.out.println("你出拳:布");
		}else{
			System.out.println("输入有误");
		}
		return input;
	}
}
