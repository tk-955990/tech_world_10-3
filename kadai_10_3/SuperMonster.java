package kadai_10_3;

import kadai.Monster;

public class SuperMonster extends Monster {

	private int p_at;  
	private int poison;

	//  �ōU��
	public void poison_Attack() {             
		System.out.println(this.getName() + "�͓Őj�ōU�������I");
		System.out.println("������" + this.p_at + "�̃_���[�W��^����");
		this.poison = this.poison - 1;
		System.out.println("�Ɛj���P�{���" + this.poison + "�|�C���g�ɂȂ���");
	}
}
