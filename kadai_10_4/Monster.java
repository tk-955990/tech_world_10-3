package kadai_10_4;


public class Monster {

	private String name;
	private int hp;
	private int at;
	private int df;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name=="null") {
			throw new IllegalArgumentException("名前がnullです");
		}if ((name.length()<3)||(name.length()>10)){
			throw new IllegalArgumentException("文字数は3文字以上、１０文字以下で入力してください");
		}
		this.name = name;
	}
	public int getHp() {
		
		return this.hp;
	}
	public void setHp(int hp) {
		if (hp<0){
			hp=0 ;
		}
		this.hp = hp;
	}
	public int getAt() {
		return this.at;
	}
	public void setAt(int at) {
		if (at<0){
			at=0 ;
		}
		this.at = at;
	}
	public int getDf() {
		return this.df;
	}
	public void setDf(int df) {
		if (df<0){
			df=0 ;
		}
		this.df = df;
	}


	public void attack1(Hero h) {
		System.out.println(this.name + "の攻撃！！！");
		System.out.println("勇者は"+this.at + "ポイントのダメージを受けた");
		h.setHp(h.getHp()-this.getAt());
	}
	
	public void attack2(Magician mg) {
		System.out.println(this.name + "の攻撃！！！");
		System.out.println("魔法使いは"+this.at + "ポイントのダメージを受けた");
		mg.setHp(mg.getHp()-this.getAt());
	}
	
	public void defense() {
		System.out.println(this.name + "は守りを固めた");
		this.df = this.df + 10;
		System.out.println(this.name + "の防御力が１０ポイント上がった");
	}
}
