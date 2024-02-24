package com.test.OOPS;

public class FinalKeyWordExamples {

	private  int speed =10;

	public final int changeSpeed(){
		speed = 50;
		return speed;
	}
}
class FinalKeyWordExamples1 extends FinalKeyWordExamples{



	public static void main(String[] args) {

		FinalKeyWordExamples f = new FinalKeyWordExamples();
		f.changeSpeed();
	}
}