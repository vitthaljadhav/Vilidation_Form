package orag.vtech.mvc.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;



public class LoginBean {
@NotEmpty(message="must be Enter User_Name")
	private String name;
	@NotNull
	@Size(min=3,max=7,message="Enter the password due to between {min} and {max}")
	private String password;
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
}
