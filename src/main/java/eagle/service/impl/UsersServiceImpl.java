package eagle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eagle.dao.UsersMapper;
import eagle.model.Users;
import eagle.service.IUsersService;

@Service("usersService")
public class UsersServiceImpl implements IUsersService {

	@Autowired
	private UsersMapper usersMapper;
	
	public UsersMapper getUsersMapper() {
		return usersMapper;
	}

	public void setUsersMapper(UsersMapper usersMapper) {
		this.usersMapper = usersMapper;
	}

	public Users getUsersById(Integer userId) {
		
		return usersMapper.selectByPrimaryKey(userId);
	}

}
