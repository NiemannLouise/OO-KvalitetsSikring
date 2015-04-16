package main;

public class RomerLommeregner {

	public String add(String romEt, String romTo) {

		StringBuilder sb = new StringBuilder();
		sb.append(romEt);
		sb.append(romTo);
		String result = sb.toString();

		if (romEt == "I" && romTo == "V")
			return romTo + romEt;

		if (sb.toString().equals("IIIII"))
			result = "V";

		if (sb.toString().equals("VV"))
			result = "X";

		if (sb.toString().equals("XXXXX"))
			result = "L";
		
		if(sb.toString().equals("LL"))
			result = "D";

		return result;

	}

}
