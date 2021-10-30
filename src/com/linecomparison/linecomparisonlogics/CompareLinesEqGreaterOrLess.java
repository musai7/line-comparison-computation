package com.linecomparison.linecomparisonlogics;
import java.util.Scanner;
public class CompareLinesEqGreaterOrLess {
	public static void main(String[] args) {
		int x1 = 0, x2 = 0, y1 = 0, y2 = 0, p1, p2, q1, q2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x1 ,y1 ,x2 ,y2 values ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		int lenght1 = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("enter p1 ,q1 ,p2 ,q2 values ");
		p1 = sc.nextInt();
		q1 = sc.nextInt();
		p2 = sc.nextInt();
		q2 = sc.nextInt();
		int lenght2 = (int) Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
		Integer len1=lenght1;
		Integer len2=lenght2;
		int res =len1.compareTo(len2);
		if (res == 0) {
			System.out.println(" two line lenghts are equal ");
		} else if (res > 0) {
			System.out.println(" line One lenght is greater than line two lenght  ");
		} else {
			System.out.println(" line One lenght is lesser than line two lenght  ");
		}
	}
}