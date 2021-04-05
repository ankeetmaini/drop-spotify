package com.spotify.app.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Song {
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
