package visitor.controller;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import visitor.request.SmsRequest;
import visitor.service.SmsService;


@Service
@Path("/sms")
public class SmsController {

    @Autowired
    private SmsService service;

    @POST
    @Path("/send/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response sendSMS(SmsRequest smsRequest) {
        service.sendSms(smsRequest);
        return Response.ok().build();
    }

    @GET
    @Path("/ping")
    public Response ping() {
        return Response.ok().entity("Service online").build();
    }

}