/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {


	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		 ArrayList<Player> array = new ArrayList<>();
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {

		            	String line = scanner.nextLine();

		            	String[] splitLine = line.split(",", 0);

		            	Player player = new Player();

		            player.setPosition(splitLine[0]);
		            player.setName(splitLine[1]);
		            player.setCountry(splitLine[2]);
		            player.setTeam(splitLine[3]);

	                array.add(player);

	            }
	        } catch (FileNotFoundException e) {
	        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

	        Collections.shuffle(array);

	        int gkcount = 0;
	        int dfcount = 0;
	        int mfcount = 0;
	        int fwcount = 0;


	        for( Player player : array) {
	        		if(player.getPosition().equals("GK") && gkcount < 1) {

	        		System.out.println( player.toString() );
	        		gkcount++;

	        		}

	        		if(player.getPosition().equals("DF") && dfcount < 4) {

		        		System.out.println( player.toString() );
		        		dfcount++;

		        		}
	        		if(player.getPosition().equals("MF") && mfcount < 4) {

		        		System.out.println( player.toString() );
		        		mfcount++;

		        		}
	        		if(player.getPosition().equals("FW") && fwcount < 2) {

		        		System.out.println( player.toString() );
		        		fwcount++;

		        		}

	        }

	}
}
