package pl.bartoszko.points.game;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import pl.bartoszko.points.user.Team;
import pl.bartoszko.points.user.User;

@Entity
@Table(name="game_result")
@Data
public class GameResult {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user")
	private User user;
	
	@Column(name="team")
	private Team team;
	
	@Column(name="points")
	private int points;
	
	@ManyToOne
	@JoinColumn(name="game_id")
	private Game game;
	
	public GameResult() {};
	
	public GameResult(User user, int points, Game game) {
		this.user = user;
		this.points = points;
		this.game = game;
	}
	
	public GameResult(Team team, int points, Game game) {
		this.team = team;
		this.points = points;
		this.game = game;
	}
	
}
