package character;

public class Skill {
	
	private String nom;
	private int damage;
	
	public Skill(){
		this.nom="Unknown skill";
		this.damage=0;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	
	
	
}
