package user.service.face;

import user.dto.User;

public interface UserService {

	//신규 회원가입
	public boolean join(User user);

	public boolean login(User user);

	public User getLoginInfo(User user);


}
