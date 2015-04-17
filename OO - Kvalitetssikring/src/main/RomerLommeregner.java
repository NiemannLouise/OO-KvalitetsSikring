package main;

public class RomerLommeregner {

	private String romertalEt = "";
	private String romertalTo = "";
	private String result;
	private StringBuilder sb = new StringBuilder();
	
	//Set konstruktor
	public RomerLommeregner(String romertalEt, String romertalTo) {
		this.romertalEt = romertalEt;
		this.romertalTo = romertalTo;
	}
 
	
	public String add() {

		sb.append(romertalEt);
		sb.append(romertalTo);
		result = sb.toString();

		if (romertalEt == "I" && romertalTo == "V")
			return romertalTo + romertalEt;

		if (sb.toString().contains("IIIII"))
			oprundTil("V");
		if (sb.toString().equals("VV"))
			oprundTil("X");
		if (sb.toString().equals("XXXXX"))
			oprundTil("L");
		if(sb.toString().equals("LL"))
			oprundTil("C");
		if(sb.toString().equals("CCCCC"))
			oprundTil("D");
		if(sb.toString().equals("DD"))
			oprundTil("M");
		return result;

	}
	
	private void oprundTil(String romerTal) {
		
		switch(romerTal) {
		case "V":
			result = "V";
			break;
		case "X":
			result = "X";
			break;
		case "L":
			result = "L";
			break;
		case "C":
			result = "C";
			break;
		case "D":
			result = "D";
			break;
		case ("M"):
			result = "M";
		}
	}

}
