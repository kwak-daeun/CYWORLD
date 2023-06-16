package user.dao.face;

import user.dto.User;

public interface UserDao {
	
	public void insert(User user);

	public int selectIdCheck(User user);

	public int selectCount(User user);
	
	public User seletLoginInfo(User user);



}
