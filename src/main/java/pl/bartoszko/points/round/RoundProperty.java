package pl.bartoszko.points.round;

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
@Table(name="round_property")
@Data
public class RoundProperty {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="key")
	private String key;
	
	@Column(name="value")
	private int value;
	
	@ManyToOne
	@JoinColumn(name="round_id")
	private Round round;
	
	public RoundProperty() {};
	
	public RoundProperty(Round round, String key, int value) {
		this.round = round;
		this.key = key;
		this.value = value;
	}
}
