 import java.util.Scanner;
public class A1{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int ran = (int)(Math.random()*100)+1;
		while (true) {
		System.out.print("수를 입력해주세요. : ");
		int a = sc.nextInt();
		if (a==ran){ 
		System.out.print ("정답입니다!");
		break;
			}
		else if (a>ran) System.out.print ("Down!");
		else if (a<ran) System.out.print ("Up!");
		else System.out.print ("다시 입력해주세요.");
		}
	}
}