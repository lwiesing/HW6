package HW6;

public class Player {
	private int cardC;
	private int cardP;
	private int x; 
	
	

	BetMore_Game Bet= new BetMore_Game();
	
	public int play() {
		x=Bet.pick_card();
		return x;
	}
	

	public int getCardC() {
		return cardC;
	}

	public void setCardC(int cardC) {
		this.cardC = cardC;
	}

	public int getCardP() {
		return cardP;
	}

	public void setCardP(int cardP) {
		this.cardP = cardP;
	}

	public int getX() {
		return x;
	}

	public void setX(int card) {
		this.x = card;
	}


}
