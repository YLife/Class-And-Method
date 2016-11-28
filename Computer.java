package day1128;

public class Computer {
	String name;
	int score;
	public int fist(){
		int input=(int)(Math.random()*3+1);
		/*if (input==1) {
			System.out.println(name+"出拳:剪刀");
		}else if(input==2){
			System.out.println(name+"出拳:石头");
		}else if(input==3){
			System.out.println(name+"出拳:布");
		}*/
		String str = input==1?"出拳:剪刀":input==2?"出拳:石头":"出拳:布";
		Game n=new Game();
		System.out.println(name+str);
		return input;
	}
}
