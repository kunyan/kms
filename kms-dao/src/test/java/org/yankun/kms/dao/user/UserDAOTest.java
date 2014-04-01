package org.yankun.kms.dao.user;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.yankun.kms.entity.user.User;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDAOTest {
	/**
	 * Logger
	 */
	private final Logger logger = LoggerFactory.getLogger(UserDAOTest.class);
	/**
	 * User DAO
	 */
	@Autowired
	private UserMapper mapper;
	@Test
	public void testGet() {
		User user = mapper.select(1);
		System.err.println(user.getEmail());
	}

	@Test
	public void testAdd() {
		String username = "tomcy";
		String name = "Tom Herry";
		String email = "tom@tom.com";
		String password = "tompassword";
		
		User user = new User();
		user.setUsername(username);
		user.setName(name);
		user.setPassword(password);
		user.setEmail(email);
		
		long id = mapper.insert(user);
		User u = mapper.select(id);
		Assert.assertEquals(id, u.getId());
		Assert.assertEquals(username, u.getUsername());
		Assert.assertEquals(name, u.getName());
		Assert.assertEquals(password, u.getPassword());
		Assert.assertEquals(email, u.getEmail());
		logger.info(String.valueOf(u.getCreateTime()));
		logger.info(String.valueOf(u.getUpdateTime()));
	}

	@Test
	public void testUpdate() {
		String username = "tomcy";
		String name = "Tom Herry";
		String email = "tom@tom.com";
		String password = "tompassword";
		
		User user = new User();
		user.setUsername(username);
		user.setName(name);
		user.setPassword(password);
		user.setEmail(email);
		mapper.update(user);
	}

	@Test
	public void testDelete() {
		mapper.delete(1);
	}

}
