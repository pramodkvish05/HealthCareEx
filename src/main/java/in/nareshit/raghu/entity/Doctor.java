package in.nareshit.raghu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="doctor_tab")
public class Doctor {

	@Id
	@Column(name="doc_id_col")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="doc_fn_col")
	private String firstName;
	
	@Column(name="doc_ln_col")
	private String lastName;
	
	@Column(name="doc_mail_col")
	private String email;
	
	@Column(name="doc_addr_col")
	private String address;
	
	@Column(name="doc_mob_col")
	private String mobile;
	
	@Column(name="doc_gen_col")
	private String gender;
	
	@Column(name="doc_note_col")
	private String note;
	
	@Column(name="doc_img_col")
	private String photoLoc;
	
	
	//----------Association Mapping------------------
	@ManyToOne
	@JoinColumn(name="spec_id_fk_col")
	private Specialization specialization; //HAS-A
	
}
