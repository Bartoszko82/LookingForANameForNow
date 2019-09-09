package domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="game_type_property")
@Data
public class GameTypeProperty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="key")
	private String key;
	
	@Column(name="value")
	private String value;
	
	@ManyToMany
	@JoinTable(name="type_property", 
	joinColumns=@JoinColumn(name="game_type_property_id"),
	inverseJoinColumns=@JoinColumn(name="game_type_id"))
	private List<GameType> gameTypes;
}
