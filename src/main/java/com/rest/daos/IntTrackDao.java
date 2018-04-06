package com.rest.daos;

import org.hibernate.Session;

import com.rest.pojos.Track;

public interface IntTrackDao {
	public Session openSession();

	public void registerTrackForAlbum(Track track);
}
