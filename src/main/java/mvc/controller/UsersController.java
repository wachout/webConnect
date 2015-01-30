package mvc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import mvc.model.Users;
import mvc.service.IUsersService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("userController")
@RequestMapping("/users")
public class UsersController {
	@Resource(name="usersService") IUsersService usersService;
	@Resource(name="users") Users users;
	
	@RequestMapping("/{userId}/showUser")
	public String showUsers(@PathVariable String userId,HttpServletRequest request){
		mvc.model.Users users = usersService.getUsersById(Integer.valueOf(userId));
		request.setAttribute("users", users);
		return "showUser";
	}
	
	@RequestMapping("/json")  
	@ResponseBody  
	public Users json1() {  
		users.setAge("11");
		users.setEmail("xhwahah@qq.com");
	    users.setName("xionghao");
	    users.setPassword("123123");
	    users.setPhone("13434234343242");
	    users.setQq("3453534");
	    users.setSex("2");
	    users.setUserId(123123);
	    return users;  
	}  
}
