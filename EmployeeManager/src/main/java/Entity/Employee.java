package Entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "hibernate.employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	int id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "password")
	String password;
	
	@Column(name = "role")
	String role;
	

}
