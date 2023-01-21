package org.greatlearning.tta.controllers;

import java.util.List;

import org.greatlearning.tta.entities.Ticket;
import org.greatlearning.tta.services.TicketService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TicketController {
	private TicketService ticketService;
	
	public TicketController(TicketService ticketService) {
				this.ticketService = ticketService;
	}
@GetMapping("/tickets")
	public String listTickets(Model model) {
		List<Ticket> tickets = ticketService.getAllTickets();
		model.addAttribute("tickets", tickets);
		return "tickets";
	}
}
