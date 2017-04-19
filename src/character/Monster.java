package character;

import java.util.List;

import item.Consumable;

public class Monster extends Character {
	
	List<Consumable> lootedObject;
	
	public Monster(String name,int hp, int attackDmg, int armor, int magicDmg, int magicResist,List<Skill> skillList){
		this.name=name;
		this.hp=hp;
		this.attackDmg=attackDmg;
		this.armor=armor;
		this.magicDmg=magicDmg;
		this.magicResist=magicResist;
		this.skillList=skillList;
		}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
