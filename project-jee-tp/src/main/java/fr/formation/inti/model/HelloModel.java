package fr.formation.inti.model;

public class HelloModel {
	private String name;

    //model is required default constructor
	public HelloModel() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHello() {
		if(name==null) {
			return"Hello everybody";
		}
		return "hello " +name;
	}
}
