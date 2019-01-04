package org.springmvc.mapper;

import org.springframework.stereotype.Repository;
import org.springmvc.pojo.Role;

@Repository
public interface RoleMapper {
	public int insertRole (Role role);
	public Role getRole (Long id);
}
