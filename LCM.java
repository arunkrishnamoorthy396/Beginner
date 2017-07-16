package Beginner;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int max,min,lcm=0,x;
int a = sc.nextInt();
int b = sc.nextInt();
if(a>b){
	 max =a;
min = b;  }
else{ 
	 max= b;
     min =a;  }
	
	
	
	for(int i=1;i<=min;i++)
	   {
	    x=max*i;
	    if(x%min==0) 
	     {
	      lcm=x; 
	      break; 
	     }
	    }
	System.out.println(lcm);
}
}
