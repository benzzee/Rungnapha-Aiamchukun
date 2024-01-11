package nvc.it.benzzee.newton.repository;



import org.springframework.data.repository.CrudRepository;

import nvc.it.benzzee.newton.model.Event;

public interface EventRepository extends CrudRepository <Event, Integer> {
    
}
