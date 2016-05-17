package sheltercommander;

/**
 *
 * @author xcran
 */
public class Gatherer {

	private int level;
	private int hp;
	private int xp;
	private int strength;
	private int intelligence;
	private int endurance;
	private GathererObject [] Objects;
	private String name;

	public Gatherer(int level, int hp, int xp, int strength, int intelligence, int endurance, GathererObject[] Objects, String name) {
		this.level = level;
		this.hp = hp;
		this.xp = xp;
		this.strength = strength;
		this.intelligence = intelligence;
		this.endurance = endurance;
		this.Objects = Objects;
		this.name = name;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getEndurance() {
		return endurance;
	}

	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}

	public GathererObject[] getObjects() {
		return Objects;
	}

	public void setObjects(GathererObject[] Objects) {
		this.Objects = Objects;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
}
