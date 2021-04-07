package com.spotify.app.core;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "songs")
public class Song {
  @Id
  private final long id;
  private final String name;

  public Song(long id, String name) {
    this.id = id;
    this.name = name;
  }

  @JsonProperty
  public long getId() {
    return id;
  }

  @JsonProperty
  public String getName() {
    return name;
  }
}
