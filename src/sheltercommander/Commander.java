package sheltercommander;

import java.util.*;

/**
 *
 * @author xcran
 */
public class Commander {
	
	private String name;
	private int level;
	private int xp;
	private ArrayList <Gatherer> Gatherers;

	public Commander(String name, int level, int xp, ArrayList<Gatherer> Gatherers) {
		this.name = name;
		this.level = level;
		this.xp = xp;
		this.Gatherers = Gatherers;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}
	
	public ArrayList<Gatherer> getGatherers() {
		return Gatherers;
	}

	public void setGatherers(ArrayList<Gatherer> Gatherers) {
		this.Gatherers = Gatherers;
	}
	
	
	
}
