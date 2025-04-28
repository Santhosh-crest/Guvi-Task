package day10;
import java.util.*;
public class Grade {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int a=sc.nextInt();
	    if(a>100){
	        System.out.print("invalid");
	    }
	    else if(a==100){
	        System.out.print("S");
	    }
	    else if(a>=90 && a<=99){
	        System.out.print("A");
	    }else if(a>=80 && a<=89){
	        System.out.print("B");
	    }else if(a>=70 && a<=79){
	        System.out.print("C");
	    }else if(a>=60 && a<=69){
	        System.out.print("D");
	    }else if(a>=50 && a<=59){
	        System.out.print("E");
	    }
	    else{
	        System.out.print("less than 1");
	    }
	}


}
