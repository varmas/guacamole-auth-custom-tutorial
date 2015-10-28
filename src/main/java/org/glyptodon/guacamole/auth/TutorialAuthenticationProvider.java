package org.glyptodon.guacamole.auth;

import java.util.Map;
import org.glyptodon.guacamole.GuacamoleException;
import org.glyptodon.guacamole.net.auth.simple.SimpleAuthenticationProvider;
import org.glyptodon.guacamole.net.auth.Credentials;
import org.glyptodon.guacamole.protocol.GuacamoleConfiguration;

public class TutorialAuthenticationProvider extends SimpleAuthenticationProvider {

    @Override
    public Map<String, GuacamoleConfiguration>
        getAuthorizedConfigurations(Credentials credentials)
        throws GuacamoleException {

        // Get username
        String username = GuacamoleProperties.getRequiredProperty(
            TutorialProperties.TUTORIAL_USER
        );      

        // If wrong username, fail
        if (!username.equals(credentials.getUsername()))
            return null;

        // Get password
        String password = GuacamoleProperties.getRequiredProperty(
            TutorialProperties.TUTORIAL_PASSWORD
        );      

        // If wrong password, fail
        if (!password.equals(credentials.getPassword()))
            return null;

        // Successful login. Return configurations.
        Map<String, GuacamoleConfiguration> configs = 
            new HashMap<String, GuacamoleConfiguration>();

        // Create new configuration
        GuacamoleConfiguration config = new GuacamoleConfiguration();

        // Set protocol specified in properties
        config.setProtocol(GuacamoleProperties.getRequiredProperty(
            TutorialProperties.TUTORIAL_PROTOCOL
        ));

        // Set all parameters, splitting at commas
        for (String parameterValue : GuacamoleProperties.getRequiredProperty(
            TutorialProperties.TUTORIAL_PARAMETERS
        ).split(",\\s*")) {

            // Find the equals sign
            int equals = parameterValue.indexOf('=');
            if (equals == -1)
                throw new GuacamoleException("Required equals sign missing");

            // Get name and value from parameter string
            String name = parameterValue.substring(0, equals);
            String value = parameterValue.substring(equals+1);

            // Set parameter as specified
            config.setParameter(name, value);

        }

        configs.put("DEFAULT", config);
        return configs;

    }
}
