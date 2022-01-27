package ch52.abstractexample2;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("고객의 등급에 따라 업무능력순으로 상담원을 배치합니다.");

	}

}
