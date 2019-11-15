package com.packages.Coffee;

import java.util.Arrays;
import java.util.Scanner;

public class Stage3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many ml of water the coffee machine has:");
		int water=sc.nextInt();

		System.out.println("How many ml of milk the coffee machine has:");
		int milk=sc.nextInt();

		System.out.println("How many grams of coffee beans the coffee machine has:");
		int beans=sc.nextInt();

		System.out.println("How many cups of coffee you will need:");
		int ncups=sc.nextInt();
		if(water==0 || milk==0 || beans==0 )
		{
			if(ncups==0)
			{
				System.out.println("Yes,I can make that amount of coffee");
			}
			else {
				System.out.println("No,I can make only 0 cups of coffee");
			}

		}
		else {
			//required water
			if(ncups==0)
			{
				int cwater=water/200;
				int cmilk=milk/50;
				int cbeans=beans/15;
				System.out.println("Yes,I can make that amount of coffee and even "+Math.min(cbeans,Math.min(cwater,cmilk))+" cups more than that");
			}else {
				int rwater=ncups*200;

				//required milk
				int rmilk=50*ncups;

				//required beans
				int rbeans=15*ncups;

				//extra water
				int ewater=water/rwater;

				//extra milk
				int emilk=milk/rmilk;

				//extra beans
				int ebeans=beans/rbeans;

				int extra_cups=Math.min(ebeans,Math.min(ewater,emilk));
				int cwater=water/200;
				int cmilk=milk/50;
				int cbeans=beans/15;
				int c_cups=Math.min(cbeans,Math.min(cwater,cmilk));
				if(c_cups>ncups)
				{
					System.out.println("Yes,I can make that amount of coffee (and even "+(c_cups-ncups)+" cups more than that)");
				}
				else if(extra_cups==ncups)
				{
					System.out.println("Yes,I can make that amount of coffee");
				}
				else if(ncups>extra_cups){
					int owater=water/200;
					int omilk=milk/50;
					int obeans=beans/15;
					System.out.println("No,I can make only "+Math.min(obeans,Math.min(owater,omilk)));
				}
			}
		}
	}

}
