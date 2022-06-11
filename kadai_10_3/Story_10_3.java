package kadai_10_3;

import java.util.Scanner;

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
		m2.setHp       (1500);
		m2.setAt       (100);
		m2.setDf       (120);
		m2.setP_at      (50);
		m2.setPoison     (5);

		System.out.println("禍々しい怪物がここに誕生した");
		System.out.println("名前:"     + m2.getName());
		System.out.println("体力:"     + m2.getHp());
		System.out.println("攻撃力:"   + m2.getAt());
		System.out.println("防御力:"   + m2.getDf());
		System.out.println("毒攻撃力:" + m2.getP_at());
		System.out.println("独針の数:" + m2.getPoison());


		// 魔法使いの生成

		SuperMagician mg2 = new SuperMagician();
		mg2.setName ("medeia");
		mg2.setHp        (500);
		mg2.setAt         (30);
		mg2.setMp         (50);
		mg2.setM_at       (50);

		System.out.println("魔法使いがここに誕生した");
		System.out.println("名前:"       + mg2.getName());
		System.out.println("体力:"       + mg2.getHp());
		System.out.println("攻撃力:"     + mg2.getAt());
		System.out.println("MP:"         + mg2.getMp());
		System.out.println("攻撃魔法力:" + mg2.getM_at());


		System.out.println("========= Game Start !! ================");
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 50; i++) {      


			if(h2.getHp()<=0)
				System.out.println(h2.getName()+"は死んでいる");
			else {

				//  勇者のターン

				System.out.println("<<   　勇者の作戦は？   >>");
				System.out.println("攻撃:1 防御:2 休憩:3 終了:4");

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
				System.out.println("【"+ h2.getName()+":ステータス】");
				System.out.println("体力:" + h2.getHp());

				System.out.println("【"+ mg2.getName()+":ステータス】");
				System.out.println("体力:" + mg2.getHp());
				System.out.println("MP:" + mg2.getMp());

				System.out.println("【"+m2.getName()+":ステータス】");
				System.out.println("体力:" + m2.getHp());
				System.out.println("独針の数:"+m2.getPoison());
			}
			if(m2.getHp()<=0) {
				System.out.println("@@@@@@@@@@@  "+m2.getName()+"  を倒した  @@@@@@@@@@");
				System.out.println("========= You Winn !! ==================");
				break;
			}
			else 
				System.out.println("勇者のターン終了");
			System.out.println("----------------------------------------");


			if(mg2.getHp()<=0)
				System.out.println("魔法使いは死んでる");
			else {

				//  魔法使いのターン
				System.out.println("<<   魔法使いの作戦は？   >>");
				System.out.println("攻撃:1 攻撃魔法:2 超攻撃魔法:3 回復魔法:4 休憩:5 終了:6");

				int get_mgCommand = new java.util.Scanner(System.in).nextInt();

				switch (get_mgCommand) {
				case 1:
					mg2.attack();
					m2.setHp(m2.getHp()-mg2.getAt());
					break;
				case 2:
					if(mg2.getMp()<10) {
						System.out.println("MPが足りません");
						break;
					}
					mg2.magic_Attack();
					m2.setHp(m2.getHp()-mg2.getM_at());
					break;	


				case 3:
					if(mg2.getMp()<20) {
						System.out.println("MPが足りません");
						break;
					}
					mg2.super_magic_Attack();
					m2.setHp(m2.getHp()-(mg2.getM_at())*2);
					break;
				case 4:
					if(mg2.getMp()<5) {
						System.out.println("MPが足りません");
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
				System.out.println("【"+ h2.getName()+":ステータス】");
				System.out.println("体力:" + h2.getHp());

				System.out.println("【"+ mg2.getName()+":ステータス】");
				System.out.println("体力:" + mg2.getHp());
				System.out.println("MP:" + mg2.getMp());

				System.out.println("【"+m2.getName()+":ステータス】");
				System.out.println("体力:" + m2.getHp());
				System.out.println("独針の数:"+m2.getPoison());
			}
			if(m2.getHp()<=0) {
				System.out.println("@@@@@@@@@@@  "+m2.getName()+"  を倒した  @@@@@@@@@@");
				System.out.println("========= You Winn !! ==================");
				break;
			}
			else {
				System.out.println("魔法使いのターン終了");
				System.out.println("----------------------------------------");
			}
			
			//  モンスターのターン
			if((mg2.getHp()>0)&&(h2.getHp()>0)) {
				int random=(int)(Math.random()*6);
				switch (random) {
				case 0:
					m2.attack1();
					h2.setHp(h2.getHp()-m2.getAt());
					if(h2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+h2.getName()+"  は死んだ  @@@@@@@@@@");
					break;
				case 1:
					m2.attack2();
					mg2.setHp(mg2.getHp()-m2.getAt());
					if(mg2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+mg2.getName()+"  は死んだ  @@@@@@@@@@");
					break;
				case 2:
					m2.attack1();
					h2.setHp(h2.getHp()-m2.getAt());
					if(m2.getPoison()>0) {
						m2.poison_Attack1();
						h2.setHp(h2.getHp()-m2.getP_at()) ;
					}
					if(h2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+h2.getName()+"  は死んだ  @@@@@@@@@@");

					break;
				case 3:
					m2.attack2();
					m2.setHp(mg2.getHp()-m2.getAt());
					if(m2.getPoison()>0) {
						m2.poison_Attack2(); 
						mg2.setHp(mg2.getHp()-m2.getP_at()) ;
					}
					if(h2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+h2.getName()+"  は死んだ  @@@@@@@@@@");

					break;
				case 4:
					m2.defense();
					break;
				case 5:
					System.out.println(m2.getName()+"は身構えた");
					System.out.println(m2.getName()+"の攻撃力が１０ポイント上がった");
					m2.setAt(m2.getAt()+10);
					System.out.println(m2.getName()+"の攻撃力が"+m2.getAt()+"になった");
					break;
				}
				System.out.println("【"+ h2.getName()+":ステータス】");
				System.out.println("体力:" + h2.getHp());

				System.out.println("【"+ mg2.getName()+":ステータス】");
				System.out.println("体力:" + mg2.getHp());
				System.out.println("MP:" + mg2.getMp());

				System.out.println("【"+m2.getName()+":ステータス】");
				System.out.println("体力:" + m2.getHp());    
				System.out.println("独針の数:"+m2.getPoison());

				if((mg2.getHp()<=0)&&(h2.getHp()<=0)) { 
					System.out.println("============= game over ================");
					break;                            
				}else 
					System.out.println("モンスターのターン終了");
				System.out.println("----------------------------------------");
				continue;


				//  魔法使いが死んでいる時

			}if((mg2.getHp()<=0)&&(h2.getHp()>0)){
				int random=(int)(Math.random()*4);
				switch (random) {
				case 0:
					m2.attack1();
					h2.setHp(h2.getHp()-m2.getAt());
					if(h2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+h2.getName()+"  は死んだ  @@@@@@@@@@");
					break;
				case 1:
					m2.attack1();
					h2.setHp(h2.getHp()-m2.getAt());
					if(m2.getPoison()>0) {
						m2.poison_Attack1();
						h2.setHp(h2.getHp()-m2.getP_at()) ;
					}
					if(h2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+h2.getName()+"  は死んだ  @@@@@@@@@@");
					break;
				case 2:
					m2.defense();
					break;
				case 3:
					System.out.println(m2.getName()+"は身構えた");
					System.out.println(m2.getName()+"の攻撃力が１０ポイント上がった");
					m2.setAt(m2.getAt()+10);
					System.out.println(m2.getName()+"の攻撃力が"+m2.getAt()+"になった");
					break;
				}
				System.out.println("【"+ h2.getName()+":ステータス】");
				System.out.println("体力:" + h2.getHp());

				System.out.println("【"+ mg2.getName()+":ステータス】");
				System.out.println("体力:" + mg2.getHp());
				System.out.println("MP:" + mg2.getMp());

				System.out.println("【"+m2.getName()+":ステータス】");
				System.out.println("体力:" + m2.getHp());    
				System.out.println("独針の数:"+m2.getPoison());

				if((mg2.getHp()<=0)&&(h2.getHp()<=0)) { 
					System.out.println("============= game over ================");
					break;                            
				}else 
					System.out.println("モンスターのターン終了");
				System.out.println("----------------------------------------");
				continue;

				//  勇者が死んでいる時

			}if((mg2.getHp()>0)&&(h2.getHp()<=0)){	
				int random=(int)(Math.random()*4);
				switch (random) {
				case 0:
					m2.attack2();
					mg2.setHp(mg2.getHp()-m2.getAt());
					if(mg2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+mg2.getName()+"  は死んだ  @@@@@@@@@@");
					break;
				case 1:
					m2.attack2();
					mg2.setHp(mg2.getHp()-m2.getAt());
					if(m2.getPoison()>0) {
						m2.poison_Attack2(); 
						mg2.setHp(mg2.getHp()-m2.getP_at()) ;
					}
					if(mg2.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+mg2.getName()+"  は死んだ  @@@@@@@@@@");
					break;
				case 2:
					m2.defense();
					break;
				case 3:
					System.out.println(m2.getName()+"は身構えた");
					System.out.println(m2.getName()+"の攻撃力が１０ポイント上がった");
					m2.setAt(m2.getAt()+10);
					System.out.println(m2.getName()+"の攻撃力が"+m2.getAt()+"になった");
					break;
				}
				System.out.println("【"+ h2.getName()+":ステータス】");
				System.out.println("体力:" + h2.getHp());

				System.out.println("【"+ mg2.getName()+":ステータス】");
				System.out.println("体力:" + mg2.getHp());
				System.out.println("MP:" + mg2.getMp());

				System.out.println("【"+m2.getName()+":ステータス】");
				System.out.println("体力:" + m2.getHp());    
				System.out.println("独針の数:"+m2.getPoison());

				if((mg2.getHp()<=0)&&(h2.getHp()<=0)) { 
					System.out.println("============= game over ================");
					break;                            
				}else 
					System.out.println("モンスターのターン終了");
				System.out.println("----------------------------------------");
				continue;
			}
		}
	}
}