package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="round")
@Data
public class Round {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="number_in_sequence")
	private int number_in_sequence;
	
	@ManyToOne
	@JoinColumn(name="game_id")
	private Game game;
	
	public Round() {};
	
	public Round(String name, int number_in_sequence, Game game) {
		this.name = name;
		this.number_in_sequence = number_in_sequence;
		this.game = game;
	}
	
	public void setGame(Game game) {
		this.game = game;
	}
	
}
