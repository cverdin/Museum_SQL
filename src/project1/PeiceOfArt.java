package project1;

import java.awt.image.BufferedImage;

public class PeiceOfArt {
	String artName;
	String epoch;
	String type;
	String artistName;
	boolean permanentCollection;
	boolean borrowed;
	boolean ongoing;
	String location;
	String date;
	String image;
	
	public PeiceOfArt(){
		
	}
	public PeiceOfArt(String artName, String epoch, String type, String artistName, String location, String date, boolean permanentCollection, boolean borrowed, boolean ongoing, String image){
		this.artName = artName;
		this.epoch = epoch;
		this.type = type;
		this.artistName = artistName;
		this.location = location;
		this.date = date;
		this.permanentCollection = permanentCollection;
		this.borrowed = borrowed;
		this.ongoing = ongoing;
		this.image = image;
		
	}
	
	
}
