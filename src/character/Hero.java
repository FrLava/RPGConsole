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
	public void displayWeapon(){
		System.out.println(this.getName()+" a l'arme "+this.getW().getNom());
	}
	
	public void displayArmor(){
		System.out.println(this.getName()+" a l'armure "+this.getA());
	}
	
	public void displayStuff(){
		this.displayWeapon();
		this.displayArmor();
	}

	public Weapon getW() {
		return w;
	}

	public void setW(Weapon lootedWeapon) {
		this.w = lootedWeapon;
	}

	public Armor getA() {
		return a;
	}

	public void setA(Armor lootedArmor) {
		this.a = lootedArmor;
	}

	public String getClassName() {
		return className;
	}
	

	
}
