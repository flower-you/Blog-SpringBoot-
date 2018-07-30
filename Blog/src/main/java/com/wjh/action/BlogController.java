package com.wjh.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wjh.service.IBlogService;

import xaut.wjh.entity.TBlog;
import xaut.wjh.entity.TUser;

@Controller
public class BlogController {
	@Autowired
	private IBlogService blogSev;
//	@RequestMapping(value = "login", method = RequestMethod.POST)
//	public String login(@ModelAttribute("user") TUser user, Errors errors, Model model) throws Exception {
	
	@RequestMapping(value="showBlogList",method=RequestMethod.GET)
	public String showBlogList(int uid,Model model) {
		List<TBlog> blogList=blogSev.findBlogList(uid);
		model.addAttribute("blogLsit",blogList);
		return "blog/bloglist";
	}
}
