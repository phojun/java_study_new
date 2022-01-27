package ch52.abstractexample;

public class Beginnerlevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");

	}

	@Override
	public void jump() {
		System.out.println("jump 불가");

	}

	@Override
	public void turn() {
		System.out.println("turn 불가");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 초급자 레벨입니다. ******");

	}

}
