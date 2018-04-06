package com.rest.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Track {
	private String trackAlbum;
	@Id
	private String trackTitle;
	private String trackSinger;
	private String trackStatus = "Not Registered";

	public String getTrackTitle() {
		return trackTitle;
	}

	public void setTrackTitle(String trackTitle) {
		this.trackTitle = trackTitle;
	}

	public String getTrackSinger() {
		return trackSinger;
	}

	public void setTrackSinger(String trackSinger) {
		this.trackSinger = trackSinger;
	}

	public String getTrackStatus() {
		return trackStatus;
	}

	public void setTrackStatus(String trackStatus) {
		this.trackStatus = trackStatus;
	}

	public String getTrackAlbum() {
		return trackAlbum;
	}

	public void setTrackAlbum(String trackAlbum) {
		this.trackAlbum = trackAlbum;
	}

}