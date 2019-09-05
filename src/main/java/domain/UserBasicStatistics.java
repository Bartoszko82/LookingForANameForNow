package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="user_basic_statistic")
@Data
public class UserBasicStatistics {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@OneToOne(mappedBy="userBasicStatistic")
	private User user;
	
	@Column(name="games_played")
	private int gamesPlayed;
	
	@Column(name="gamesWon")
	private int gamesWon; 
	
	public UserBasicStatistics() {};
}

