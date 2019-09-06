package cn.chn.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.chn.mybatis.domain.User;

public interface IUserDao {
	@Select("select * from user")
	public List<User> getAll();
}
