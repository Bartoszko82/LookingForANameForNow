package domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {

	private int id;
	
	private String login;
	
	private Date joinDate; //TODO add to DB
	
	private List<UserStatistic> userStatistics;
	
	public User () {}
	
	public User (String login, Date date) {
		this.login = login;
		this.joinDate = date;
	}
	
	
}
