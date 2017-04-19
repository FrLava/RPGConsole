package character;

import java.util.List;

import item.*;

public class Hero extends Character {
	
	private String className;
	private Weapon w;
	private Armor a;
	
	public Hero(String name,String className,int hp, int attackDmg, int armor, int magicDmg, int magicResist/*,List<Skill> skillList*/){
		this.name=name;
		this.className=className;
		this.hp=hp;
		this.attackDmg=attackDmg;
		this.armor=armor;
		this.magicDmg=magicDmg;
		this.magicResist=magicResist;
		//this.skillList=skillList;
		}
	
	@Override
	public void display(){
		System.out.print("Mon personnage s'appel ");
		System.out.print(this.getName());
		System.out.print(", c'est un ");
		System.out.println(this.getClassName()+".");
		System.out.print("Il a ");
		System.out.print(getHp());
		System.out.print("hp, ");
		System.out.print(this.getAttackDmg());
		System.out.print(" de dégats physique, ");
		System.out.print(this.getArmor());
		System.out.print(" d'armure, ");
		System.out.print(this.getMagicDmg());
		System.out.print(" de dégats magique, et ");
		System.out.print(this.getMagicResist());
		System.out.println(" de resistance magique.");
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
