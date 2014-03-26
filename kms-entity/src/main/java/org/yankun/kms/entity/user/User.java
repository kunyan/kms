/**
 * 
 */
package org.yankun.kms.entity.user;

import java.io.Serializable;

/**
 * @author yankun
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8432274412264427556L;
	
	/**
	 * User id
	 */
	private Serializable id;
	/**
	 * Username
	 */
	private String username;
	/**
	 * User Name
	 */
	private String name;
	/**
	 * Password
	 */
	private String password;
	/**
	 * Email
	 */
	private String email;
	public Serializable getId() {
		return id;
	}
	public void setId(Serializable id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	

}
