package com.spotify.app;

import com.spotify.app.core.Song;
import com.spotify.app.resources.SongResource;

import org.flywaydb.core.Flyway;

import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class SpotifyAppApplication extends Application<SpotifyAppConfiguration> {
    private HibernateBundle<SpotifyAppConfiguration> bundle = new HibernateBundle<SpotifyAppConfiguration>(Song.class){
        public DataSourceFactory getDataSourceFactory(SpotifyAppConfiguration configuration) {
            return configuration.getDataSourceFactory();
        }
        
    };
    public static void main(final String[] args) throws Exception {
        new SpotifyAppApplication().run(args);
    }

    @Override
    public String getName() {
        return "SpotifyApp";
    }

    @Override
    public void initialize(final Bootstrap<SpotifyAppConfiguration> bootstrap) {
        // todo find a better way
        Flyway flyway = Flyway.configure().loadDefaultConfigurationFiles().load();
        flyway.migrate();
        bootstrap.addBundle(bundle);
    }

    @Override
    public void run(final SpotifyAppConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new SongResource());
    }

}
