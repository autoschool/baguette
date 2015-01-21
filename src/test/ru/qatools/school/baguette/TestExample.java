package ru.qatools.school.baguette;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ProvideSystemProperty;
import ru.qatools.school.baguette.util.ServerConfig;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by turbogreddy on 21.01.2015.
 */
public class TestExample {
    @Rule
    public ProvideSystemProperty systemProperty =
            new ProvideSystemProperty("environment", "test");

    @Test
    public void testEnvironmentConfigTest() {
        ServerConfig config = ServerConfig.newInstance();
        assertThat(config.getDbLocation(), notNullValue());
        assertThat(config.getDbName(), notNullValue());
    }
}
