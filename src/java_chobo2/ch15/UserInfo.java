package java_chobo2.ch15;

import java.io.Serializable;

public class UserInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;
	private int age;

	@Override
	public String toString() {
		return String.format("UserInfo [name=%s, password=%s, age=%s]", name, password, age);
	}

	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
}
