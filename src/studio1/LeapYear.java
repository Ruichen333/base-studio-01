package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert a number.");
		int num=in.nextInt();
		boolean isLeap;
		isLeap=(num%400==0)||((num%4==0)&&(num%100!=0));
		System.out.println(isLeap);
	}

}
