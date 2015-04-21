package main;

public class RomerLommeregner {

	private String romertalEt = "";
	private String romertalTo = "";
	private String mellemled;
	private String result;
	
	private StringBuilder sb = new StringBuilder();
	private StringBuilder finalSB = new StringBuilder();

	//Konstruktor
	public RomerLommeregner(String romertalEt, String romertalTo) {
		this.romertalEt = romertalEt;
		this.romertalTo = romertalTo;
		
		sb.append(romertalEt).append(romertalTo);
		mellemled = sb.toString();
		
		result = finalSB.toString();
		
	}
	
	public String add() {

		while(mellemled.contains("M"))
			sortRoman("M");
		
		while(mellemled.contains("D")){
			sortRoman("D");
			if (result.contains("DD"))
				oprundTil("DD", "M");
		}
		while(mellemled.contains("C")){
			sortRoman("C");
			if (result.contains("CCCCC"))
				oprundTil("CCCCC", "D");
		}
		while(mellemled.contains("L")){
			sortRoman("L");
			if (result.contains("LL"))
				oprundTil("LL", "C");
		}
		while(mellemled.contains("X")){
			sortRoman("X");
			if (result.contains("XXXXX"))
				oprundTil("XXXXX", "L");
		}
		while(mellemled.contains("V")){
			sortRoman("V");
			if (result.contains("VV"))
				oprundTil("VV", "X");
		}
		while(mellemled.contains("I")){
			sortRoman("I");
			if (result.contains("IIIII"))
				oprundTil("IIIII", "V");
			}
			return result;
	}
	
	private void oprundTil(String før, String efter) {
		result = result.replace(før, efter);
	}
	
	private void sortRoman(String romertal) {
		mellemled = mellemled.replaceFirst(romertal, "");
		result = result.replaceFirst("", romertal);
	}
}