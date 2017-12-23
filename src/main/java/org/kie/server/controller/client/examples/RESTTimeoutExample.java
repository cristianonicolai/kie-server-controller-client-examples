package org.kie.server.controller.client.examples;

import java.util.concurrent.TimeUnit;
import javax.ws.rs.core.Configuration;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;

import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.controller.api.model.spec.ServerTemplateList;
import org.kie.server.controller.client.KieServerControllerClient;
import org.kie.server.controller.client.KieServerControllerClientFactory;

import static org.kie.server.controller.client.examples.Utils.*;

public class RESTTimeoutExample {

    public static void main(String[] args) {
        final Configuration configuration =
                new ResteasyClientBuilder()
                        .establishConnectionTimeout(10,
                                                    TimeUnit.SECONDS)
                        .socketTimeout(60,
                                       TimeUnit.SECONDS)
                        .getConfiguration();
        KieServerControllerClient client = KieServerControllerClientFactory.newRestClient(getRestUrl(),
                                                                                          getUser(),
                                                                                          getPassword(),
                                                                                          MarshallingFormat.JSON,
                                                                                          configuration);

        final ServerTemplateList serverTemplateList = client.listServerTemplates();
        System.out.println(String.format("Found %s server template(s) at controller url: %s",
                                         serverTemplateList.getServerTemplates().length,
                                         getRestUrl()));
    }

}
