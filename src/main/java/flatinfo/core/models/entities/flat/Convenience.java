package flatinfo.core.models.entities.flat;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Convenience {
	
	private boolean terrace;
	private boolean balcony;
	private boolean outdoorParking;
	private boolean box;
	private boolean cellar;
	private boolean fireplace;
	private boolean hardwoodFloors;
	private boolean elevator;
	private boolean lastStage;
	private boolean swimming_pool;
	private boolean cupboard;
	private boolean interCom;
	private boolean digicode;
	private boolean securityGuards;
	private boolean handicapAccess;
	private boolean alarm;
	
	public Convenience() {
		super();
	}
	public Convenience(boolean terrace, boolean balcony,
			boolean outdoorParking, boolean box, boolean cellar,
			boolean fireplace, boolean hardwoodFloors, boolean elevator,
			boolean lastStage, boolean swimming_pool, boolean cupboard,
			boolean interCom, boolean digicode, boolean securityGuards,
			boolean handicapAccess, boolean alarm) {
		super();
		this.terrace = terrace;
		this.balcony = balcony;
		this.outdoorParking = outdoorParking;
		this.box = box;
		this.cellar = cellar;
		this.fireplace = fireplace;
		this.hardwoodFloors = hardwoodFloors;
		this.elevator = elevator;
		this.lastStage = lastStage;
		this.swimming_pool = swimming_pool;
		this.cupboard = cupboard;
		this.interCom = interCom;
		this.digicode = digicode;
		this.securityGuards = securityGuards;
		this.handicapAccess = handicapAccess;
		this.alarm = alarm;
	}
	public boolean isTerrace() {
		return terrace;
	}
	public void setTerrace(boolean terrace) {
		this.terrace = terrace;
	}
	public boolean isBalcony() {
		return balcony;
	}
	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}
	public boolean isOutdoorParking() {
		return outdoorParking;
	}
	public void setOutdoorParking(boolean outdoorParking) {
		this.outdoorParking = outdoorParking;
	}
	public boolean isBox() {
		return box;
	}
	public void setBox(boolean box) {
		this.box = box;
	}
	public boolean isCellar() {
		return cellar;
	}
	public void setCellar(boolean cellar) {
		this.cellar = cellar;
	}
	public boolean isFireplace() {
		return fireplace;
	}
	public void setFireplace(boolean fireplace) {
		this.fireplace = fireplace;
	}
	public boolean isHardwoodFloors() {
		return hardwoodFloors;
	}
	public void setHardwoodFloors(boolean hardwoodFloors) {
		this.hardwoodFloors = hardwoodFloors;
	}
	public boolean isElevator() {
		return elevator;
	}
	public void setElevator(boolean elevator) {
		this.elevator = elevator;
	}
	public boolean isLastStage() {
		return lastStage;
	}
	public void setLastStage(boolean lastStage) {
		this.lastStage = lastStage;
	}
	public boolean isSwimming_pool() {
		return swimming_pool;
	}
	public void setSwimming_pool(boolean swimming_pool) {
		this.swimming_pool = swimming_pool;
	}
	public boolean isCupboard() {
		return cupboard;
	}
	public void setCupboard(boolean cupboard) {
		this.cupboard = cupboard;
	}
	public boolean isInterCom() {
		return interCom;
	}
	public void setInterCom(boolean interCom) {
		this.interCom = interCom;
	}
	public boolean isDigicode() {
		return digicode;
	}
	public void setDigicode(boolean digicode) {
		this.digicode = digicode;
	}
	public boolean isSecurityGuards() {
		return securityGuards;
	}
	public void setSecurityGuards(boolean securityGuards) {
		this.securityGuards = securityGuards;
	}
	public boolean isHandicapAccess() {
		return handicapAccess;
	}
	public void setHandicapAccess(boolean handicapAccess) {
		this.handicapAccess = handicapAccess;
	}
	public boolean isAlarm() {
		return alarm;
	}
	public void setAlarm(boolean alarm) {
		this.alarm = alarm;
	}
	
}
