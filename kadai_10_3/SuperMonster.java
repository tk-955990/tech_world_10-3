package kadai_10_3;

import kadai.Monster;

public class SuperMonster extends Monster {

	private int p_at;  
	private int poison;

	//  “ÅUŒ‚
	public void poison_Attack() {             
		System.out.println(this.getName() + "‚Í“Åj‚ÅUŒ‚‚µ‚½I");
		System.out.println("‰ö•¨‚É" + this.p_at + "‚Ìƒ_ƒ[ƒW‚ğ—^‚¦‚½");
		this.poison = this.poison - 1;
		System.out.println("“Æj‚ª‚P–{Á”ï‚µ" + this.poison + "ƒ|ƒCƒ“ƒg‚É‚È‚Á‚½");
	}
}
