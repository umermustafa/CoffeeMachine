package com.packages.Coffee;

import java.util.Scanner;

public class Stage6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		boolean flag=false;
		String action=""; 
		//Creating an object of coffee machine
		CoffeeMachine c1=new CoffeeMachine(400,540,120,9,550);
		//While Coffee Machine is turned on
		while (c1.button) {
			if (flag) {
				action=sc.next().trim().toLowerCase();
			}
			flag=true;
			System.out.println(c1.input(action));
		}
		sc.close();

	}

}
