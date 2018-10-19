
public class MainMoscowTransport {

	public static void main(String[] args) {

		AviaTransport flight = new AviaTransport(1063.00f, 45.6f, "avia", "SurgutAirlines", "Economy", 432);

		Taxi uber = new Taxi(60.0f, 4.10f, "Taxi", "toplivo", false, "Uber", 4);

		Subway subway = new Subway(83.50f, 0.7f, "Subway", "Belorusskaya");

		Railway train = new Railway(123.0f, 7.20f, "trains", "Mezhdunarodny lines");

		Bus bus = new Bus(35.00f, 0.65f, "Bus", "type1", true, 27);

		// Transport transport = new Transport();

		Transport[] moscowTransportArray = new Transport[5];

		moscowTransportArray[0] = flight;
		moscowTransportArray[1] = uber;
		moscowTransportArray[2] = subway;
		moscowTransportArray[3] = train;
		moscowTransportArray[4] = bus;

		Transport[] sortedTransportArray = sortBySpeed(moscowTransportArray);

		for (int i = 0; i < sortedTransportArray.length; i++) {
			System.out.println(sortedTransportArray[i].getName() + sortedTransportArray[i].getSpeed());
		}

		System.out.println();
		System.out.println();

		Transport[] sortedByPriceArray = sortByTicketPrice(moscowTransportArray);

		for (int i = 0; i < sortedByPriceArray.length; i++) {
			System.out.println(sortedByPriceArray[i].getName() + sortedByPriceArray[i].getTicketPrice());
		}
	}

	public static Transport[] sortBySpeed(Transport[] transportArray) {
		Transport[] resArr = transportArray;
		for (int i = resArr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (resArr[j].getSpeed() > resArr[j + 1].getSpeed()) {
					Transport temp = resArr[j + 1];
					resArr[j + 1] = resArr[j];
					resArr[j] = temp;
				}
			}
		}
		return resArr;

	}

	public static Transport[] sortByTicketPrice(Transport[] transportArray) {
		Transport[] resArr = transportArray;
		for (int i = resArr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (resArr[j].getTicketPrice() > resArr[j + 1].getTicketPrice()) {
					Transport temp = resArr[j + 1];
					resArr[j + 1] = resArr[j];
					resArr[j] = temp;
				}
			}
		}
		return resArr;

	}

}
