package com.tns.proj;

public class SportsCar extends Car{
	private float speed;

	public SportsCar() {
		super();
	}
	

	public SportsCar(float speed) {
		super();
		this.speed = speed;
	}


	public SportsCar(String name, int plno, float price) {
		super(name, plno, price);
		// TODO Auto-generated constructor stub
	
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "SportsCar [speed=" + speed + "]";
	}
	
}
