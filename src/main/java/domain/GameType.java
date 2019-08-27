package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	
	@OneToOne
	@JoinColumn(name="type_setting_id")
	private TypeSetting typeSetting;
	
	@OneToMany(mappedBy="gameType")
	private Game game;
	
	public GameType() {}
	
	public GameType(String typeName, TypeSetting typeSetting) {
		this.typeName = typeName;
		this.typeSetting = typeSetting;
	}
	
}
