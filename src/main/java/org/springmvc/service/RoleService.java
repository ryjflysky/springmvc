package org.springmvc.service;

import org.springmvc.pojo.Role;

public interface RoleService {
	public int insertRole (Role role);
	public Role getRole (Long id);
}
