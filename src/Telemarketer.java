import java.util.Scanner;
public class Telemarketer {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
			// TODO Auto-generated method stub
		/*
		 * Follow the instructions in JuniorProblem.pdf
		 * Use the following values to test your program and record your results
		 * 1) 8,6,6,7 Not
		 * 2) 7,6,6,8 Not
		 * 3) 9,5,6,9 Not
		 * 4) 3,4,5,6 Not
		 * 5) 0,8,8,0 Not
		 * 6) 8,5,5,9 Yes
		 * 7) 9,1,1,9 Yes
		 * 8) 9,9,9,9 Yes
		 * 9) 9,1,2,8 Not
		 * 10) 8,7,4,8 Not
		 * 11) 8,2,2,7 Not
		 * 12) 1,3,3,9 Not
		 * 13) 1,0,2,6 Not
		 */
		
		
	

		System.out.println("What is the fourth phone digit?");
		int num1=in.nextInt();
		System.out.println("What is the fifth digit?");
		int num2=in.nextInt();
		System.out.println("What is the sixth digit?");
		int num3=in.nextInt();	
		System.out.println("What is the last digit?");
		int num4=in.nextInt();

		// TODO If num1= 8/9 and if num4= 8/9 and if num2=num3 print Ignore else Print Answer
		
		
		if (num1==8||num1==9) {
			if (num4==8||num4==9) {
				if (num2==num3); 		System.out.println("ignore");} else {
				 System.out.println("answer");
			}
			}

}}
