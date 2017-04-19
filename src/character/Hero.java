package character;

import java.util.List;

import item.*;

public class Hero extends Character {
	
	private String className;
	private Weapon w;
	private Armor a;
	
	public Hero(String name,String className,int hp, int attackDmg, int armor, int magicDmg, int magicResist,List<Skill> skillList){
		this.name=name;
		this.className=className;
		this.hp=hp;
		this.attackDmg=attackDmg;
		this.armor=armor;
		this.magicDmg=magicDmg;
		this.magicResist=magicResist;
		this.skillList=skillList;
		}
	
	@Override
	public void display(){
		
	}

	protected Weapon getW() {
		return w;
	}

	protected void setW(Weapon lootedWeapon) {
		this.w = lootedWeapon;
	}

	protected Armor getA() {
		return a;
	}

	protected void setA(Armor lootedArmor) {
		this.a = lootedArmor;
	}

	protected String getClassName() {
		return className;
	}
	

	
}
