package model;

public enum Gender {

	MALE("Macho"), FEMALE("Hembra");
	
	String gender;
	
	Gender(String gender){
		this.gender = gender;
	}
	
	public String getGender(){
		return this.gender;
	}
}