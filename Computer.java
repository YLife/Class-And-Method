package day1128;

public class Computer {
	String name;
	int score;
	public int fist(){
		int input=(int)(Math.random()*3+1);
		/*if (input==1) {
			System.out.println(name+"��ȭ:����");
		}else if(input==2){
			System.out.println(name+"��ȭ:ʯͷ");
		}else if(input==3){
			System.out.println(name+"��ȭ:��");
		}*/
		String str = input==1?"��ȭ:����":input==2?"��ȭ:ʯͷ":"��ȭ:��";
		Game n=new Game();
		System.out.println(name+str);
		return input;
	}
}
