package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */

		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < i ; j++) {
				System.out.print("■");
			}
			for(int j = 0; j < 5-i; j++) {
				System.out.print("□");
			}
				System.out.println();
		}

		for(int s =0; s < 4; s++) {
			for(int d =0; d< 4-s; d++) {
				System.out.print("■");
			}
			for(int d =0; d < s+1; d++) {
				System.out.print("□");
			}
			System.out.println();
		}
	}
}
