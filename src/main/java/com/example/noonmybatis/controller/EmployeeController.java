package com.example.noonmybatis.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/employee")
public class EmployeeController {

    @GET
    public Response getAllEmployee(){

        return Response.ok().build();
    }
}
