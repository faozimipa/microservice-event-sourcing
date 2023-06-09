package configuration;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Application;

@OpenAPIDefinition(tags = {
                @Tag(name = "Bank Account", description = "Bank account operations.")
}, info = @Info(title = "Quarkus CQRS EventSourcing Microservice", version = "1.0.0", contact = @Contact(name = "Faozi", url = "https://github.com/faozimipa", email = "gmail@faozi.me")))
@ApplicationScoped
public class SwaggerOpenAPIConfiguration extends Application {
}
