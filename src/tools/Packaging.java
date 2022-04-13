package tools;

public class Packaging {
	
	private int packagingID;
	private String typePackage;
	private String description;
	
	
	public Packaging(int packagingID, String typePackage, String description) {
		super();
		this.packagingID = packagingID;
		this.typePackage = typePackage;
		this.description = description;
	}


	public int getPackagingID() {
		return packagingID;
	}


	public void setPackagingID(int packagingID) {
		this.packagingID = packagingID;
	}


	public String getTypePackage() {
		return typePackage;
	}


	public void setTypePackage(String typePackage) {
		this.typePackage = typePackage;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
