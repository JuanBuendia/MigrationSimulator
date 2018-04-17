package model;

public class Animal {

	private int id;
	private int age;
	private Gender gender;
	private Status status;

	public Animal(int id, int age, Gender gender) {
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.status = Status.WELL;
	}

	public int getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", gender=" + gender + ", status=" + status
				+ "]";
	}
}