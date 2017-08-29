package babysitter;

public class BabySitter {

	public Boolean startTime(int startTime) {
			return startTime >= 17;
	}

	public Boolean endTime(int endTime) {
		return endTime <= 4;
	}

	public Boolean bedTime(int bedTime) {
		return bedTime == 20;
	}

	public int startToBedTimePayRate(int pay) {
		return 12;
	}

	


}
