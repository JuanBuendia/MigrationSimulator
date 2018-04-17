package model;

public enum Status {

	DEAD("Muerte"), PREGNANT("Embarazo"), SICK("Enfermedad"), WELL("Bien");
	
	String status;
	
	Status(String status){
		this.status = status;
	}
	
	public String getStatus(){
		return this.status;
	}
}