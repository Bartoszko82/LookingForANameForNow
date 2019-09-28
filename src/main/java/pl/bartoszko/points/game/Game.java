package pl.bartoszko.points.game;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import pl.bartoszko.points.round.Round;
import pl.bartoszko.points.user.Team;

@Data
@Entity
@Table(name = "game")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "date")
	private Date date;

	@Enumerated(EnumType.STRING)
	@Column(name = "game_state")
	private GameStates gameState;
	
	@ManyToOne
	@JoinColumn(name = "game_type_id")
	private GameType gameType;
	
//	@OneToMany(mappedBy="game")
//	private List<GameResult> gameResults;

//	private List<User> users; // rethink - users are in gameResults
	
	@ManyToMany
	@JoinTable(name="game_team_join", 
	joinColumns=@JoinColumn(name="game_id"),
	inverseJoinColumns=@JoinColumn(name="team_id"))
	private List<Team> teams;
	
	@OneToMany(mappedBy = "game")
	private List<Round> rounds;


	public Game() {
	};

	public Game(String name, Date date, GameType gameType) {
		this.name = name;
		this.date = date;
		this.gameType = gameType;
		this.gameState = GameStates.ONGOING;
	}

//	public void addGameResult(GameResult gameResult) {
//		if (gameResults == null) {
//			gameResults = new ArrayList<>();
//		}
//		gameResults.add(gameResult);
//		gameResult.setGame(this);
//	}

//	public void addRound(Round round) {
//		if (rounds == null) {
//			rounds = new ArrayList<>();
//		}
//		rounds.add(round);
//		round.setGame(this);
//	}
}