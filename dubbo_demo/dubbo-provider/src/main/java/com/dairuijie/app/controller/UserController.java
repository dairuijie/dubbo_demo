package com.dairuijie.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dairuijie.app.api.pojo.Users;
import com.dairuijie.app.rpc.service.IUserService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService mUserService;

	@RequestMapping("addUser")
	@ResponseBody
	public String addUser(Users user) {
		int row = mUserService.insert(user);
		System.out.println(row);
		JSONObject result = new JSONObject();
		result.put("success", true);
		return result.toString();
	}
}
