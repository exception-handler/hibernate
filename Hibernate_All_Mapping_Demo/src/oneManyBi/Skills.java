package oneManyBi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Testskills")
public class Skills {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String skillName;
	private int competencyLevel;
	private boolean isCertified;
	
	@ManyToOne
	@JoinColumn(name="candidate")
	private Student student;
	
	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skills(String skillName, int competencyLevel, boolean isCertified) {
		super();
		this.skillName = skillName;
		this.competencyLevel = competencyLevel;
		this.isCertified = isCertified;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public int getCompetencyLevel() {
		return competencyLevel;
	}
	public void setCompetencyLevel(int competencyLevel) {
		this.competencyLevel = competencyLevel;
	}
	public boolean isCertified() {
		return isCertified;
	}
	public void setCertified(boolean isCertified) {
		this.isCertified = isCertified;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Skills [id=" + id + ", skillName=" + skillName + ", competencyLevel=" + competencyLevel
				+ ", isCertified=" + isCertified + ", student=" + student + "]";
	}
	
	
}
