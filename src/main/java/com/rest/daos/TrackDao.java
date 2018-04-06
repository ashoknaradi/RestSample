package com.rest.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.rest.pojos.Track;

public class TrackDao implements IntTrackDao {
	
	public Session openSession() {
		Configuration configure = new AnnotationConfiguration().configure("hibernate.cfg.xml");
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}

	public void registerTrackForAlbum(Track track) {
			Session openSession = openSession();
			openSession.save(track);
			openSession.beginTransaction().commit();
			openSession.close();
	}

}
