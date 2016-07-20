package sjc.app.web.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import sjc.app.repository.vo.RegisterUserVO;
import sjc.app.service.UserService;
import sjc.app.web.IUserEndPoint;
import sjc.app.web.response.ResponseCreator;

import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/main")
public class UserEndPointImpl implements IUserEndPoint {

	@Autowired
	private UserService userService;

	@Override
    @ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/list", method = RequestMethod.GET, headers = "Accept=application/json", produces = {"application/json"})
	@ResponseBody
	public Map getAllUser() {
		List<RegisterUserVO> registerUsers = userService.getAllUsers();
		if(registerUsers!=null)
			 emptyEntity();
		return ResponseCreator.success("users", registerUsers);
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	public Response emptyEntity() {
		List<RegisterUserVO> registerUsers = userService.getAllUsers();
		return ResponseCreator.error(HttpStatus.NO_CONTENT.value(),"sorry");
	}

}

