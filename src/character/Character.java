package character;

import java.util.List;

public abstract class Character {
	
	protected int hp;
	protected int attackDmg;
	protected int armor;
	protected int magicDmg;
	protected int magicResist;
	
	protected String name;
	protected List<Skill> skillList;
	
	public void gainHP(int hp){
		this.hp+=hp;
	}
	
	public void looseHP(int hp){
		this.hp-=hp;
	}
	
	public abstract void display();
	
	//####################### Getters and Setters #######################
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttackDmg() {
		return attackDmg;
	}

	public void setAttackDmg(int attackDmg) {
		this.attackDmg = attackDmg;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getMagicDmg() {
		return magicDmg;
	}

	public void setMagicDmg(int magicDmg) {
		this.magicDmg = magicDmg;
	}

	public int getMagicResist() {
		return magicResist;
	}

	public void setMagicResist(int magicResist) {
		this.magicResist = magicResist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Skill> getSkillList() {
		return skillList;
	}
	
	public void setSkillList(List<Skill> skillList){
		this.skillList=skillList;
	}
}
