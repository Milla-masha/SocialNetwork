package sjc.app.web;

import sjc.app.repository.vo.RegisterUserVO;

import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;


public interface IUserEndPoint {

	//List<RegisterUserVO> getAllUser();
	Map getAllUser();

}
