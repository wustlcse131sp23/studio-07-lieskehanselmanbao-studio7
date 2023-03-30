package studio7;

public class HockeyPlayer {
	private String lastName;
	private int jerseyNumber;
	private String handedness;
	
	
	
	public HockeyPlayer(String name, int number, String hand) {
		lastName = name;
		jerseyNumber = number;
		handedness = hand;
	}
	
	public int points(int assists, int goals) {
		int points = goals+assists;
		return points;
	}

}
