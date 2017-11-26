package manajemenperpus;

public class Admin {
	private String idAdmin,Password, Username;
	private boolean Active;
	
	public Admin(String Username,String Password){
		this.Username = Username;
		setPassword(Password);
	}
	public void setPassword(String Password){
		this.Password = Password;
	}
	
	public void Banned(boolean banned){
		Active = banned;
	}
	
}
