
public class Taxi extends GroundTransport {

	private String agencyName;
	private int countPassengers;

	public Taxi() {

	}

	public Taxi(float speed, float ticketPrice, String name, String engineType, boolean isPublicTransport, String agencyName, int countPassengers) {
		super(speed, ticketPrice, name, engineType, isPublicTransport);
this.agencyName = agencyName;
this.countPassengers = countPassengers;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public int getCountPassengers() {
		return countPassengers;
	}

	public void setCountPassengers(int countPassengers) {
		this.countPassengers = countPassengers;
	}
	
	

}
