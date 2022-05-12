package week1.day1;

public class TwoWheeler {
	
	int noOfWheels=4;
	short noOfMirror=3;
	long chassisNumber=46468454684148L;
	boolean isPuncher;
	String bikeName="Yamaha RX 135";
	double runningKM=84656;
	
	

	public static void main(String[] args) {

		
		TwoWheeler obj=new TwoWheeler();
		int noOfWheels2 = obj.noOfWheels;
		short noOfMirror2 = obj.noOfMirror;
		long chassisNumber2 = obj.chassisNumber;
		boolean isPuncher2 = obj.isPuncher;
		String bikeName2 = obj.bikeName;
		double runningKM2 = obj.runningKM;
		
		
		System.out.println("NoOfWheels: " + noOfWheels2);
		System.out.println("No of mirror: " + noOfMirror2);
		System.out.println("Chassis number: " + chassisNumber2);
		System.out.println("IS Puncher: " + isPuncher2);
		System.out.println("Bike name: " + bikeName2);
		System.out.println("Running KM: " + runningKM2);
		
	}

}
