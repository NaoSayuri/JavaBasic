package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car[] car =  new Car[3];


		car[0].serialNo = 11111;
		car[1].serialNo = 22222;
		car[2].serialNo = 33333;

		car[0].color = "Red";
		car[1].color = "Blue";
		car[2].color = "Yellow";

		car[0].gasoline = 30;
		car[1].gasoline = 35;
		car[2].gasoline = 40;

		final int distance = 300;

		for(int i = 0 ; i < 3 ; i++){

			int m = 0;
			int n = 0;
			while(distance > m ) {

				int result = car[i].run();
				n++;

				if(result == -1) {
					System.out.println("目的地に到達できませんでした");
					break;
				} else {
					m += result;

				}

				if(m >= 300 ) {
					int x = car[i].gasoline;
					System.out.println("目的地にまで" + n +"時間かかりました。残りのガソリンは、" + x + "リットルです");
				}
			}

		}
	}
}
