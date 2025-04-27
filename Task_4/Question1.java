package taskpackage;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(a+b>c+d){
		    System.out.println("sum of a and b is greater than the sum of c and d");
		}else{
		    System.out.println("sum of a and b is lesser than the sum of c and d");
		}
	}

	}


