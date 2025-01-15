package pl.bartoszko.points.game.entity;

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
import pl.bartoszko.points.game.GameState;
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
	private GameState gameState;

	@ManyToOne
	@JoinColumn(name = "game_type_id")
	private GameType gameType;

	@ManyToMany
	@JoinTable(name = "game_team_join", joinColumns = @JoinColumn(name = "game_id"), inverseJoinColumns = @JoinColumn(name = "team_id"))
	private List<Team> teams;

	@OneToMany(mappedBy = "game")
	private List<Round> rounds;

	public Game() {
	};

	public Game(String name, Date date, GameType gameType) {
		this.name = name;
		this.date = date;
		this.gameType = gameType;
		this.gameState = GameState.ONGOING;
	}
}