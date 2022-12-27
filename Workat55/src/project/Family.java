package project;


public class Family {

	private int id;
	private String firstname;
	private String lastname;
	private String username; // new
	private String password; // new
	private String email; // new 
	private String gender;
	private int age;

	public Family() {
	}

	public Family(int id, String firstname, String lastname, String username, String password, 
							String email,  String gender, int age) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password; 
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	
	public Family(String firstname, String lastname, String username, String password, 
								String email, int age, String gender) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	
	// Method use to generate new family member
	public static void generateFamilyMember (String fname, String lname, String un, String pword, 
											String email, int age, String gender) throws Exception {
		Family f1 = new Family(fname, lname, un, pword, email, age, gender);
		
		Insert.insertFamilyMember(f1);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "\nFamily ID: " + this.getId() + "\nFirst name: " + this.firstname + "\nLast name: " + this.lastname
				+ "\nUsername: " + this.getUsername() + "\nEmail: " + this.getEmail() 
				+ "\nPassword: " + this.getPassword() + "\nAge: " + this.age + "\nGender: " + this.gender;
	}

}
