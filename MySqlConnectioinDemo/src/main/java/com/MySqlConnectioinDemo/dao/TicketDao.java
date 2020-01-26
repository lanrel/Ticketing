package com.MySqlConnectioinDemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.MySqlConnectioinDemo.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
