package bowlingGame;

public class BowlingGame {
	private int rolls[] = new int[21];
	private int currentRoll = 0;

	public void roll(int pins) {
		// remember this is the same as..
		// rolls[currentRoll] = pins;
		// currentRoll++;
		rolls[currentRoll++] = pins;
	}

	public int score() {
		int score = 0;
		int index = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (rolls[index] + rolls[index + 1] == 10) {
				score += 10 + rolls[index + 2];
			} else {
				score += rolls[index] + rolls[index + 1];
			}

			index += 2;
		}
		for (int roll : rolls) {
			score += roll;
		}
		return score;
	}

}
