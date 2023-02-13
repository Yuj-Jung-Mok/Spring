package lec01Pjt001;

import operator.Calculator;

public class MyCaculator {

	private int fNum, sNum;
	private Calculator calculator;

	// 들어오는 객체에 따라서 다양한 기능을 구현함. (컨테이너 개념)
	public MyCaculator(int fNum, int sNum, Calculator calculator) {
		this.fNum = fNum;
		this.sNum = sNum;
		this.calculator = calculator;
	}

	public void result() {
		int value = calculator.sum(this.fNum, this.sNum);
		System.out.println("Result : " + value);
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public int getfNum() {
		return fNum;
	}

	public void setfNum(int fNum) {
		this.fNum = fNum;
	}

	public int getsNum() {
		return sNum;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

}
