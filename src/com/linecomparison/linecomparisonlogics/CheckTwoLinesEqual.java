package com.linecomparison.linecomparisonlogics;

import java.util.Scanner;
public class CheckTwoLinesEqual {
	//
	public static void main(String[] args) {
		int x1=0,x2=0,y1=0,y2=0,p1,p2,q1,q2;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter x1 ,y1 ,x2 ,y2 values ");
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();
		int lenght1=(int) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		Integer len1=lenght1;
		System.out.println("enter p1 ,q1 ,p2 ,q2 values ");
		p1=sc.nextInt();
		q1=sc.nextInt();
		p2=sc.nextInt();
		q2=sc.nextInt();
		int lenght2= (int)Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
		Integer len2= lenght2;
		if(len1.equals(len2)) {
		System.out.println(" two lines are equal ");
		}
		else
		System.out.println(" two lines are not equal ");
	}
}