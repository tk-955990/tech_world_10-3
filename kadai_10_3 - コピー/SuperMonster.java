package kadai_10_3;

public class SuperMonster {
	
	private int p_at;  
	private int poison;
	
	
	//  毒攻撃
	void poison_Attack() {             
		System.out.println(this.getName() + "は毒針で攻撃した！");
		System.out.println("怪物に" + this.p_at + "のダメージを与えた");
		this.poison = this.poison - 1;
		System.out.println("独針が１本消費し" + this.poison + "ポイントになった");
	}
}
