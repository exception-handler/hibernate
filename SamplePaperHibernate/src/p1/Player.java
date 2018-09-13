package p1;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Player {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int playerId;
	private String playerName;
	@Embedded
	Address playerAddress;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int playerId, String playerName, Address playerAddress) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerAddress = playerAddress;
	}
	public Player(String playerName, Address playerAddress) {
		super();
		this.playerName = playerName;
		this.playerAddress = playerAddress;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Address getPlayerAddress() {
		return playerAddress;
	}
	public void setPlayerAddress(Address playerAddress) {
		this.playerAddress = playerAddress;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerAddress=" + playerAddress + "]";
	}
	
	
	
}
