package io.swagger.v3.jaxrs2.resources.petstore.tags;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by rafaellopez on 11/26/17.
 */

public class TagMethodResource {
    @GET
    @Path("/")
    @Tag(name = "Third Tag")
    @Tag(name = "Second Tag")
    @Tag(name = "Fourth Tag Full", description = "desc", externalDocs = @ExternalDocumentation(description = "docs desc"))
    public Response getTags() {
        return Response.ok().entity("ok").build();
    }
}