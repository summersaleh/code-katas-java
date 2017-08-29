package babysitter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabySitterTest {

	// Act
	BabySitter babySitter = new BabySitter();

	@Test
	public void startsAtFivePm() {
		Boolean number = babySitter.startTime(17);
		// Assert
		assertEquals(true, number);
	}

	@Test
	public void endsAtFourAm() {
		Boolean number = babySitter.endTime(4);
		// Assert
		assertEquals(true, number);
	}

	@Test
	public void startsAfterFivePm() {
		Boolean number = babySitter.startTime(18);
		// Assert
		assertEquals(true, number);
	}

	@Test
	public void endsBeforeFourAm() {
		Boolean number = babySitter.endTime(3);
		// Assert
		assertEquals(true, number);
	}
	
	@Test
	public void bedtimeAtEight() {
		Boolean number = babySitter.bedTime(20);
		assertEquals(true, number);
	}

//	@Test
//	public void shouldGetPaidFromStartToBedTime() {
//     int pay = babySitter.startToBedTimePayRate(startsAtFivePm() , bedtimeAtEight());
//     assertEquals(12, pay);
//	}

}
