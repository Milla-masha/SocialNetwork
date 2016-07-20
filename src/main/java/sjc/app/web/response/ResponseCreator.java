package sjc.app.web.response;

import org.apache.commons.collections.map.HashedMap;

import javax.ws.rs.core.Response;
import java.util.Map;

public class ResponseCreator {

    public static Response error(int status,  String version) {
        Response.ResponseBuilder response = Response.status(status);
        response.header("version", version);
        return response.build();
    }

    public static Map success(String version, Object object) {
        Map<String,Object> map=new HashedMap();
        map.put(version,object);
        return map;
    }
}