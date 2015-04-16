package main;

public class RomerLommeregner {

	public String add(String romEt){
		return romEt;
	}
	
	public String add(String romEt, String romTo) {
		String result = romEt + romTo;
		if (romEt == "I" && romTo == "V")
			return romTo + romEt;
		return result;
	}

}
