package model;

public class Animal {

	private int x;
	private int y;
	private int id;
	private int age;
	private Gender gender;
	private Status status;
	private static int count;
	private Animal nextInGroup;
	private Animal nextToGaveBirth;
	
	public Animal(int age, Gender gender, int x, int y) {
		this.x = x;
		this.y = y;
		this.age = age;
		this.id = count++;
		this.gender = gender;
		this.status = Status.WELL;
	}

	public int getId() {
		return id;
	}
	
	public void incrementAge() {
		age++;
	}
	
	public int getAge() {
		return age;
	}
	
	public void moveX() {
			x+=10;
	}
	
	public void moveY() {
			y+=10;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
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
	
	@Override
	public String toString() {
		return "Animal [id=" + id + ", gender=" + gender + ", status=" + status
				+ "]";
	}
}