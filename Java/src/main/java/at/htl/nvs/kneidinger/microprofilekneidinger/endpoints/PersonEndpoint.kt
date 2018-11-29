package at.htl.nvs.kneidinger.microprofilekneidinger.endpoints

import at.htl.nvs.kneidinger.microprofilekneidinger.entity.Person
import at.htl.nvs.kneidinger.microprofilekneidinger.persistence.PersonRepository
import javax.enterprise.context.RequestScoped
import javax.inject.Inject
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/people")
@RequestScoped
open class PersonEndpoint {
    @Inject
    private var repository: PersonRepository? = null

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    open fun getAll() = Response.ok(repository?.getAll()).build()!!

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    open fun getById(@PathParam("id") id: Long) = Response.ok(repository?.getById(id)).build()!!

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    open fun create(person: Person) = Response.ok(repository?.create(person)).build()!!

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    open fun update(person: Person) = Response.ok(repository?.update(person)).build()!!

    @DELETE
    @Path("/{id}")
    open fun delete(@PathParam("id") id: Long) = Response.ok(repository?.delete(id)).build()!!

}