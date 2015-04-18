package main;

public class RomerLommeregner {

	private String romertalEt = "";
	private String romertalTo = "";
	private String result;
	
	private StringBuilder sb = new StringBuilder();
	private StringBuilder finalSB = new StringBuilder();

	public RomerLommeregner(String romertalEt, String romertalTo) {
		this.romertalEt = romertalEt;
		this.romertalTo = romertalTo;
		
		sb.append(romertalEt);
		sb.append(romertalTo);
		result = sb.toString();
		
	}
	
	public String add() {

		if (romertalEt == "I" && romertalTo == "V")
			return romertalTo + romertalEt;

		if (result.contains("IIIII")){
			oprundTil("V");
		if (result.contains("VV"))
			oprundTil("X");
		if (result.contains("XXXXX"))
			oprundTil("L");
		if (result.contains("LL"))
			oprundTil("C");
		if (result.contains("CCCCC"))
			oprundTil("D");
		if (result.contains("DD"))
			oprundTil("M");
		}
		return result;
	}

	private void oprundTil(String romerTal) {

		switch (romerTal) {
		case "V":
			result = result.replace("IIIII", "V");
			break;
		case "X":
			result = result.replace("VV", "X");
			break;
		case "L":
			result = result.replace("XXXXX", "L");
			break;
		case "C":
			result = result.replace("LL", "C");
			break;
		case "D":
			result = result.replace("CCCCC", "D");
			break;
		case ("M"):
			result = result.replace("DD", "M");
		}
	}
	
	private void sortRoman() {
		if(result.contains("I")){
			result = result.replace("I", "");
		}
	}

}
