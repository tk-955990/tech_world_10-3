package kadai_10_3;

import kadai.Hero;
import kadai.Magician;
import kadai.Monster;
import kadai.Story;

public class Story_10_3 {
	public static void main(String[] args) {
	
	// �E�҂̐���	
		
	SuperHero h2 = new SuperHero();

	h2.setName ("roto");
	h2.setHp      (100);
	h2.setAt       (50);
	h2.setDf       (80);

	System.out.println("�ւ荂���E�҂��������ɒa������");
	System.out.println("���O:"   + h2.getName());
	System.out.println("�̗�:"   + h2.getHp());
	System.out.println("�U����:" + h2.getAt());
	System.out.println("�h���:" + h2.getDf());


	// �����̐���

	SuperMonster m2 = new SuperMonster();
	m2.setName ("kaiju");
	m2.setHp       (150);
	m2.setAt       (100);
	m2.setDf       (120);
    m2.setP_at      (50);
    m2.setPoison     (5);

	System.out.println("�ЁX���������������ɒa������");
	System.out.println("���O:"     + m2.getName());
	System.out.println("�̗�:"     + m2.getHp());
	System.out.println("�U����:"   + m2.getAt());
	System.out.println("�h���:"   + m2.getDf());
	System.out.println("�ōU����:" + m2.getDf());
	System.out.println("�Ɛj�̐�:" + m2.getDf());
	
	
	// ���@�g���̐���

	SuperMagician mg2 = new SuperMagician();
	mg2.setName ("medeia");
	mg2.setHp        (100);
	mg2.setAt         (30);
	mg2.setMp         (50);
	mg2.setM_at       (50);

	System.out.println("���@�g���������ɒa������");
	System.out.println("���O:"       + mg2.getName());
	System.out.println("�̗�:"       + mg2.getHp());
	System.out.println("�U����:"     + mg2.getAt());
	System.out.println("MP:"         + mg2.getMp());
	System.out.println("�U�����@��:" + mg2.getM_at());

	h2.attack();
	mg2.super_magic_Attack() ;
	}
	
}
