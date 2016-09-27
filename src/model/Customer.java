package model;

public class Customer {

	private String id;
	private String name;
	private String email;
	
	//Bean만들기
	//Source-generate Constructor using fields
	public Customer(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	//getter, setter만들기
	//Source-generate Getters and Setters	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
