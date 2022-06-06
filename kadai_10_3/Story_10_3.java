package kadai_10_3;

import kadai.Hero;
import kadai.Magician;
import kadai.Monster;
import kadai.Story;

public class Story_10_3 {
	public static void main(String[] args) {
	
	// —EÒ‚Ì¶¬	
		
	SuperHero h2 = new SuperHero();

	h2.setName ("roto");
	h2.setHp      (100);
	h2.setAt       (50);
	h2.setDf       (80);

	System.out.println("ŒÖ‚è‚‚«—EÒ‚ª¡‚±‚±‚É’a¶‚µ‚½");
	System.out.println("–¼‘O:"   + h2.getName());
	System.out.println("‘Ì—Í:"   + h2.getHp());
	System.out.println("UŒ‚—Í:" + h2.getAt());
	System.out.println("–hŒä—Í:" + h2.getDf());


	// ‰ö•¨‚Ì¶¬

	SuperMonster m2 = new SuperMonster();
	m2.setName ("kaiju");
	m2.setHp       (150);
	m2.setAt       (100);
	m2.setDf       (120);
    m2.setP_at      (50);
    m2.setPoison     (5);

	System.out.println("‰ĞX‚µ‚¢‰ö•¨‚ª‚±‚±‚É’a¶‚µ‚½");
	System.out.println("–¼‘O:"     + m2.getName());
	System.out.println("‘Ì—Í:"     + m2.getHp());
	System.out.println("UŒ‚—Í:"   + m2.getAt());
	System.out.println("–hŒä—Í:"   + m2.getDf());
	System.out.println("“ÅUŒ‚—Í:" + m2.getDf());
	System.out.println("“Æj‚Ì”:" + m2.getDf());
	
	
	// –‚–@g‚¢‚Ì¶¬

	SuperMagician mg2 = new SuperMagician();
	mg2.setName ("medeia");
	mg2.setHp        (100);
	mg2.setAt         (30);
	mg2.setMp         (50);
	mg2.setM_at       (50);

	System.out.println("–‚–@g‚¢‚ª‚±‚±‚É’a¶‚µ‚½");
	System.out.println("–¼‘O:"       + mg2.getName());
	System.out.println("‘Ì—Í:"       + mg2.getHp());
	System.out.println("UŒ‚—Í:"     + mg2.getAt());
	System.out.println("MP:"         + mg2.getMp());
	System.out.println("UŒ‚–‚–@—Í:" + mg2.getM_at());

	h2.attack();
	mg2.super_magic_Attack() ;
	}
	
}
