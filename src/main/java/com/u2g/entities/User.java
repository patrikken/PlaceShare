package com.u2g.entities;
 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue
	private long userID;

	private String firstName;

	private String lastName;

	private String phone;

	private String login;

	private String pwd;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private Collection<Position> positions;
	
	@ManyToMany
	@JoinTable(name = "user_friend",
	joinColumns = {
		@JoinColumn(name = "user_id", referencedColumnName = "userID")
	},
	inverseJoinColumns = {
			@JoinColumn(name = "friend_id", referencedColumnName = "userID")
	}
			)
	private List<User> friends = new ArrayList<User>();
	
	@ManyToMany(mappedBy = "receivers")
	private Collection<Msg> recieveMsgs;
	
	@ManyToMany(mappedBy = "friends", fetch = FetchType.LAZY) 
	private Collection<User> userFriends;
	 
	public boolean addFriend(User user) {
		return friends.add(user);
	}

	public Collection<User> getFriends() {
		return friends;
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}

	public User(String firstName, String lastName, String phone, String login,
			String pwd, Collection<Position> positions) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.login = login;
		this.pwd = pwd;
		this.positions = positions;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Collection<Position> getPositions() {
		return positions;
	}

	public void setPositions(Collection<Position> positions) {
		this.positions = positions;
	}

	public User() {
		super();
	}

}
