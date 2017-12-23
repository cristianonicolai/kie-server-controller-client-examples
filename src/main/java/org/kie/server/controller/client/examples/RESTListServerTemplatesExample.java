package org.kie.server.controller.client.examples;

import org.kie.server.controller.api.model.spec.ServerTemplateList;
import org.kie.server.controller.client.KieServerControllerClient;
import org.kie.server.controller.client.KieServerControllerClientFactory;

import static org.kie.server.controller.client.examples.Utils.*;

public class RESTListServerTemplatesExample {

    public static void main(String[] args) {
        KieServerControllerClient client = KieServerControllerClientFactory.newRestClient(getRestUrl(),
                                                                                          getUser(),
                                                                                          getPassword());

        final ServerTemplateList serverTemplateList = client.listServerTemplates();
        System.out.println(String.format("Found %s server template(s) at controller url: %s",
                                         serverTemplateList.getServerTemplates().length,
                                         getRestUrl()));
    }

}
