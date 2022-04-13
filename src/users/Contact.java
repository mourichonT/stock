package users;


import users.Providers;

public class Contact extends Providers {

		private int contactID;
		private String contactFirstName;
		private String contactLastName;
		private String contactPhone;
		
		
		public Contact(int providerId, String adress, String providerName, int contactID, String contactFirstName,
				String contactLastName, String contactPhone) 
		{
			super(providerId, adress, providerName);
			
			this.contactID = contactID;
			this.contactFirstName = contactFirstName;
			this.contactLastName = contactLastName;
			this.contactPhone = contactPhone;
		}


		public int getContactID() {
			return contactID;
		}


		public void setContactID(int contactID) {
			this.contactID = contactID;
		}


		public String getContactFirstName() {
			return contactFirstName;
		}


		public void setContactFirstName(String contactFirstName) {
			this.contactFirstName = contactFirstName;
		}


		public String getContactLastName() {
			return contactLastName;
		}


		public void setContactLastName(String contactLastName) {
			this.contactLastName = contactLastName;
		}


		public String getContactPhone() {
			return contactPhone;
		}


		public void setContactPhone(String contactPhone) {
			this.contactPhone = contactPhone;
		}
	
	
		
		
		
		// TODO Auto-generated constructor stub
	}


