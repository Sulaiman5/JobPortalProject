package com.spring.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "app_user")
@Table(name = "app_user")
public class AppUser {
	@Id
    @Column(name = "user_id")
    private Long userId;
 
    @Column(name = "user_name", length = 35)
    private String userName;
 
    @Column(name = "encryted_password")
    private String encrytedPassword;
 
    @Column(name = "enabled")
    private boolean enabled;
	
	@Column(name = "role_id")
	private UUID roleId;

	@Column(name = "role_name")
	private String roleName;
	
	
	
	public AppUser(Long userId, String userName, String encrytedPassword, boolean enabled) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.encrytedPassword = encrytedPassword;
		this.enabled = enabled;
		
	}

	public AppUser() {
	
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEncrytedPassword() {
		return encrytedPassword;
	}

	public void setEncrytedPassword(String encrytedPassword) {
		this.encrytedPassword = encrytedPassword;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public UUID getRoleId() {
		return roleId;
	}

	public void setRoleId(UUID roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
