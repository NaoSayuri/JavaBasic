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

		String name;
		 int additionalDamage;

		public int getAdditionalDamage() {
				return this.additionalDamage;

		}

			public void setAddtionalDamage(int additionaldamage) {
				this.additionalDamage = additionalDamage;
			}

		public Item(String name, int additionalDamage){
			this.name = name;
			this.additionalDamage = additionalDamage;

		}




}
