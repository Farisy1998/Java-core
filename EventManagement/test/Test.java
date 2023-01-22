package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;
import com.emc.manager.EventManager;
import com.emc.manager.EventManagerImpl;
import com.emc.manager.EventManagerImpl2;

public class Test {

	public static void main(String[] args) {
		Organizer organizer = new Organizer();
		organizer.setId(123L);
		organizer.setName("Apple Inc.");
		System.out.println(organizer);
		System.out.println(organizer.getName());
		
		Event event = new Event(456L, "iPhone xr Launch", "Grand Launch");
		System.out.println(event.getDescription());
		
		EventManager em = new EventManagerImpl2();
		System.out.println(em.create(12345L).getName());
	}

}
