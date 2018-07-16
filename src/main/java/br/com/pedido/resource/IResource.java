package br.com.pedido.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Consumes({ "application/json" })
@Produces({ "application/json" })
public interface IResource<T> {

    @GET
    public Response findAll();

    @POST
    public Response insert(T obj, @Context UriInfo uriInfo);

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") Integer id);

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Integer id, T obj);

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Integer id);
}
