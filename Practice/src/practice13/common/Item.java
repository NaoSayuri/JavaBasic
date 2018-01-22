package practice13.common;

public class Item {


	/*
	 * フィールド
	 * 		name	:	String
	 * 		additionalDamage	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 * コンストラクタ
	 * 		name, additionalDamageに初期値を設定するコンストラクタ
	 * 		上記2つを設定するための引数を持つ
	 */

		private String name;
		private int additionalDamage;

		public int getAdditionalDamage() {
				return this.additionalDamage;

		}

			public void setAddtionalDamage(int additional) {
				this.additionalDamage = additionalDamage;
			}

		Item(String name, int additionalDamage){
			this.name = name;
			this.additionalDamage = additionalDamage;

		}




}
