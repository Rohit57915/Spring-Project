package org.jsp.autowired_proj;

import org.springframework.stereotype.Component;

@Component
public class Ticket {

	public void ticketBooked() {
		System.out.println("Ticket Configured");
	}
}
