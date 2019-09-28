package pl.bartoszko.points.round;

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
@Table(name = "round_score")
@Data
public class RoundScore {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="points")
	private int points;
	
	@ManyToOne()
	@JoinColumn(name = "team_id")
	private Team team;

	@ManyToOne()
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "round_id")
	private Round round;

	public RoundScore() {};

	public RoundScore(Round round, Team team, int points) {
			this.round = round;
			this.team = team;
			this.points = points;
		}
	
	public RoundScore(Round round, User user, int points) {
		this.round = round;
		this.user = user;
		this.points = points;
	}
	
	public RoundScore(Round round, Team team, User user, int points) {
		this.round = round;
		this.team = team;
		this.user = user;
		this.points = points;
	}

}
