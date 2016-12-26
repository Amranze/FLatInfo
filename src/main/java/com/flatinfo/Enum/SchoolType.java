package com.flatinfo.Enum;

public enum SchoolType {
	UNIVERSITE(0),
	LYCEE(1),
	COLLEGE(2),
	ECOLE(3);
	
	private final int schoolType;
	
	private SchoolType(int schoolType) {
		this.schoolType = schoolType;
	}

	public int getSchoolType() {
		return schoolType;
	}		

}
