package WebApp;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by adyachenko on 29.08.16.
 */
public class ResourcesApp extends Application <ResourcesAppConfiguration> {
    public static void main(String[] args) throws Exception{
        new ResourcesApp().run(args);
    }

    @Override
    public String getName() {
        return "ResourcesApp";
    }

    @Override
    public void initialize (Bootstrap<ResourcesAppConfiguration> bootstrap){
        bootstrap.addBundle(new AssetsBundle("/webapp", "/app"));
    }

    @Override
    public void run(ResourcesAppConfiguration monitorAppConfiguration, Environment environment) {
        final ResourcesAppAll resource = new ResourcesAppAll(
                monitorAppConfiguration.getTemplate()
//                monitorAppConfiguration.getDefaultName()
        );
        environment.jersey().register(resource);


    }
}
