package manager;

import entities.Event;

public class EventManagerImpl implements EventManager {

	@Override
	public Event create(Long id){
		Event event = new Event(id, null, null);
		return event;
	}
}
