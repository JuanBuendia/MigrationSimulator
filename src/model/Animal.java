package model;

public class Animal {

	private int x;
//	private int y;
	private int id;
	private int age;
	private Gender gender;
	private Status status;
	private Animal nextInGroup;
	private Animal nextToGaveBirth;
	
	public Animal(int x) {
		this.x = x;
	}
	
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
	
	public Animal getNextInGroup() {
		return nextInGroup;
	}

	public void setNextInGroup(Animal nextInGroup) {
		this.nextInGroup = nextInGroup;
	}

	public Animal getNextToGaveBirth() {
		return nextToGaveBirth;
	}

	public void setNextToGaveBirth(Animal nextToGaveBirth) {
		this.nextToGaveBirth = nextToGaveBirth;
	}
	
	public void move() {
		if (x < 1000) {
			x+=10;
		}
	}
	
	public int getX() {
		return x;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", gender=" + gender + ", status=" + status
				+ "]";
	}
}