package check;

import constants.Constants;

public class Check {

	   //課題①
	private static String firstName = "岡崎";
	private static String lastName = "由花";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		printName(firstName, lastName);

		//課題③
		Pet pt = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pt.introduce();

		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		rp.introduce();
	}

	//課題②
	private static void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド →　" + firstName + lastName);

	}
}