package p1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CollectionOfElements;
@Entity
@NamedQuery(name="updateTeamName",query="update Team set teamName=? where teamId=?")
public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int teamId;
	private String teamName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Player_Detials")
	List<Player> players;
	
	@Embedded
	Address officeAddress;

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(int teamId, String teamName, List<Player> players, Address officeAddress) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.players = players;
		this.officeAddress = officeAddress;
	}

	public Team(String teamName, List<Player> players, Address officeAddress) {
		super();
		this.teamName = teamName;
		this.players = players;
		this.officeAddress = officeAddress;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", players=" + players + ", officeAddress="
				+ officeAddress + "]";
	}
	

	

}
