package org.greatlearning.tta.repositories;

import org.greatlearning.tta.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{

}
