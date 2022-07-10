package ch16_gameLevel;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		
		SuperLevel sLevle = new SuperLevel();
		player.upgradeLevel(sLevle);
		player.play(3);
		
	}
}
