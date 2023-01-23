package manager;

import entities.Event;

public class EventManagerImpl2 implements EventManager {

	@Override
	public Event create(Long id) {
		return new Event(id, "Mack Book Launch", "New generation of Mac Books");
	}

}
