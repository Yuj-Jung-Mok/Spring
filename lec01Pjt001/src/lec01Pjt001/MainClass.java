package lec01Pjt001;

import operator.CalAdd;
import operator.CalDiv;
import operator.CalMul;
import operator.CalSub;

public class MainClass {

	public static void main(String[] args) {
		
		MyCaculator calculator;
		
		calculator = new MyCaculator(10, 5, new CalAdd());
		calculator.result();
		
		calculator = new MyCaculator(10, 5, new CalDiv());
		calculator.result();
		
		calculator = new MyCaculator(10, 5, new CalMul());
		calculator.result();
		
		calculator = new MyCaculator(10, 5, new CalSub());
		calculator.result();
		
	}
	
}
