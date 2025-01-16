package pl.bartoszko.points.user;

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
import javax.persistence.Table;

import lombok.Setter;
import pl.bartoszko.points.game.RoundScore;
import pl.bartoszko.points.game.entity.Game;

@Entity
@Table(name="team")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	@Setter
	private String name;
	
	@ManyToMany
	@JoinTable(name="game_team_join", 
	joinColumns=@JoinColumn(name="team_id"),
	inverseJoinColumns=@JoinColumn(name="game_id"))
	private List<Game> games;
	
	@ManyToMany
	@JoinTable(name="user_team_join", 
	joinColumns=@JoinColumn(name="team_id"),
	inverseJoinColumns=@JoinColumn(name="user_id"))
	@Setter
	private List<User> users;
	
	@OneToMany
	@JoinColumn(name="round_score_id")
	private List<RoundScore> roundScores;
	
	public Team() {};
	
	public Team(String name, List<User> users) {
		this.name = name;
		this.users = users;
	}
}
