package kadai_10_3;

public class SuperMonster {
	
	private int p_at;  
	private int poison;
	
	
	//  �ōU��
	void poison_Attack() {             
		System.out.println(this.getName() + "�͓Őj�ōU�������I");
		System.out.println("������" + this.p_at + "�̃_���[�W��^����");
		this.poison = this.poison - 1;
		System.out.println("�Ɛj���P�{���" + this.poison + "�|�C���g�ɂȂ���");
	}
}
