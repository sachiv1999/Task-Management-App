package com.TaskManagement.Entity;


import lombok.*;

import java.time.LocalDateTime;

import javax.persistence.*;

import com.TaskManagement.Enum.Role;



@Entity
@Table(name="users")
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
public class User {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	@Column(nullable=false)
	private String userName;
	@Column(nullable=false, unique=true)
	private String userEmail;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	private Role role;
	@Column(nullable=false)
	private boolean active=true;
	@Column(nullable=false)
	@Builder.Default
	private LocalDateTime createdAt = LocalDateTime.now();
	
	
	public User() {}
	public User(Long id,String userName, String userEmail, String password, Role role, Boolean active, LocalDateTime createdAt) {
		this.id=id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.password = password;
		this.role = role;
		this.active = active;
		this.createdAt =createdAt;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
	
}
