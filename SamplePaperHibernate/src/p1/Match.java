package p1;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="Match_Table")
public class Match {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int matchId;
	private String matchLocation;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Teamone")
	Team team1;
	@JoinColumn(name="Teamtwo")
	@OneToOne(cascade=CascadeType.ALL)
	Team team2; 
	
	public Match(String matchLocation, Team team1, Team team2) {
		super();
		this.matchLocation = matchLocation;
		this.team1 = team1;
		this.team2 = team2;
	}
	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", matchLocation=" + matchLocation + ", team1=" + team1 + ", team2="
				+ team2 + "]";
	}
	public Match(int matchId, String matchLocation, Team team1, Team team2) {
		super();
		this.matchId = matchId;
		this.matchLocation = matchLocation;
		this.team1 = team1;
		this.team2 = team2;
	}
	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getMatchLocation() {
		return matchLocation;
	}
	public void setMatchLocation(String matchLocation) {
		this.matchLocation = matchLocation;
	}
	public Team getTeam1() {
		return team1;
	}
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	public Team getTeam2() {
		return team2;
	}
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	
	

}
