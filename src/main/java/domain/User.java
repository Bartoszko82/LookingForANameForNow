package domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	@JoinColumn(name="user_basic_statistics_id")
	private UserBasicStatistics userBasicStatistics;
	
	@ManyToMany
	@JoinTable(name="user_team", 
	joinColumns=@JoinColumn(name="user_id"),
	inverseJoinColumns=@JoinColumn(name="team_id"))
	private List<Team> teams;
	
	public User () {}
	
	public User (String login, Date date) {
		this.login = login;
		this.joinDate = date;
	}
	
	
}
