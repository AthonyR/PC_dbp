package com.example.demo.Repository;

import com.example.demo.Model.CampuesEvent;
import com.example.demo.Model.TicketType;
import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketTypeRepository extends JpaRepository<TicketType,Long> {

    List<CampuesEvent> findByCampusEvent_id(Long CampuesEvent);






}
