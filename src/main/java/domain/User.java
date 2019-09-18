package domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="login")
	private String login;
	
	@Column(name="join_date")
	private Date joinDate; 
	
	@OneToOne
	@JoinColumn(name="user_details_id")
	private UserDetails userDetails;
	
	@OneToOne
	@JoinColumn(name="user_basic_statistics_id")
	private UserBasicStatistics userBasicStatistics;
		
	@ManyToMany
	@JoinTable(name="user_team_join", 
	joinColumns=@JoinColumn(name="user_id"),
	inverseJoinColumns=@JoinColumn(name="team_id"))
	private List<Team> teams;
	
	@OneToMany
	@JoinColumn(name="round_score_id")
	private List<RoundScore> roundScores;
	
	public User () {}
	
	public User (String login, Date date) {
		this.login = login;
		this.joinDate = date;
	}
	
	
}
