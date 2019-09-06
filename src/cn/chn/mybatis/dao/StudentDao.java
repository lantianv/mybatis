package cn.chn.mybatis.dao;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import cn.chn.mybatis.domain.Student;
import cn.chn.mybatis.util.MyBatisUtil;

public class StudentDao {
	public List<Student> getAll(Map<String, Object> map) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		List<Student> list = session.selectList("cn.chn.mybatis.domain.TeacherMapper.teacher", map);
		session.close();
		return list;
	}
}
