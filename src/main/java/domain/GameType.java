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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="game_type")
@Data
public class GameType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String typeName;
	
	@ManyToMany
	@JoinTable(name="type_property", 
	joinColumns=@JoinColumn(name="game_type_id"),
	inverseJoinColumns=@JoinColumn(name="game_type_property_id"))
	private List<GameTypeProperty> gameTypeProperties;
	
	@OneToMany(mappedBy="gameType")
	private Game game;
	
	public GameType() {}
	
	public GameType(String typeName, GameTypeProperty typeSettings) {
		this.typeName = typeName;
		this.typeSettings = typeSettings;
	}
	
}
