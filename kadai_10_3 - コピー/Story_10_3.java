package kadai_10_3;

import kadai.Hero;
import kadai.Magician;
import kadai.Monster;
import kadai.Story;

public class Story_10_3 {
	public static void main(String[] args) {
	
	// 勇者の生成	
		
	SuperHero h2 = new SuperHero();

	h2.setName ("roto");
	h2.setHp      (100);
	h2.setAt       (50);
	h2.setDf       (80);

	System.out.println("誇り高き勇者が今ここに誕生した");
	System.out.println("名前:"   + h2.getName());
	System.out.println("体力:"   + h2.getHp());
	System.out.println("攻撃力:" + h2.getAt());
	System.out.println("防御力:" + h2.getDf());


	// 怪物の生成

	SuperMonster m2 = new SuperMonster();
	m2.setName ("kaiju");
	m2.setHp       (150);
	m2.setAt       (100);
	m2.setDf       (120);
    m2.setP_at      (50);
    m2.setPoison     (5);

	System.out.println("禍々しい怪物がここに誕生した");
	System.out.println("名前:"     + m2.getName());
	System.out.println("体力:"     + m2.getHp());
	System.out.println("攻撃力:"   + m2.getAt());
	System.out.println("防御力:"   + m2.getDf());
	System.out.println("毒攻撃力:" + m2.getDf());
	System.out.println("独針の数:" + m2.getDf());
	
	
	// 魔法使いの生成

	SuperMagician mg2 = new SuperMagician();
	mg2.setName ("medeia");
	mg2.setHp        (100);
	mg2.setAt         (30);
	mg2.setMp         (50);
	mg2.setM_at       (50);

	System.out.println("魔法使いがここに誕生した");
	System.out.println("名前:"       + mg2.getName());
	System.out.println("体力:"       + mg2.getHp());
	System.out.println("攻撃力:"     + mg2.getAt());
	System.out.println("MP:"         + mg2.getMp());
	System.out.println("攻撃魔法力:" + mg2.getM_at());

	h2.attack();
	mg2.super_magic_Attack() ;
	}
	
}
