package kadai_10_3;

import kadai.Monster;

public class SuperMonster extends Monster {

	private int p_at;  
	private int poison;

	//  毒攻撃  
	                                      //  勇者への毒攻撃
	public void poison_Attack1() {             
		System.out.println(this.getName() + "は毒針で攻撃した！");
		System.out.println("勇者に" + this.p_at + "のダメージを与えた");
		this.poison = this.poison - 1;
		// h2.setHp=h2.setHp-m2.setP_at ;
		System.out.println("独針が１本消費し" + this.poison + "本になった");
	}                                     //  魔法使いへの毒攻撃
	public void poison_Attack2() {             
		System.out.println(this.getName() + "は毒針で攻撃した！");
		System.out.println("魔法使いに" + this.p_at + "のダメージを与えた");
		this.poison = this.poison - 1;
		// mg2.setHp=mg2.setHp-m2.setP_at ;
		System.out.println("独針が１本消費し" + this.poison + "本になった");
	}

	public void setP_at(int p_at) {
		// TODO 自動生成されたメソッド・スタブ
		this.p_at=p_at;
	}

	public void setPoison(int poison) {
		// TODO 自動生成されたメソッド・スタブ
		this.poison=poison;
	}

	public  int getPoison() {
		// TODO 自動生成されたメソッド・スタブ
		return this.poison;
	}

	public int getP_at() {
		// TODO 自動生成されたメソッド・スタブ
		return this.p_at;
	}
}
