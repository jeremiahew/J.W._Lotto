/**	Lottery.java
	Emulate a lottery machine
	@author Jeremiah Wright
	@version February 
*/

import java.util.*;


public class Lottery {

private int[] winners= new int [5];	
private int[] picks= new int[5];


private Scanner sc = new Scanner(System.in);

public void play(){
	int choice;
	System.out.println("Welcome To J.W. Lotto\n");
	System.out.println("$3 for two matches, $20 for three matches,"
			+ " $100 for four matches, and $500 for five matches.\n");

/**
pay off 
$3 for two matches, $20 for three matches, 
$100 for four matches, and $500 if all five guesses match.
*/ 
	
	
	for (;;) {
		System.out.println("Select 1 to pay $1 and play.\n");
		choice = sc.nextInt();
		if (choice > 0 && choice < 2)break;
		String junk = sc.nextLine(); // Discard chars to end of line.
		System.out.printf("Bad menu choice:  %s %s\n", choice, junk);
	}
		
		//System.out.printf("Please pick a number between 1-35: \t");

		
		for (int k=0; k< picks.length; k++)
		{
			
			for (;;) {
			System.out.printf("Please pick a number between 1-35: \n\t");
			picks[k] = sc.nextInt(); 		//validate
			if (picks[k] > 0 && picks[k] < 36)break;
			String junk = sc.nextLine(); // Discard chars to end of line.
			System.out.printf("Bad menu choice:  %s %s\n", choice, junk);
		}
		}
		
		System.out.println("Your numbers are:");
		
		for (int k=0; k< picks.length; k++)
		{
		System.out.printf("\t" + picks[k]);
		}
		
	
		for (int k=0; k< winners.length; k++)
		{
			winners[k] = (int) (Math.random()*35)+1;
		}
		
		System.out.println("\nThe winning numbers are:" );
		
		for (int k=0; k< winners.length; k++)
		{
		System.out.printf("\t" + winners[k]);
		}

	}
	

public void score(){
	
	int count;
	 
	count = FindPicks();
	
	System.out.printf("\n\nYou have %d matches.\n", count);
	
	if(count == 0 || count == 1){
		System.out.printf("Sorry, better luck next time!");
	}
	
	else if (count == 2){
		System.out.printf("Congratultions! You have won $3");
	}
	
	else if(count == 3){
		System.out.printf("Congratultions! You have won $20");
	}
	
	else if(count == 4){
		System.out.printf("Congratultions! You have won $100");
	}
	
	else if(count == 5){
		System.out.printf("Congratultions! You have won $500");
	}
	}
	
	

public int FindPicks(){

	int keeper=0; 
	
	for(int m=0; m<5; m++){
		if(search(picks[m])){
			keeper++;	
		
		}
		
	}
	return keeper;
}


public boolean search(int pick){
	
	for(int m=0; m<5; m++){
		if (pick == winners[m]){
		winners[m]=0;
		return true;
		}
	}
	return false;
		
}


	public static void main (String args[]) {
        Lottery L = new Lottery();
        L.play();
        L.score();
        
	}	
}

/* =======================================================
Welcome To J.W. Lotto

$3 for two matches, $20 for three matches, $100 for four matches, and $500 for five matches.

Select 1 to pay $1 and play.

1
Please pick a number between 1-35: 
	25 14 26 32 8
Please pick a number between 1-35: 
	Please pick a number between 1-35: 
	Please pick a number between 1-35: 
	Please pick a number between 1-35: 
	Your numbers are:
	25	14	26	32	8
The winning numbers are:
	9	34	5	18	29

You have 0 matches.
Sorry, better luck next time!

//=============================================================
Welcome To J.W. Lotto

$3 for two matches, $20 for three matches, $100 for four matches, and $500 for five matches.

Select 1 to pay $1 and play.

1
Please pick a number between 1-35: 
	14 12 32 4 8
Please pick a number between 1-35: 
	Please pick a number between 1-35: 
	Please pick a number between 1-35: 
	Please pick a number between 1-35: 
	Your numbers are:
	14	12	32	4	8
The winning numbers are:
	8	12	34	18	20

You have 2 matches.
Congratultions! You have won $3
*/