import java.util.Scanner;
public class ShiftySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		/*
		 * Follow the instructions in Junior Problem 2.pdf.
		 * Use the following data to test your program and record your answers
		 * 1) 1,0
		 * 2) 1,3
		 * 3) 99,4
		 * 4) 10000,5
		 * 5) 9139,4
		 * 6) 9252,5
		 * 7) 888,0
		 * 8) 4578,1
		 * 9) 2746,2
		 * 10) 6295,3
		 * 11) 6884,4
		 * 12) 1198,5
		 * 13) 8655,0
		 * 14) 2503,1
		 * 15) 7868,2
		 */
		
		System.out.println("What is your number?");
		int N=in.nextInt();
		System.out.println("How many shifts?");
		int k=in.nextInt();
		int A=0;
		int B=0;
		int C=0;
		int D=0;
		int E=0;
		int ans=0;
		int ans1=0;
		int ans2=0;
		int ans3=0;
		int ans4=0;
		int total=0;
		

if (k>0) {
	A=10^k;
	ans=N*A;
	k=k-1;
	
}

if (k>0) {
	B=10^k;
	ans1=N*B;
	k=k-1;
}

if (k>0) {
	C=10^k;
	ans2=N*C;
	k=k-1;
}


if (k>0) {
	D=10^k;
	ans3=N*D;
	k=k-1;
}


if (k>0) {
	E=10^k;
	ans4=N*E;
	k=k-1;
}

total=ans+ans1+ans2+ans3+ans4; 

	

		System.out.println("The total is"+total);
	}}

	





