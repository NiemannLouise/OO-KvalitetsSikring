package main;

public class RomerLommeregner {

	private String romertalEt = "";
	private String romertalTo = "";
	private String result;
	private String finalResult;
	
	private StringBuilder sb = new StringBuilder();
	
	private StringBuilder sbI = new StringBuilder();
	
	private StringBuilder finalSB = new StringBuilder();

	//Konstruktor
	public RomerLommeregner(String romertalEt, String romertalTo) {
		this.romertalEt = romertalEt;
		this.romertalTo = romertalTo;
		
		sb.append(romertalEt).append(romertalTo);
		result = sb.toString();
		
		finalSB.append(sbI);		
		finalResult = finalSB.toString();
		
	}
	
	public String add() {

		//Pr�ver
		while(result.contains("I")){
			sortRoman();
			if (finalResult.contains("IIIII")){
				oprundTil("V");
		}
		
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
		return finalResult;
	}

	private void oprundTil(String romerTal) {

		switch (romerTal) {
		case "V":
			finalResult = finalResult.replace("IIIII", "V");
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
		result = result.replaceFirst("I", "");
		finalResult = finalResult.replaceFirst("", "I");
	}

}