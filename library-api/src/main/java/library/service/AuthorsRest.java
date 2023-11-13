package library.service;

import library.criteria.AuthorsCriteria;
import library.entity.AuthorsEntity;
import org.springframework.data.domain.Page;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/authors")
//@Consumes(MediaType.MULTIPART_FORM_DATA)
//@Produces(MediaType.APPLICATION_JSON)
public interface AuthorsRest {
    @GET
    @Path("/all")
    String get();
}
