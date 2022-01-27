package ch52.abstractexample2;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("쉬고있는 상담원이나 통화수가 적은 상담원에게 먼저 배분합니다");

	}

}
