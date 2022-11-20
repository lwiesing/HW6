package HW6;



public class Main {
	public static void main(String[] args) {

Game_Chair chair= new Game_Chair();


chair.start();

chair.findWinner(chair.computer, chair.player_2);
	

}
}