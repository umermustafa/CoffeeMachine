package com.packages.Coffee;

import java.util.Scanner;

public class Stage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many cups of coffee you will need:");
		int ncups=sc.nextInt();
		int water=ncups*200;
		int milk=50*ncups;
		int beans=15*ncups;
		System.out.println("For "+ncups+" of coffee you will need:");
		System.out.println(water+" ml of water");
		System.out.println(milk+" ml of milk");
		System.out.println(beans+" g of coffee beans");
	}

}
