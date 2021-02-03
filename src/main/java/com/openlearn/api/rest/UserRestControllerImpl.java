package com.openlearn.api.rest;

import com.openlearn.api.dao.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import java.util.Optional;

@Service
@Path("/api/user")
public class UserRestControllerImpl implements UserRestController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserControllerImpl userControllerImpl;

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Optional<User> getUser(@PathParam("id") Long id) {
        return this.userControllerImpl.getUser(id);
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public User saveUser(User user) {
        return this.userControllerImpl.saveUser(user);
    }

    @POST
    @Path("/login")
    @Override
    public Object login(String username, String password) {
        // Authenticate

        // Generate token

        // Return token

        return null;
    }
}
