package com.offcn.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.offcn.bean.User;


public interface UserService {

	@GET
	@Path("/get/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public User get(@PathParam("id") String id);
	
	
	
	
	@PUT
	@Path("/put/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public User put(@PathParam("id") String id ,User u);
	
	
	@POST
	@Path("/post/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public User post(@PathParam("id") String id,User u);
	
	
	@DELETE
	@Path("/delete/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public User delete(@PathParam("id") String id ,User u);
}
