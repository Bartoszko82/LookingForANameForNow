package domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="game")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="date")
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="game_type_id")
	private GameType gameType;
	
	@OneToMany(mappedBy="game")
	private List<GameResult> gameResult;
	
	private List<User> users; //rethink - could be taken from gameResult
	
	@OneToMany(mappedBy="game")
	private List<Round> rounds;
	
	public Game () {};
	
	public Game (String name, Date date, GameType gameType) {
		this.name = name;
		this.date = date;
		this.gameType = gameType;
	}

	public void addGameResult(GameResult gameResult) {
		//TOD
	}
  
	public void addREound(Round round) {
		//TODO
	}
	
	
}
