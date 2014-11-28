package ru.qatools.school.baguette.util;

import ru.yandex.qatools.properties.PropertyLoader;
import ru.yandex.qatools.properties.annotations.Property;
import ru.yandex.qatools.properties.annotations.Resource;
import ru.yandex.qatools.properties.annotations.With;
import ru.yandex.qatools.properties.providers.MapOrSyspropPathReplacerProvider;

/**
 * Created by turbogreddy on 27.11.2014.
 */

@With(MapOrSyspropPathReplacerProvider.class)
@Resource.Classpath("test.properties")
public class ServerConfig {
    @Property("db.path")
    private String dbLocation = "mem";

    @Property("db.name")
    private String dbName = "baguette";

    ServerConfig() {
        PropertyLoader.populate(this);
    }

    public String getDbLocation() {
        return dbLocation;
    }

    public void setDbLocation(String dbLocation) {
        this.dbLocation = dbLocation;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public static ServerConfig newInstance() {
        return new ServerConfig();
    }
}
