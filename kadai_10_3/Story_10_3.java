package kadai_10_3;

import java.util.Scanner;

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
		m2.setHp       (1500);
		m2.setAt       (100);
		m2.setDf       (120);
		m2.setP_at      (50);
		m2.setPoison     (5);

		System.out.println("�ЁX���������������ɒa������");
		System.out.println("���O:"     + m2.getName());
		System.out.println("�̗�:"     + m2.getHp());
		System.out.println("�U����:"   + m2.getAt());
		System.out.println("�h���:"   + m2.getDf());
		System.out.println("�ōU����:" + m2.getP_at());
		System.out.println("�Ɛj�̐�:" + m2.getPoison());


		// ���@�g���̐���

		SuperMagician mg2 = new SuperMagician();
		mg2.setName ("medeia");
		mg2.setHp        (500);
		mg2.setAt         (30);
		mg2.setMp         (50);
		mg2.setM_at       (50);

		System.out.println("���@�g���������ɒa������");
		System.out.println("���O:"       + mg2.getName());
		System.out.println("�̗�:"       + mg2.getHp());
		System.out.println("�U����:"     + mg2.getAt());
		System.out.println("MP:"         + mg2.getMp());
		System.out.println("�U�����@��:" + mg2.getM_at());


		System.out.println("========= Game Start !! ================");
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 50; i++) {      


			if(h2.getHp()<=0)
				System.out.println(h2.getName()+"�͎���ł���");
			else {

				//  �E�҂̃^�[��

				System.out.println("<<   �@�E�҂̍��́H   >>");
				System.out.println("�U��:1 �h��:2 �x�e:3 �I��:4");

				int get_hCommand = new java.util.Scanner(System.in).nextInt();

				switch (get_hCommand) {
				case 1:
					h2.attack();
					m2.setHp(m2.getHp()-h2.getAt());
					break;
				case 2:
					h2.defense();
					break;
				case 3:
					h2.heal();
					break;
				case 4:
				}
				System.out.println("�y"+ h2.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + h2.getHp());

				System.out.println("�y"+ mg2.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + mg2.getHp());
				System.out.println("MP:" + mg2.getMp());

				System.out.println("�y"+m2.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + m2.getHp());
				System.out.println("�Ɛj�̐�:"+m2.getPoison());
			}
			if(m2.getHp()<=0) {
				System.out.println("@@@@@@@@@@@  "+m2.getName()+"  ��|����  @@@@@@@@@@");
				System.out.println("========= You Winn !! ==================");
				break;
			}
			else 
				System.out.println("�E�҂̃^�[���I��");
			System.out.println("----------------------------------------");


			if(mg2.getHp()<=0)
				System.out.println("���@�g���͎���ł�");
			else {

				//  ���@�g���̃^�[��
				System.out.println("<<   ���@�g���̍��́H   >>");
				System.out.println("�U��:1 �U�����@:2 ���U�����@:3 �񕜖��@:4 �x�e:5 �I��:6");

				int get_mgCommand = new java.util.Scanner(System.in).nextInt();

				switch (get_mgCommand) {
				case 1:
					mg2.attack();
					m2.setHp(m2.getHp()-mg2.getAt());
					break;
				case 2:
					if(mg2.getMp()<10) {
						System.out.println("MP������܂���");
						break;
					}
					mg2.magic_Attack();
					m2.setHp(m2.getHp()-mg2.getM_at());
					break;	


				case 3:
					if(mg2.getMp()<20) {
						System.out.println("MP������܂���");
						break;
					}
					mg2.super_magic_Attack();
					m2.setHp(m2.getHp()-(mg2.getM_at())*2);
					break;
				case 4:
					if(mg2.getMp()<5) {
						System.out.println("MP������܂���");
						break;
					}
					mg2.magic_Recovery();
					break;
				case 5:
					mg2.heal();
					break;
				case 6:
					break ;

				}
				System.out.println("�y"+ h2.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + h2.getHp());

				System.out.println("�y"+ mg2.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + mg2.getHp());
				System.out.println("MP:" + mg2.getMp());

				System.out.println("�y"+m2.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + m2.getHp());
				System.out.println("�Ɛj�̐�:"+m2.getPoison());
			}
			if(m2.getHp()<=0) {
				System.out.println("@@@@@@@@@@@  "+m2.getName()+"  ��|����  @@@@@@@@@@");
				System.out.println("========= You Winn !! ==================");
				break;
			}
			else {
				System.out.println("���@�g���̃^�[���I��");
				System.out.println("----------------------------------------");
			}
			
			//  �����X�^�[�̃^�[��
			if((mg2.getHp()>0)&&(h2.getHp()>0)) {
				int random=(int)(Math.random()*6);
				switch (random) {
				case 0:
					m2.attack1();
					h2.setHp(h2.getHp()-m2.getAt());
					if(h2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+h2.getName()+"  �͎���  @@@@@@@@@@");
					break;
				case 1:
					m2.attack2();
					mg2.setHp(mg2.getHp()-m2.getAt());
					if(mg2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+mg2.getName()+"  �͎���  @@@@@@@@@@");
					break;
				case 2:
					m2.attack1();
					h2.setHp(h2.getHp()-m2.getAt());
					if(m2.getPoison()>0) {
						m2.poison_Attack1();
						h2.setHp(h2.getHp()-m2.getP_at()) ;
					}
					if(h2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+h2.getName()+"  �͎���  @@@@@@@@@@");

					break;
				case 3:
					m2.attack2();
					m2.setHp(mg2.getHp()-m2.getAt());
					if(m2.getPoison()>0) {
						m2.poison_Attack2(); 
						mg2.setHp(mg2.getHp()-m2.getP_at()) ;
					}
					if(h2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+h2.getName()+"  �͎���  @@@@@@@@@@");

					break;
				case 4:
					m2.defense();
					break;
				case 5:
					System.out.println(m2.getName()+"�͐g�\����");
					System.out.println(m2.getName()+"�̍U���͂��P�O�|�C���g�オ����");
					m2.setAt(m2.getAt()+10);
					System.out.println(m2.getName()+"�̍U���͂�"+m2.getAt()+"�ɂȂ���");
					break;
				}
				System.out.println("�y"+ h2.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + h2.getHp());

				System.out.println("�y"+ mg2.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + mg2.getHp());
				System.out.println("MP:" + mg2.getMp());

				System.out.println("�y"+m2.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + m2.getHp());    
				System.out.println("�Ɛj�̐�:"+m2.getPoison());

				if((mg2.getHp()<=0)&&(h2.getHp()<=0)) { 
					System.out.println("============= game over ================");
					break;                            
				}else 
					System.out.println("�����X�^�[�̃^�[���I��");
				System.out.println("----------------------------------------");
				continue;


				//  ���@�g��������ł��鎞

			}if((mg2.getHp()<=0)&&(h2.getHp()>0)){
				int random=(int)(Math.random()*4);
				switch (random) {
				case 0:
					m2.attack1();
					h2.setHp(h2.getHp()-m2.getAt());
					if(h2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+h2.getName()+"  �͎���  @@@@@@@@@@");
					break;
				case 1:
					m2.attack1();
					h2.setHp(h2.getHp()-m2.getAt());
					if(m2.getPoison()>0) {
						m2.poison_Attack1();
						h2.setHp(h2.getHp()-m2.getP_at()) ;
					}
					if(h2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+h2.getName()+"  �͎���  @@@@@@@@@@");
					break;
				case 2:
					m2.defense();
					break;
				case 3:
					System.out.println(m2.getName()+"�͐g�\����");
					System.out.println(m2.getName()+"�̍U���͂��P�O�|�C���g�オ����");
					m2.setAt(m2.getAt()+10);
					System.out.println(m2.getName()+"�̍U���͂�"+m2.getAt()+"�ɂȂ���");
					break;
				}
				System.out.println("�y"+ h2.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + h2.getHp());

				System.out.println("�y"+ mg2.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + mg2.getHp());
				System.out.println("MP:" + mg2.getMp());

				System.out.println("�y"+m2.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + m2.getHp());    
				System.out.println("�Ɛj�̐�:"+m2.getPoison());

				if((mg2.getHp()<=0)&&(h2.getHp()<=0)) { 
					System.out.println("============= game over ================");
					break;                            
				}else 
					System.out.println("�����X�^�[�̃^�[���I��");
				System.out.println("----------------------------------------");
				continue;

				//  �E�҂�����ł��鎞

			}if((mg2.getHp()>0)&&(h2.getHp()<=0)){	
				int random=(int)(Math.random()*4);
				switch (random) {
				case 0:
					m2.attack2();
					mg2.setHp(mg2.getHp()-m2.getAt());
					if(mg2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+mg2.getName()+"  �͎���  @@@@@@@@@@");
					break;
				case 1:
					m2.attack2();
					mg2.setHp(mg2.getHp()-m2.getAt());
					if(m2.getPoison()>0) {
						m2.poison_Attack2(); 
						mg2.setHp(mg2.getHp()-m2.getP_at()) ;
					}
					if(mg2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+mg2.getName()+"  �͎���  @@@@@@@@@@");
					break;
				case 2:
					m2.defense();
					break;
				case 3:
					System.out.println(m2.getName()+"�͐g�\����");
					System.out.println(m2.getName()+"�̍U���͂��P�O�|�C���g�オ����");
					m2.setAt(m2.getAt()+10);
					System.out.println(m2.getName()+"�̍U���͂�"+m2.getAt()+"�ɂȂ���");
					break;
				}
				System.out.println("�y"+ h2.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + h2.getHp());

				System.out.println("�y"+ mg2.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + mg2.getHp());
				System.out.println("MP:" + mg2.getMp());

				System.out.println("�y"+m2.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + m2.getHp());    
				System.out.println("�Ɛj�̐�:"+m2.getPoison());

				if((mg2.getHp()<=0)&&(h2.getHp()<=0)) { 
					System.out.println("============= game over ================");
					break;                            
				}else 
					System.out.println("�����X�^�[�̃^�[���I��");
				System.out.println("----------------------------------------");
				continue;
			}
		}
	}
}