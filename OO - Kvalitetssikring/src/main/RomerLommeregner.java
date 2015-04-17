package main;

public class RomerLommeregner {

	private String romertalEt = "";
	private String romertalTo = "";
	private String result;
	private StringBuilder sb = new StringBuilder();

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

		if (sb.toString().contains("IIIII"))
			oprundTil("V");
		if (sb.toString().contains("VV"))
			oprundTil("X");
		if (sb.toString().contains("XXXXX"))
			oprundTil("L");
		if (sb.toString().contains("LL"))
			oprundTil("C");
		if (sb.toString().contains("CCCCC"))
			oprundTil("D");
		if (sb.toString().contains("DD"))
			oprundTil("M");
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
