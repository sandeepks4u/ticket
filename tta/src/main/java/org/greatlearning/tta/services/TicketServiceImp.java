package org.greatlearning.tta.services;

import java.util.List;

import org.greatlearning.tta.entities.Ticket;
import org.greatlearning.tta.repositories.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImp implements TicketService {
	private TicketRepository ticketRepository;

	public TicketServiceImp(TicketRepository ticketRepository) {
		this.ticketRepository = ticketRepository;
	}

	@Override
	public Ticket insertTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	@Override
	public void deleteTicketById(int id) {
		ticketRepository.deleteById(id);

	}

	@Override
	public List<Ticket> getAllTickets() {
		return ticketRepository.findAll();
	}

	@Override
	public Ticket getTicketById(int id) {
		return ticketRepository.findById(id).get();
	}

	@Override
	public Ticket updateTicket(Ticket t) {
		return ticketRepository.save(t);
	}

}
