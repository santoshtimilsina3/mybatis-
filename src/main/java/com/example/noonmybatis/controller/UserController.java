package com.example.noonmybatis.controller;

import com.example.noonmybatis.model.User;
import com.example.noonmybatis.service.UserService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/users")
public class UserController {

    private final UserService userService = new UserService();


//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
        return Response.ok(userService.getAllUsers()).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertUser(User user) {
        return Response.ok(userService.insertUser(user)).build();
    }

    @POST()
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateUser(User user) {
        userService.updateUser(user);
        return Response.ok("Successfully updated").build();
    }

    @DELETE
    @Path("/{userId}")
    public Response deleteUser(@PathParam("userId") Integer userId) {
        userService.deleteUser(userId);
        return Response.ok("User Deleted Successfully").build();
    }

    @GET
    @Path("/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserById(@PathParam("userId") Integer userId) {
        return Response.ok(userService.getUserById(userId)).build();
    }



}

