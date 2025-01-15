package pl.bartoszko.points.game.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import pl.bartoszko.points.game.RoundProperty;
import pl.bartoszko.points.game.RoundScore;

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
	
	@OneToOne
//	@JoinColumn(name="game_id")
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
