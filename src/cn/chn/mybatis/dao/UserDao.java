package cn.chn.mybatis.dao;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import cn.chn.mybatis.domain.User;
import cn.chn.mybatis.util.MyBatisUtil;

public class UserDao {
	/**
	 * 按ID查询
	 * @param id
	 * @return
	 * @throws IOException
	 */
	public User getById(int id) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		User user = session.selectOne("cn.chn.mybatis.domain.UserMapper.selectOne", id);
		session.close();
		return user;
	}
	
	/**
	 * 查询所有
	 * @return
	 * @throws IOException
	 */
	public List<User> getAll(Map<String, Object> map) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		List<User> list = session.selectList("cn.chn.mybatis.domain.UserMapper.selectAll", map);
		session.close();
		return list;
	}
	
	/**
	 * 插入
	 * @param user
	 * @return
	 * @throws IOException
	 */
	public int insert(User user) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		int result = session.insert("cn.chn.mybatis.domain.UserMapper.insert", user);
		session.commit();
		session.close();
		return result;
	}
	
	/**
	 * 更新
	 * @param user
	 * @return
	 * @throws IOException
	 */
	public int update(User user) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		int result = session.update("cn.chn.mybatis.domain.UserMapper.update", user);
		session.commit();
		session.close();
		return result;
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 * @throws IOException
	 */
	public int delete(int id) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		int result = session.delete("cn.chn.mybatis.domain.UserMapper.delete", id);
		session.commit();
		session.close();
		return result;
	}
	/**
	 * 分页
	 * @return
	 * @throws IOException
	 */
	public List<User> getAllLimit(int currentPage, int pageSize) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("startIndex", (currentPage - 1) * pageSize);
//		map.put("pageSize", pageSize);
		RowBounds rowBounds = new RowBounds((currentPage - 1) * pageSize, pageSize);
		List<User> list = session.selectList("cn.chn.mybatis.domain.UserMapper.selectAllLimits", null, rowBounds);
		session.close();
		return list;
	}
}
