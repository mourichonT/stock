package users;

public class Providers {
	
	private int providerId;
	private String adress;
	private String providerName;
	
	
	public Providers(int providerId, String adress, String providerName) {
		super();
		this.providerId = providerId;
		this.adress = adress;
		this.providerName = providerName;
	}


	public int getProviderId() {
		return providerId;
	}


	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getProviderName() {
		return providerName;
	}


	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	
	
	

}
