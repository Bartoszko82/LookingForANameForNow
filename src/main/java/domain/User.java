package domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {

	private int id;
	
	private String login;
	
	private Date joinDate; //TODO add to DB
	
	@OneToMany
	@JoinColumn(name="user_id")
	private List<UserBasicStatistic> userBasicStatistics;
	
	public User () {}
	
	public User (String login, Date date) {
		this.login = login;
		this.joinDate = date;
	}
	
	
}
