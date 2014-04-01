package org.yankun.kms.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.yankun.kms.entity.user.User;

@Repository
public interface UserMapper {

	User select(long id);
	long insert(User user);
	User update(User user);
	void delete(long id);
	List<User> selectAll();
}
