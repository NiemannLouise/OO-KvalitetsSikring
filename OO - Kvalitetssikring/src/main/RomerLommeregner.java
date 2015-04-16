package main;

public class RomerLommeregner {

	private String result = "";
	
	public String add(String romEt, String romTo) {

		StringBuilder sb = new StringBuilder();
		sb.append(romEt);
		sb.append(romTo);
		result = sb.toString();

		if (romEt == "I" && romTo == "V")
			return romTo + romEt;

		if (sb.toString().equals("IIIII"))
			oprundTil("V");
		if (sb.toString().equals("VV"))
			oprundTil("X");
		if (sb.toString().equals("XXXXX"))
			oprundTil("L");
		if(sb.toString().equals("LL"))
			oprundTil("C");
		if(sb.toString().equals("CCCCC"))
			oprundTil("D");
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
		}
	}

}
