package org.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springmvc.mapper.RoleMapper;
import org.springmvc.pojo.Role;
import org.springmvc.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper rm = null;
	
	@Override
	public int insertRole(Role role) {
		return rm.insertRole(role);
	}

	@Override
	public Role getRole(Long id) {
		return rm.getRole(id);
	}
	
}
