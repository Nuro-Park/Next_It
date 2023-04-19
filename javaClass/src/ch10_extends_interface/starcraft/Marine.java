package ch10_extends_interface.starcraft;

public class Marine extends StarUnit{
	
	public Marine() { 
		this("마린", 6, 50, 0);
	}
	
	@Override
	public String toString() {
		return "Marine [name=" + getName() + ", damage=" + 
	getDamage() + ", hp=" + getHp() + ", armor=" + getArmor() + "]";
	}
	
	public void attack(StarUnit unit) {
		unit.setHp(unit.getHp() - super.getDamage());
	}

	
	public void stimpack() {
		System.out.println("우아아아아아");
		
		super.setHp(super.getHp()- 10);
		super.setDamage(super.getDamage() * 2);
	}

	public Marine(String name, int damage, int hp, int armor) {
		super(name, damage, hp, armor);
		
	}
	
	
}
