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
@Table(name="user_details")
@Data
public class UserDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="active")
	private boolean active;
	
	@OneToOne(mappedBy="userDetails")
	private User user;
	
	public UserDetails () {};
	
	public UserDetails (String email) {
		this.email = email;
		this.active = true;
	}
 	
}
