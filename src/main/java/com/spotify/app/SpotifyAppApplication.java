package com.spotify.app;

import com.spotify.app.resources.SongResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class SpotifyAppApplication extends Application<SpotifyAppConfiguration> {

    public static void main(final String[] args) throws Exception {
        new SpotifyAppApplication().run(args);
    }

    @Override
    public String getName() {
        return "SpotifyApp";
    }

    @Override
    public void initialize(final Bootstrap<SpotifyAppConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final SpotifyAppConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new SongResource());
    }

}
