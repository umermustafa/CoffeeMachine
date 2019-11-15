package com.packages.Coffee;

import java.util.Scanner;

public class CoffeeMachine {
	//Different states of coffee machine

	enum State{
		chooseaction,choosevariant,fillmilk,fillwater,fillcups,fillbeans;
	}
	public State state;
	int money;
	int water;
	int milk;
	int coffee;
	int cups;
	boolean button;

	//Constructor

	public CoffeeMachine(int water,int milk,int coffee,int cups,int money) {
		this.money=money;
		this.water=water;
		this.milk=milk;
		this.coffee=coffee;
		this.cups=cups;
		this.state=State.chooseaction;
		this.button=true;
	}

	public String remainingContent() {
		return "The coffee machine has \n"+this.water+" ml of water\n"+this.milk+" ml of milk\n"+this.coffee+" g of coffee beans\n"+this.cups+" of disposable cups\n"+"$"+this.money+" of money";

	}

	//Coffee Machine Working

	public String input(String command) {
		String result="";

		// Menu for the coffee machine

		if (this.state==State.chooseaction) {
			switch (command) {
			case "buy":
				this.state=State.choosevariant;
				result="What do you want to buy?\n1 - espresso\n2 - latte\n3 - cappuccino\nback - to main menu:";
				break;
			case "fill":
				this.state=State.fillwater;
				result="How many ml of water you want to add: ";
				break;
			case "take":
				result="I gave you $"+this.money+"\n\nWrite action (buy, fill, take, remaining, exit):";
				this.money=0;
				break;
			case "remaining":
				result=this.remainingContent()+"\n\nWrite action (buy, fill, take, remaining, exit):";
				break;
			case "exit":
				this.button=false;	
				result="Coffee Machine is turned off";
				break;
			default:
				result="Write action (buy, fill, take, remaining, exit):";
			}
		}

		// Variant of Coffee

		else if (this.state==State.choosevariant)
		{
			switch (command) {

			// Espresso

			case "1":
				if(this.water>=250 && this.coffee>=16 && this.cups>=1) {
					this.water-=250;
					this.coffee-=16;
					this.money+=4;
					this.cups-=1;
					result="I have enough resources, making you a coffee";
				}
				else {
					if(this.water<250) {
						result="You don't have enough water";
					}
					if (this.coffee<16) {
						result="You don't have enough coffee beans";
					}
					if (this.cups<1) {
						result="You don't have enough cups";
					}

				}
				this.state=State.chooseaction;
				result=result+"\n\nWrite action (buy, fill, take, remaining, exit):";
				break;

				// Latte

			case "2":
				if(this.water>=350 && this.coffee>=20  && this.milk>=75 && this.cups>=1) {
					this.water-=350;
					this.coffee-=20;
					this.money+=7;
					this.milk-=75;
					this.cups-=1;
					result="I have enough resources, making you a coffee";
				}
				else {
					if(this.water<350) {
						result="You don't have enough water";
					}
					if (this.coffee<20) {
						result="You don't have enough coffee beans";
					}
					if (this.milk<75) {
						result="You don't have enough milk";
					}
					if (this.cups<1) {
						result="You don't have enough cups";
					}
				}
				this.state=State.chooseaction;
				result=result+"\n\nWrite action (buy, fill, take, remaining, exit):";
				break;

				// Capuccino

			case "3":
				if(this.water>=200 && this.coffee>=12 && this.milk>=100 && this.cups>=1) {
					this.water-=250;
					this.milk-=200;
					this.coffee-=16;
					this.money+=4;
					this.cups-=1;
					result="I have enough resources, making you a coffee";
				}
				else
				{
					if(this.water<200) {
						result="You don't have enough water";
					}
					if (this.coffee<12) {
						result="You don't have enough coffee beans";
					}
					if (this.milk<100) {
						result="You don't have enough milk";
					}
					if (this.cups<1) {
						result="You don't have enough cups";
					}

				}
				this.state=State.chooseaction;
				result=result+"\n\nWrite action (buy, fill, take, remaining, exit):";
				break;
			case "back":
				result="\nWrite action (buy, fill, take, remaining, exit):";
				this.state=State.chooseaction;
				break;
			default:
				result="\nWhat do you want to buy?\n1 - espresso\n2 - latte\n3 - cappuccino\nback - to main menu:";
			}
		}
		
		//Filling Water
		
		else if (this.state==State.fillwater) {
			try {
				this.water+=Integer.parseInt(command);
				this.state=State.fillmilk;
				result="How many ml of milk do you want to add: ";
			} catch (Exception e) {
				result="How many ml of water do you want to add: ";
			}
		}
		
		//Filling Milk
		
		else if (this.state==State.fillmilk) {
			try {
				this.milk+=Integer.parseInt(command);
				this.state=State.fillbeans;
				result="How many g of coffee beans do you want to add: ";
			} catch (Exception e) {
				result="How many ml of milk do you want to add: ";
			}
		}
		
		//Filling Beans
		
		else if (this.state==State.fillbeans) {
			try {
				this.coffee+=Integer.parseInt(command);
				this.state=State.fillcups;
				result="How many  cups do you want to add: ";
			} catch (Exception e) {
				result="How many g of coffee do you want to add: ";
			}
		}
		
		//Filling Cups
		
		else if (this.state==State.fillcups) {
			try {
				this.coffee+=Integer.parseInt(command);
				this.state=State.chooseaction;
				result="\nWrite action (buy, fill, take, remaining, exit):";
			} catch (Exception e) {
				result="How many cups do you want to add: ";
			}
		}
		else {
			result="nWrite action (buy, fill, take, remaining, exit):";
		}
		return result;
	}

}