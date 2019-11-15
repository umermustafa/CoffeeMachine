package com.packages.Coffee;

import java.util.Scanner;

public class Stage5 {

	
	static Scanner sc=new Scanner(System.in);
	static int money=550;
	static int water=1200;
	static int milk=540;
	static int coffee=120;
	static int cups=120;
	static void currentState()
	{
		System.out.println();
		System.out.println("Remaining Resources");
		System.out.println("The coffee machine has:");
		System.out.println(water+" ml of water");
		System.out.println(milk+" ml of milk");
		System.out.println(coffee+" g of coffee beans");
		System.out.println(cups+" of disposible cups");
		System.out.println(money+" of money");
		System.out.println();
	}
	static void buy() {
		
			System.out.println("Which type of coffee do you want");
			System.out.println("Press 1 for espresso\nPress 2 for latte \nPress 3 for cappuccino \nPress 4 to go back.");
			int n=(int)sc.nextInt();
			if(n==1) {
				if(water>=250 && coffee>=16 && cups>=1) {
					water-=250;
					coffee-=16;
					money+=4;
					cups-=1;
				}
				else {
					System.out.println("You don't have enough ingredients");
				}
				
			}
			else if(n==2) {
				if(water>=350 && milk>=75 && coffee>=20 && cups>=1) {
					water-=350;
					milk-=75;
					coffee-=20;
					money+=7;
					cups-=1;
				}
				else {
					System.out.println("You don't have enough ingredients");
				}
				
			}
			else if(n==3) {
				if(water>=200 && milk>=100 && coffee>=12 && cups>=1){
					water-=200;
					milk-=100;
					coffee-=12;
					money+=6;
					cups-=1;
				}
				else {
					System.out.println("You don't have enough ingredients or don't have enough money");
				}	
			}
			else if (n==4) {
				return;
			}
			else {
				System.out.println("Wrong input");
				return;
			}
			System.out.println("Your coffee is ready");
		
	}
	static void fill() {
		currentState();
		System.out.println("How many ml of water you want to add: ");
		int addwater=sc.nextInt();
		System.out.println("How many ml of milk do you want to add: ");
		int addmilk=sc.nextInt();
		System.out.println("How many grams of coffee beans do you want to add: ");
		int addcoffee=sc.nextInt();
		System.out.println("How many disposable cups of coffee do you want to add:");
		int addcups=sc.nextInt();
		water+=addwater;
		milk+=addmilk;
		coffee+=addcoffee;
		cups+=addcups;
		currentState();
	}
	static void take() {
		System.out.println("I gave you $ "+money);
		money=0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String action; 
		do {
			System.out.println("Write action (buy, fill, take, remaining, exit):");
			//action=sc.nextLine().toLowerCase();
			//System.out.println("Press 1 for Buy \n Press 2 for Fill \n Press 3 for Take \n Press 0 for exit \n Press 4 to check the remaining");
			action=sc.next();
			
			if(action.equalsIgnoreCase("Buy")) {
				
				buy();
			}
			else if (action.equalsIgnoreCase("Fill")) {
				fill();
			}
			else if (action.equalsIgnoreCase("Take")){
				take();
			}
			else if (action.equalsIgnoreCase("Remaining")){
				currentState();
			}
			else {
				if(action.equalsIgnoreCase("Exit"))
				{
					System.out.println("Exit");
					System.exit(0);
				}
				else {
					System.out.println("Wrong Input");
				}
				
				//System.exit(1);
			}
		} while (true );
		
	}

}
