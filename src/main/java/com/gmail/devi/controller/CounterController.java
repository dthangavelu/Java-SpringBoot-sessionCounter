package com.gmail.devi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	
	@Autowired
	private HttpSession session;
	private int myCounter;
	
	public CounterController() {
		myCounter = 0;
	}
	
	private int getMyCounter() {
		return myCounter;
	}

	private void setMyCounter(int myCounter) {
		this.myCounter += myCounter;
	}

	@RequestMapping("/")
	public String index() {	
		setMyCounter(1);		
		session.setAttribute("counter", getMyCounter());
		return "index";
	}
	
	@RequestMapping("/counter")
	public String counter() {
		return "counter";
	}
	
	@RequestMapping("/clear")
	public String clear() {
		this.myCounter = 0;
		session.setAttribute("counter", myCounter);
		return "redirect:/";		
	}

}
