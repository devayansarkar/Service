package com.service;

/**
 * Created by t997850 on 10/5/2016.
 */
import javax.ws.rs.*;
import javax.ws.rs.core.*;


@Path("/helloworld")
public class HelloWorld {

    @GET
    @Produces("text/plain")
        public String getClichedMessage() {
        return "Hello World";

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/create")
    public String create(Person input) {
        System.out.println("param1 = " + input.param1);
        System.out.println("param2 = " + input.param2);

        return "{'param1':'ghjg'}";
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Person track) {

        String result = "Track saved : " + track.param1;
        return Response.status(201).entity(result).build();

    }
    }





