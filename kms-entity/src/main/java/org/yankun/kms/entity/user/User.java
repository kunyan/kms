/**
 * 
 */
package org.yankun.kms.entity.user;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

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
	@Email
	private String email;
	/**
	 * Create Time
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date createTime;
	/**
	 * Update Time
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date updateTime;
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
