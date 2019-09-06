package cn.chn.mybatis.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * MyBatis工具类
 * @author bachelor
 *
 */
public class MyBatisUtil {
	/**
	 * 创建SqlSessionFactory对象
	 * @return
	 * @throws IOException
	 */
	public static SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sessionFactory;
	}
	
	/**
	 * 
	 * @return SqlSession
	 * @throws IOException
	 */
	public static SqlSession getSession() throws IOException {
		SqlSessionFactory sessionFactory = getSqlSessionFactory();
		return sessionFactory.openSession();
	}
}
