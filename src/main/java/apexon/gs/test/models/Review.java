package apexon.gs.test.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Review {

	@Id
	private Long reviewId;
	@OneToOne
	private Userss userss; //  users who wrote the review
	
	@ManyToOne
	private Course course; // 
	private int rating; // Rating 4/5
	private String comment;

}
