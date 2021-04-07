package com.spotify.app.dao;

import com.spotify.app.core.Song;

import org.hibernate.SessionFactory;

import io.dropwizard.hibernate.AbstractDAO;

public class SongDAO extends AbstractDAO<Song> {
  public SongDAO(SessionFactory factory) {
    super(factory);
  }

  public Song getRandom() {
     return new Song(1, "dfdf");
  }
}
