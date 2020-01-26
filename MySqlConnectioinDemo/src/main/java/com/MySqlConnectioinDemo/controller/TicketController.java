package com.MySqlConnectioinDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MySqlConnectioinDemo.dao.TicketDao;
import com.MySqlConnectioinDemo.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	private TicketDao dao;
	
	@PostMapping("/bookTickets")
	public String bookTicket(@RequestBody List<Ticket> tickets) {
		dao.saveAll(tickets);
		
		return"Ticket booked: " + tickets.size();
	}
	
	@GetMapping("/getTickets")
	public List<Ticket> getTicket(){
		return (List<Ticket>)dao.findAll();
	}
	
}
