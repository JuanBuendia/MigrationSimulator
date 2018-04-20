package model;

public enum Status {

	DEAD("Muerte"), PREGNANT("Embarazo"), SICK("Enfermedad"), WELL("Bien"), MATURE("Madurez");
	
	String status;
	
	Status(String status){
		this.status = status;
	}
	
	public String getStatus(){
		return this.status;
	}
}