package org.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springmvc.pojo.Role;
import org.springmvc.pojo.RoleParam;
import org.springmvc.service.impl.RoleServiceImpl;

@Controller
public class MvcController {
	
	@Autowired
	private RoleServiceImpl rsi = null;
	
	@RequestMapping(value="/role")
	public ModelAndView hello(@RequestParam(name="id", required=false) Long id) {
		ModelAndView mv = new ModelAndView();
		Role role = rsi.getRole(id);
		if (null == role) {
			mv.addObject("message", "查询信息为空");
		} else {
			mv.addObject("message", "查询信息成功");
		}
		mv.addObject("role", role);
		mv.setViewName("roleMessage");
		return mv;
	}
	
	@RequestMapping(value="/role/{id}")
	public ModelAndView hello1(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView();
		System.out.println("ID=" + id);
		Role role = rsi.getRole(id);
		if (null == role) {
			mv.addObject("message", "查询信息为空");
		} else {
			mv.addObject("message", "查询信息成功");
		}
		mv.addObject("role", role);
		mv.setViewName("roleMessage");
		return mv;
	}
	
	@RequestMapping(value="/findRoles")
	public ModelAndView hello2(@RequestBody RoleParam roleParam) {
		ModelAndView mv = new ModelAndView();
		System.out.println("findRoles:" + roleParam.toString());
		mv.addObject("roleParam", roleParam);
		mv.setViewName("roleParam");
		return mv;
	}
	
	@RequestMapping(value="/addRole")
	public String hello3(RedirectAttributes ra) {
		Role role = new Role();
		role.setId(990L);
		role.setNote("NOTE 999");
		role.setRoleName("ROLENAME 999");
		ra.addFlashAttribute(role);
		return "redirect:./showRole.do";
	}
	
	@RequestMapping(value="/showRole")
	public ModelAndView hello4(Role role) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("role", role);
		mv.setViewName("showRole");
		return mv;
	}
	
	@RequestMapping(value="/getRole")
	public ModelAndView hello5(@RequestAttribute("id") Long id, @RequestAttribute("roleName") String roleName) {
		ModelAndView mv = new ModelAndView();
		Role role = rsi.getRole(id);
		System.out.println("RoleName:" + roleName);
		if (null == role) {
			mv.addObject("message", "查询信息为空");
		} else {
			mv.addObject("message", "查询信息成功");
		}
		mv.addObject("role", role);
		mv.setViewName("roleMessage");
		return mv;
	}
}
