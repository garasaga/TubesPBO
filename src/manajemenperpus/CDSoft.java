/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajemenperpus;

import java.util.Date;

public class CDSoft extends Item{
	private String Publisher;
	private String Note;
	
	
	public CDSoft(String Publisher,String Judul,int Jumlah,Date TglInput){
		this.Publisher = Publisher;
		this.Judul = Judul;
		this.Jumlah = Jumlah;
		this.TglInput = TglInput;
	}
	public String getNote() {
		return Note;
	}
	public String getPublisher() {
		return Publisher;
	}
}

