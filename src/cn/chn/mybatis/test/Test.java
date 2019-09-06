package cn.chn.mybatis.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.chn.mybatis.dao.UserDao;
import cn.chn.mybatis.domain.User;

public class Test {
	public static void main(String[] args) throws IOException {
//		UserDao userDao = new UserDao();
//		User user = userDao.getById(4);
//		System.out.println(user);
		
		UserDao userDao = new UserDao();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "lin");
		List<User> list = userDao.getAll(map);
		for (User user : list) {
			System.out.println(user);
		}
		
//		UserDao userDao = new UserDao();
//		User user = new User();
//		user.setId(6);
//		user.setName("chenlins");
//		user.setPwd("123658");
//		int result = userDao.insert(user);
//		System.out.println(result);
		
//		UserDao userDao = new UserDao();
//		User user = new User();
//		user.setId(5);
//		user.setName("chen");
//		user.setPwd("22585");
//		int result = userDao.update(user);
//		System.out.println(result);
		
//		UserDao userDao = new UserDao();
//		int result = userDao.delete(5);
//		System.out.println(result);
		
//		UserDao userDao = new UserDao();
//		List<User> list = userDao.getAllLimit(2, 2);
//		for (User user : list) {
//			System.out.println(user);
//		}
		
//		SqlSession session = MyBatisUtil.getSession();
//		IUserDao iUserDao = session.getMapper(IUserDao.class);
//		List<User> list = iUserDao.getAll();
//		for (User user : list) {
//			System.out.println(user);
//		}
		
//		StudentDao studentDao = new StudentDao();
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("sname", "аж");
//		List<Student> list = studentDao.getAll(map);
//		for (Student student : list) {
//			System.out.println("student:" + student.getSid() + ",name:" + student.getSname() + ",teacher:" + student.getTeacher().getTname());
//		}
		
	}
}
