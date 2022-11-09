package db_connect;

public class MovieVO {
	private int ID;
	private String NAME;
	private String IMG;
	private String CONTENT;
	private String GERNE;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getIMG() {
		return IMG;
	}
	public void setIMG(String iMG) {
		IMG = iMG;
	}
	public String getCONTENT() {
		return CONTENT;
	}
	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}
	public String getGERNE() {
		return GERNE;
	}
	public void setGERNE(String gERNE) {
		GERNE = gERNE;
	}
	@Override
	public String toString() {
		return "MovieVO [ID=" + ID + ", NAME=" + NAME + ", IMG=" + IMG + ", CONTENT=" + CONTENT + ", GERNE=" + GERNE
				+ "]";
	}

	
	
	
}
