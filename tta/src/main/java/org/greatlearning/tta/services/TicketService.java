package org.greatlearning.tta.services;

import java.util.List;

import org.greatlearning.tta.entities.Ticket;

public interface TicketService {
	Ticket insertTicket(Ticket ticket);
	void deleteTicketById(int id);
	List<Ticket> getAllTickets();
	Ticket getTicketById(int id);
	Ticket updateTicket(Ticket t);

}
