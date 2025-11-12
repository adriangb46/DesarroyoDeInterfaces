/**
 * 
 */
package ejercicio5;

/**
 * 
 */
public class Alumno {
	private String name;
	private String surname;
	private int age;
	private String email;
	private long phoneNumber;
	
	
	
	public Alumno() {
		super();
	}

	public Alumno(String name, String surname, int age, String email, long phoneNumber) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public boolean isMayorAge() {
		return age >= 18;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
