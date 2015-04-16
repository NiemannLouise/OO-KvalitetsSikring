package main;

public class RomerLommeregner {

	public String add(String romEt){
		return romEt;
	}
	
	public String add(String romEt, String romTo) {
		if (romEt == "I" && romTo == "V")
			return romTo + romEt;
		return romEt + romTo;
	}

}
