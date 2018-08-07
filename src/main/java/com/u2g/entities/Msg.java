package com.u2g.entities;

import java.util.Collection;
import java.util.Date; 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Msg {

	@Id
	@GeneratedValue
	private long idMsg;

	private Date date;

	private boolean state;

	@ManyToOne
	@JoinColumn(name = "CODE_SENDER")
	private User sender;

	@ManyToMany
	@JoinTable(name = "msg_reciever",
	joinColumns = {
		@JoinColumn(name = "msg_idMsg", referencedColumnName = "idMsg")
	},
	inverseJoinColumns = {
			@JoinColumn(name = "user_idUser", referencedColumnName = "userID")
	}
			)
	private Collection<User> receivers;

	@ManyToOne
	@JoinColumn(name = "CODE_POSITION")
	private Position position;

	 

	public long getIdMsg() {
		return idMsg;
	}

	public void setIdMsg(long idMsg) {
		this.idMsg = idMsg;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}
  
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Msg() {
		super();
	}

}
