
public class Railway extends Transport {

	private String typeOfTrain;

	public Railway() {

	}

	public Railway(float speed, float ticketPrice, String name, String typeOfTrain) {
		super(speed, ticketPrice, name);
		this.typeOfTrain = typeOfTrain;
	}

	public String getTypeOfTrain() {
		return typeOfTrain;
	}

	public void setTypeOfTrain(String typeOfTrain) {
		this.typeOfTrain = typeOfTrain;
	}

}
