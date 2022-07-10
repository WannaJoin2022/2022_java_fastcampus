package ch16_gameLevel;

public abstract class PlayerLevel {
//	int run(int run);
//	int jump(int jump);
//	int turn(int turn);

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	
	public void go(int count) {
		run();
		for(int i=0; i< count; i++) {
			jump();
		}
		turn();
	}
}
