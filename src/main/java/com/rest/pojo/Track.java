package com.rest.pojo;

public class Track {
	private String trackAlbum;
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