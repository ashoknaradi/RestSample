package com.rest.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.rest.daos.IntTrackDao;
import com.rest.daos.TrackDao;
import com.rest.pojos.Track;

@Path("/restTrack")
public class Track_JSONService {
	static int count = 0;
	{
		count++;
		System.out.println("Total request count is : " + count);
	}

	@GET
	@Path("/getTrack")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTrackDetails(@QueryParam("trackName") String trackName) {
		try {
			System.out.println("Requested Track Name is : " + trackName);
			Track track = new Track();
			track.setTrackSinger("DSP");
			track.setTrackAlbum("Rangasthalam");
			track.setTrackTitle(trackName);
			// get track name object based on trackName
			return Response.status(200).entity(track).build();
		} catch (Exception e) {
			System.out.println("Test Connection failed");
			return Response.status(500).entity("Error at server side ").build();
		}
	}

	/*@POST
	@Path("/registerTrack")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registerTrackForAlbum(Track track) {
		try {
			if (track.getTrackTitle() != null && track.getTrackSinger() != null) {
				track.setTrackStatus("Track is Registered!.....");
				System.out.println("Track Status is ::: " + track.getTrackStatus());
				// Database hit to update table.
			} else { 
				System.out.println("Track is not registered!.... ");
			}
			// Dao object.. save team object into Database.
			return Response.status(200).entity(track).build();
		} catch (Exception e) {
			System.out.println("Test Connection failed");
			return Response.status(500).entity("Error at server side ").build();
		}
	}*/
	
	@POST
	@Path("/registerTrack")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registerTrackForAlbum(Track track) {
		try {
			if (track.getTrackTitle() != null && track.getTrackSinger() != null && track.getTrackAlbum() != null) {
				track.setTrackStatus("Registered");
				System.out.println("Track Status is ::: " + track.getTrackStatus());
				// Database hit to update table.
			} else { 
				System.out.println("Track is not registered!.... ");
			}
			// Dao object.. save track object into Database.
			IntTrackDao itd = new TrackDao();
			itd.registerTrackForAlbum(track);
			return Response.status(200).entity(track).build();
		} catch (Exception e) {
			System.out.println("Track registration failed");
			return Response.status(500).entity("Error at server side ").build();
		}
	}
}