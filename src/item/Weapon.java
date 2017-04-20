package item;

public class Weapon extends Item {
	
	private String nom;
	private int dmg;
	private String status;
	
	public Weapon(String nom, int dmg,String status){
		this.nom=nom;
		this.dmg=dmg;
		this.status=status;
		
	}

	public String getNom() {
		return this.nom;
	}

	public int getDmg() {
		return this.dmg;
	}

	public String getStatus() {
		return this.status;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
