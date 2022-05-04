package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public int getTotalRejected() {
		return totalRejected;
	}

	private int totalRejected = 0;


	public int reportRejected() {
		return getTotalRejected();
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			setTotalRejected(getTotalRejected() + 1);
		else
			super.countIn(in);
	}

	public void setTotalRejected(int totalRejected) {
		this.totalRejected = totalRejected;
	}
	//ctrl + <- i ctrl + -> przełącza nas między plikami w edytorze
	//ctrl +alt + l reformatuje nam aktualny kod
}
