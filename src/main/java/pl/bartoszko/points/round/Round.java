package pl.bartoszko.points.round;

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
import pl.bartoszko.points.game.Game;

@Entity
@Table(name="round")
@Data
public class Round {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="ordinal_number")
	private int ordinalNumber;
	
	@ManyToOne
	@JoinColumn(name="game_id")
	private Game game;
	
	@OneToMany(mappedBy="round")
	private List<RoundScore> roundScores;
	
	@OneToMany(mappedBy="round")
	private List<RoundProperty> roundProperties;
	
	public Round() {};
	
	public Round(int ordinalNumber, Game game) {
		this.ordinalNumber = ordinalNumber;
		this.game = game;
	}
	
}
