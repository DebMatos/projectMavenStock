package io.altar.stock.stock;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import io.altar.stock.model.Product;
import io.altar.stock.service.ProductControler;

@Path("/product")
public class EndPoints {

	
	@Context
	private UriInfo context;
	
	@GET
	@Path("/health")
	@Produces(MediaType.TEXT_PLAIN)
	public String healthCheck() {
	    return "URI " + context.getRequestUri().toString() + " is OK!";
	}
	
	

		


			// menu criar produto	
			@POST
			
			@Consumes(MediaType.APPLICATION_JSON)
			@Produces(MediaType.APPLICATION_JSON)
			public Product newProduct(Product product1) {
				ProductControler.createProduct(product1);
				return product1;
			}


//			// editar produto	
//			@PUT
//			@Path ("/editar/{id}")
//			@Consumes(MediaType.APPLICATION_JSON)
//			@Produces(MediaType.APPLICATION_JSON)
//			public Product editProduct(@PathParam("id") long id, Product product1) {
//				//product1= ProductBusiness.editProduct(id);
//				ProductBusiness.editProduct(product1);
//				return product1;
//			}
//
//
//			//consultar produto
////			@GET
////			@Path("/consultar/{id}")
////			@Produces(MediaType.APPLICATION_JSON)
////			public Product consultProduct(@PathParam("id") long id, Product product1) {
////				product1 = ProductBusiness.consultByIdProduct(id);
////				return product1;
//	//
////			}
//			
//			//remover produto
//			@DELETE
//			@Path("/remove/{id}")
//			@Produces(MediaType.APPLICATION_JSON)	
//			public Response removerProduct(@PathParam("id") long id, Product product1) {
//				ProductBusiness.removeProduct(id);
//				return Response.status(200).build();
//			}
//	
//	
}