package com.spotify.app.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.spotify.app.core.Song;

@Path("/songs")
@Produces(MediaType.APPLICATION_JSON)
public class SongResource {

  @Path("/random")
  @GET
  @Timed
  public Song getRandomSong() {
    return new Song(1, "Call Me Maybe");
  }
}
