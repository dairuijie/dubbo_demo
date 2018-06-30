package com.dairuijie.mgr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dairuijie.mgr.dao.UsersMapper;
import com.dairuijie.mgr.pojo.Users;
import com.dairuijie.mgr.service.UserMgrService;

@Service
public class UserMgrServiceImpl implements UserMgrService {
	@Autowired
	private UsersMapper mUserMapper;

	@Override
	public int insert(Users record) {
		int row = 0;
		if (record != null) {
			row = mUserMapper.insertSelective(record);
		}
		return row;
	}

	@Override
	public int update(Users record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Users queryById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> selectByPage(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countByPage(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}

}
