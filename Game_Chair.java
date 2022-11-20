package HW6;

import java.util.Scanner;

public class Game_Chair {
	int i=0;
	
	Player player_2=new Player();
	Player computer= new Player();
	BetMore_Game Bet= new BetMore_Game();

	public void start() {
		computer.setCardC(computer.play());
		player_2.setCardP(player_2.play());
	    System.out.println("Number Computer: " + computer.getCardC());
	    System.out.println("Your Number: " + player_2.getCardP());

	    Scanner scanner = new Scanner(System.in);
	    while (true){
	        if(i<5) {
	            System.out.println("If you want to keep this number type in <<true>>, otherwise type in <<false>>!");
	            String s = scanner.next();	          
	            if (s.equals("true")) {
	                break;

	            } else if (s.equals("false")) {
	            	player_2.setCardP(player_2.play());
	                i++;
	                System.out.println("Your current number: " + player_2.getCardP());
	                System.out.println("You´ve got " + (5-i) + " attempts left.");
	            } else {
	                System.out.println("Invalid value");
	            }
	        } else {
	            break;
	        }
	    }
	    scanner.close();

	}
	
	public Player findWinner(Player computer, Player player_2) {
		if(computer.getCardC()> player_2.getCardP()) {
			System.out.println("Computer is the winner. You lost the game.");
			return computer;
		}
		else {
			System.out.println( "You are the winner!");
			return player_2;
		}
		
	}


}





