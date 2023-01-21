package org.greatlearning.tta;

import java.util.Date;

import org.greatlearning.tta.entities.Ticket;
import org.greatlearning.tta.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppRunner implements CommandLineRunner {
	private static final Date Date = null;
	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public void run(String... args) throws Exception {
		Ticket t1 = new Ticket();
		t1.setDate(Date);
		t1.setShortdescription("ticket to bombay");
		t1.setTitle("Sleeper");
		Ticket t2 = new Ticket();
		t2.setDate(Date);
		t2.setShortdescription("ticket to kerala");
		t2.setTitle("general");
		ticketRepository.save(t1);
		ticketRepository.save(t2);

	}

}