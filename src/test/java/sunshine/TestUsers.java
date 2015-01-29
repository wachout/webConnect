package sunshine;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import eagle.model.Users;
import eagle.service.IUsersService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestUsers {

	@Resource(name="usersService") IUsersService usersService;
	@Test
	public void test(){
		Users users = usersService.getUsersById(26);
		System.out.println(users.getName());
	}
}
