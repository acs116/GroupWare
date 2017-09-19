package com.sangehon.groupware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sangheon.security.Auth;

@Auth
@Controller
@RequestMapping( "/board" )
public class BoardController {
	
	@RequestMapping( "")
	public String board() {
		return "board/index";
	}
	

	@RequestMapping( "/write")
	public String write() {
		return "board/write";
	}
	
	
}
