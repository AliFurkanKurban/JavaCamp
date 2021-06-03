package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="candidates")
public class Candidate extends Users  {
	

	
	@Column(name ="first_name")
	private String firstName;
	
	@Column(name ="last_name")
	private String lastName;
	
	@Column(name ="identity_number")
	private String identityNumber;
	
	@Column(name ="birth_of_year")
	private Date birthOfYear;
	
	
	

	
	


}
