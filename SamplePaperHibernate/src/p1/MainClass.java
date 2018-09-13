package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;







public class MainClass {

	List<Player> playerTeam1 = new ArrayList<>();
	List<Player> playerTeam2 = new ArrayList<>();
	// load cdg file
	Configuration cfg = new AnnotationConfiguration();
	// Session factory
	SessionFactory factory = cfg.configure().buildSessionFactory();
	// session
	Session session = factory.openSession();
	// transaction
	Transaction t = session.beginTransaction();
	// business operation
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		MainClass m = new MainClass();

		while (true) {
			System.out.println("enter choice:");
			System.out.println("1 to add Match information");
			System.out.println("2 to Update Address");
			System.out.println("3 to update Team using named Query");
			System.out.println("4 to change team for a match using session method");
			System.out.println("5 to see match information using session");
			System.out.println("6 to see address info of a team using hql");
			System.out.println("7 to see address info of user using criteria");
			System.out.println("8 to change address of player using hql");
			System.out.println("0 to exit");
			int ch = Integer.parseInt(m.sc.nextLine());
			switch (ch) {
			case 1:
				m.addMatch();
				break;
			case 2:
				m.updateAddress();
				break;
			case 3:
				m.updateTeamName();
				break;
			case 4:
				m.changeTeamForMatch();
				break;
			case 5:
				System.out.println("ennter match id");
				int id=Integer.parseInt(m.sc.nextLine());
				m.matchInformation(id);
				break;
			case 6:
				m.address();
				break;
			case 7:
				m.playerAddress();
				break;
			case 8:
				m.changePlayerAddressUsingHQL();
				break;
			case 0:
				System.exit(0);

			default:
				System.out.println("Wrong choice");
				break;
			}// switch end

		} // while end

	}// main end

	public void addMatch() {
		t = session.beginTransaction();
		playerTeam1.add(new Player("Ronaldo", new Address(104, "NewYork City")));
		playerTeam2.add(new Player("Messi", new Address(104, "Chicago")));
		Match match = new Match("Brazil", new Team("ManU", playerTeam1, new Address(99, "team1Street")),
				new Team("ManCity", playerTeam2, new Address(99, "team2Street")));
		session.save(match);
		t.commit();
		session.close();

	}

	public void updateTeamName() {

		System.out.println("Enter New Team Name");
		String teamname = sc.nextLine();
		t = session.beginTransaction();
		org.hibernate.Query q = session.getNamedQuery("updateTeamName");
		q.setString(0, teamname);
		q.setInteger(1, 2);
		q.executeUpdate();
		t.commit();
		System.out.println("Update Done");
		session.close();
	}

	public void updateAddress() {

		System.out.println("Press 1 to update Team Address");
		System.out.println("Press 2 to update Player Address");
		int option = Integer.parseInt(sc.nextLine());
		switch (option) {
		case 1:
			t = session.beginTransaction();
			
			  System.out.println("Enter Team ID"); int id =
			  Integer.parseInt(sc.nextLine()); Team team = (Team)
			  session.get(Team.class, id);
			  System.out.println("Enter new Street Name"); String streetName =
			  sc.nextLine(); 
			  team.getOfficeAddress().setStreetName(streetName);
			  System.out.println("Enter new Street No"); int streetNo =
			  Integer.parseInt(sc.nextLine());
			  team.getOfficeAddress().setStreetNo(streetNo);
			  session.save(team);
			/*System.out.println(" --------->>>  1");
			org.hibernate.Query q = session.createQuery("update Team set officeAddress=? where teamId=?");
			q.setEntity(0, new Address(101, "ganj"));
			q.setInteger(1, 2);
			int z = q.executeUpdate();
			System.out.println(" ------------>> 2 z"+z);*/
			t.commit();
			session.close();
			break;
		case 2:

			t = session.beginTransaction();
			System.out.println("Enter Player ID");
			int id1 = Integer.parseInt(sc.nextLine());
			Player player = (Player) session.get(Player.class, id1);
			System.out.println("Enter new Street Name");
			String streetName1 = sc.nextLine();
			player.getPlayerAddress().setStreetName(streetName1);
			System.out.println("Enter new Street Name");
			int streetNo1 = Integer.parseInt(sc.nextLine());
			player.getPlayerAddress().setStreetNo(streetNo1);
			session.save(player);
			t.commit();
			session.close();
			break;
		
		default:
			System.out.println("Wrong Input");
			break;
		}

	}// update Address end
	
	
	public void changeTeamForMatch()
	{
		List<Player> lps = new ArrayList<>();
		lps.add(new Player("Rohit",new Address(1, "Bhopal")));
		t=session.beginTransaction();
		System.out.println("enter id to be replaced with new team");
		int id=Integer.parseInt(sc.nextLine());
		Team team=(Team)session.get(Team.class, id);
		team.setOfficeAddress(new Address(123, "Mohan nagar"));
		team.setPlayers(lps);
		team.setTeamName("Barca");
	    session.save(team);
	    t.commit();
	    session.close();
	    System.out.println("updated");
	}
	
	public void matchInformation(int id)
	{
		Match match=(Match)session.get(Match.class, id);
		System.out.println(match);
	}
	
	public void address()
	{
		
		org.hibernate.Query query=session.createQuery("from Team where teamid=?");
		query.setInteger(0, 2);
		List<Team> add=query.list();
		for (Team address : add) {
			System.out.println(address.getOfficeAddress());
		}
	}
	
	public void playerAddress()
	{
		Transaction t=session.beginTransaction();
		Criteria c=session.createCriteria(Player.class);
		List<Player> player=c.add(Restrictions.idEq(10)).list();
		for (Player product : player) {
			System.out.println(product.getPlayerAddress());
		}
	}
	
	
	public void changePlayerAddressUsingHQL()
	{	Transaction t=session.beginTransaction();
		String query1="update Player set streetNo=?,streetName=? where playerId=? ";
		org.hibernate.Query query=session.createQuery(query1);
		query.setInteger(0, 123);
		query.setString(1, "manormaganj");
		query.setInteger(2, 5);
		query.executeUpdate();
		t.commit();
		
	
		
		
		
	}
}// class end
