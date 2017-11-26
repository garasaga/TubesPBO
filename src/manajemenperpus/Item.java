package manajemenperpus;

import java.util.Date;

public abstract class Item {
	protected String ID,Judul;
	protected int Jumlah;
	protected Date TglInput;
	
	public void setJudul(String judul) {
		Judul = judul;
	}
	public void setTglInput(Date tglInput) {
		TglInput = tglInput;
	}
	
	public String getJudul() {
		return Judul;
	}
	public int getJumlah() {
		return Jumlah;
	}
	public Date getTglInput() {
		return TglInput;
	}
	
	public void tambahStock(){
		Jumlah++;
	}
	
	public void kurangStock(){
		Jumlah--;
	}
	
}