package pl.bartoszko.points.game.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import pl.bartoszko.points.game.ConfigurationKeys;

@Entity
@Table(name="game_type_property")
@Data
public class GameTypeProperty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Enumerated(EnumType.STRING)
	@Column(name="key")
	private ConfigurationKeys key;
	
	@Column(name="value")
	private String value;
	
	@ManyToOne(fetch = FetchType.EAGER)
//	@ManyToOne
	@JoinColumn(name="game_type_id") 
	private GameType gameType;
	
	public GameTypeProperty() {}
	
	public GameTypeProperty(ConfigurationKeys key, String value) {
		this.key = key;
		this.value = value;
	}
}
