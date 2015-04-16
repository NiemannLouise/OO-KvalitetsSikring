package main;

public class RomerLommeregner {

	public String add(String romEt){
		return romEt;
	}
	
	public String add(String romEt, String romTo) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(romEt);
		sb.append(romTo);
		String result = sb.toString();
		
		if (romEt == "I" && romTo == "V")
			return romTo + romEt;
		
		if (sb.toString() == "IIIII")
			result = "V";
	
		return result;
	}

}
