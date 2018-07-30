package com.wjh.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.wjh.service.IBlogService;
import com.wjh.service.IUserService;
import com.wjh.validator.UserGroup;

import xaut.wjh.entity.TBlog;
import xaut.wjh.entity.TUser;

@Controller
@RequestMapping("/")
@SessionAttributes("loginUser")//将model中的属性添加到域对象中
public class UserController {

	@Autowired
	private IUserService  userv;
	
	@Autowired
	private IBlogService blogSev;
	
	@Autowired
	private  HttpServletResponse response;
	@Autowired
	private HttpServletRequest request;

	//跳转到登录页面
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("user",new TUser());
		return "user/login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@ModelAttribute("user") TUser user, Errors errors, Model model) throws Exception {
		
		boolean bb = userv.login(user);
		if (bb) {
			model.addAttribute("loginUser", user);
			List<TBlog> blogList=blogSev.findBlogList(user.getId());
			model.addAttribute("blogLsit",blogList);
			return "blog/bloglist";//登录成功之后应该跳转到博客列表
		} else {
			model.addAttribute("msg", "登录失败！");
			return "user/login";
		}
	}
	
	@RequestMapping(value="regist",method=RequestMethod.GET)
	public String toRegist(Model model) {
		model.addAttribute("user",new TUser());
		return "user/regist";
	}
	
	@RequestMapping(value="regist",method=RequestMethod.POST)
	public String regist(@ModelAttribute("user")@Validated(UserGroup.class) TUser user,Errors errors,Model model) {
		if(errors.hasErrors()) {
			List<FieldError> errorList=errors.getFieldErrors();
			for(FieldError error:errorList) {
				System.out.println("error in regist:"+error.getRejectedValue().toString());
			}
		}
		
		return userv.regist(user) > 0 ? "user/login" : "user/regist" ;
	}
	@ResponseBody	//将函数返回值作为请求返回值，没有这个注解的话，请求的响应应该是一个页面，不需要页面的话应该加上这个注解。
	@RequestMapping(value="check",method=RequestMethod.POST)
	public void check(TUser user) throws IOException {
		System.out.println("check"+user);
		if(userv.ExistUser(user)) {
			response.getWriter().print("true");
		}
		else {
			response.getWriter().print("false");
		}
	}
	
	//showBlogList
	
}
