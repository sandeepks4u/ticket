package org.greatlearning.tta.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ListofTickets")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "ticketTitle", nullable = false)
	private String title;
	@Column(name = "ticketShortDescription")
	private String shortdescription;
	@Column(name = "ticketCreatedon")
	private Date date;

	public Ticket() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortdescription() {
		return shortdescription;
	}

	public void setShortdescription(String shortdescription) {
		this.shortdescription = shortdescription;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Ticket(int id, String title, String shortdescription, Date date) {
		super();
		this.id = id;
		this.title = title;
		this.shortdescription = shortdescription;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", title=" + title + ", shortdescription=" + shortdescription + ", date=" + date
				+ "]";
	}
}
