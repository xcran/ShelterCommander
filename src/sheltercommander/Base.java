package sheltercommander;

import java.util.*;

/**
 *
 * @author xcran
 */
public class Base {
	private Commander commander;
	private ArrayList <Gatherer> Gatherers;
	//ArrayList <Rom> Roms;
	private ArrayList <GathererObject> Objects; //Temporary until implements rom Depot
	private String name;
	//max roms max gatherers;

	public Base(Commander commander, ArrayList<Gatherer> Gatherers, ArrayList<GathererObject> Objects, String name) {
		this.commander = commander;
		this.Gatherers = Gatherers;
		this.Objects = Objects;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Commander getCommander() {
		return commander;
	}

	public void setCommander(Commander commander) {
		this.commander = commander;
	}

	public ArrayList <Gatherer> getGatherers() {
		return Gatherers;
	}

	public void setGatherers(ArrayList <Gatherer> Gatherers) {
		this.Gatherers = Gatherers;
	}

	public ArrayList <GathererObject> getObjects() {
		return Objects;
	}

	public void setObjects(ArrayList <GathererObject> Objects) {
		this.Objects = Objects;
	}
	
	
}
