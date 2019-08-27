package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {

	private int id;
	
	private String login;
	
	private Date joinDate; //TODO add to DB
	
	@OneToOne
	@JoinColumn(name="user_id")
	private UserBasicStatistic userBasicStatistic;
	
	public User () {}
	
	public User (String login, Date date) {
		this.login = login;
		this.joinDate = date;
	}
	
	
}
