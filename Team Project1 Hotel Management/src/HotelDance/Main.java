package HotelDance;

public class Main {
	public static void main(String[] args) {
		HotelMain hotelmain = new HotelMain();
		Information[][] information = hotelmain.information;
		for (int i = 0; i < information.length; i++) {
			for (int j = 0; j < information[i].length; j++) {
				information[i][j] = new Information(((100 * (i + 2)) + (j + 1)), 0, 
						"", "", "", 0);
			}
		}
		hotelmain.login();
	}
}