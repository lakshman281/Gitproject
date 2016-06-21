package restfuljersey;


import java.io.File;  

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;  
import javax.ws.rs.core.Response.ResponseBuilder;  
@Path("/files")  
public class download {  
    private static final String FILE_PATH = "D:\\web\\mm.png";  
    @GET  
    @Path("/txt")  
    @Produces(MediaType.TEXT_HTML)  
    public Response getFile() {  
        File file = new File(FILE_PATH);  
   
        ResponseBuilder response = Response.ok((Object) file);  
        response.header("Content-Disposition","attachment; filename=\"appleimage.png\"");  
        return response.build();  
   
    }  
 }  
