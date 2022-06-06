package kadai_10_3;

import kadai.Hero;

public class SuperHero extends Hero {

	public void attack() {
       System.out.println(this.getName() + "の攻撃！！");
       System.out.println("怪物に" + this.getAt() + "ポイントのダメージを与えた！！");
       System.out.println(this.getName() + "の攻撃！！");
       System.out.println("怪物に" + this.getAt() + "ポイントのダメージを与えた！！");
	}


}
