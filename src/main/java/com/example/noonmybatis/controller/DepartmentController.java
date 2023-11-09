package com.example.noonmybatis.controller;


import com.example.noonmybatis.service.DepartmentService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path(("/department"))
public class DepartmentController {
    private final DepartmentService departmentService =new DepartmentService();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllDepartment() {
        return Response.ok(departmentService.getAllDepartment()).build();
    }
}
