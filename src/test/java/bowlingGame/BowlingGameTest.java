package bowlingGame;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

	private BowlingGame g;
	
	@Before
	public void setup() {
		g = new BowlingGame();
	}
	
	@Test
	public void shouldScoreGutterGame() {
		
		rollMany(20, 0);
		// Act
		int score = g.score();
		// Assert
		assertThat("Should be zero score - all gutterballs!", score, CoreMatchers.is(0));
		assertEquals("Should be zero score - all gutterballs!", 0, score);
		
	}

	private void rollMany(int numberOfTimes, int pins) {
		for (int i = 0; i < numberOfTimes; i++) {
			g.roll(pins);
		}
	}
	
	@Test
	public void shouldScoreAllOnes() {
		rollMany(20, 1);
		int score = g.score();
		assertThat(score, CoreMatchers.is(20));
		
	}
	
	@Test 
	public void shouldScoreOneSpare() {
		g.roll(5);
		g.roll(5);//spare
		g.roll(3);
		rollMany(17, 0);
		int score = g.score();
		assertThat(score, CoreMatchers.is(16));
		
	}

}
