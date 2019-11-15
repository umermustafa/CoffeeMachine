package com.packages.Coffee;

import java.util.Scanner;

public class Stage4 {

	static Scanner sc=new Scanner(System.in);
	static int money=550;
	static int water=1200;
	static int milk=540;
	static int coffee=120;
	static int cups=120;
	static void currentState()
	{
		System.out.println();
		System.out.println("The coffee machine has:");
		System.out.println(water+" ml of water");
		System.out.println(milk+" ml of milk");
		System.out.println(coffee+" g of coffee beans");
		System.out.println(cups+" of disposible cups");
		System.out.println(money+" of money");
		System.out.println();
	}
	static void buy() {
		currentState();
		System.out.println("Which type of coffee do you want");
		System.out.println(" Press 1 for espresso\nPress 2 for latte \nPress 3 for cappuccino ");
		int n=sc.nextInt();
		if(n==1) {
			if(water>=250 && coffee>=16 && money>=4) {
				water-=250;
				coffee-=16;
				money-=4;
			}
			else {
				System.out.println("You don't have enough ingredients");
			}

		}
		else if(n==2) {
			if(water>=350 && milk>=75 && coffee>=20 && money>=7) {
				water-=350;
				milk-=75;
				coffee-=20;
				money-=7;
			}
			else {
				System.out.println("You don't have enough ingredients");
			}

		}
		else if(n==3) {
			if(water>=200 && milk>=100 && coffee>=12 && money>=6){
				water-=200;
				milk-=100;
				coffee-=12;
				money-=6;
			}
			else {
				System.out.println("You don't have enough ingredients or don't have enough money");
			}	
		}
		else {
			System.out.println("Wrong input");
		}
		System.out.println("Your coffee is ready");
		currentState();
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
		currentState();
		System.out.println("I gave you $ "+money);
		money=0;
		currentState();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	String action;
		int action; 
		System.out.println("Press 1 for Buy \n Press 2 for Fill \n Press 3 for Take \n Press 0 for exit");
		action=sc.nextInt();

		if(action==1) {

			buy();
		}
		else if (action==2) {
			fill();
		}
		else if (action==3){
			take();
		}
		else {
			if(action==0)
			{
				System.out.println("Exit");
			}
			else {
				System.out.println("Wrong Input");
			}
		}
	}


}
