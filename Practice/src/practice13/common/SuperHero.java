package practice13.common;

public class SuperHero extends Hero {


	/*
	 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 *
	 * フィールド
	 * 		equipment	:	common.Item
	 * メソッド
	 * 		attackメソッドをオーバーライドし、
	 * 		powerに加えて、additionalDamage分を加算した値としてください
	 *
	 * 		equipmentのアクセサ
	 */


		String equipment;
		Item item;

		public int attack() {
			return super.attack() + item.getAdditionalDamage();
		}

	public String getEquipment() {
		return this.equipment;

	}

	public void setEqipmant() {
		this.equipment = equipment;
	}

}
