package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Users;
import com.example.repo.UsersRepo;
import com.example.transport.Sync;

@Controller
@RequestMapping(path = "/demo")
public class MainController {
	@Autowired
	private UsersRepo usersRepo;

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Users> getAllUsers() {
		Sync sync = new Sync();
		sync.insert((List<Users>) usersRepo.findAll());
		return usersRepo.findAll();
	}
}