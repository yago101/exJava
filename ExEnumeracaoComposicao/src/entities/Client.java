package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private String name;
	private String email;
	private Date birthDate;
	
	
	
	public Client(String name, String email, String birthDate) throws ParseException {
		
		this.name = name;
		this.email = email;
		SimpleDateFormat sdfBirthDate = new SimpleDateFormat("dd/MM/yyy");
		this.birthDate = sdfBirthDate.parse(birthDate);
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


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	
	
}
