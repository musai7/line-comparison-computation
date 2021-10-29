package com.linecomparison.linecomparisonlogics;
import java.util.Scanner;
public class LengthOfLine {
public static void main(String[] args) {
	int x1=0,x2=0,y1=0,y2=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter x1 ,y1 ,x2 ,y2 values ");
	x1=sc.nextInt();
	y1=sc.nextInt();
	x2=sc.nextInt();
	y2=sc.nextInt();
	System.out.println(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
}
}
