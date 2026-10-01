package com.example.demo.Repository;

import com.example.demo.Model.CampuesEvent;
import com.example.demo.Model.EventRegistration;
import com.example.demo.Model.TicketType;
import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRegistrationRepository extends JpaRepository<EventRegistration,Long> {

    List<CampuesEvent> findByCampusEvent_id(Long CampuesEvent);
    List<User> findByUser_id(String username);
    List<TicketType> findByTicketType_id(String name);



}
