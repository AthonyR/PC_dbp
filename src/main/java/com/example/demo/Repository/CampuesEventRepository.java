package com.example.demo.Repository;

import com.example.demo.Model.CampuesEvent;
import com.example.demo.Model.EventRegistration;
import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CampuesEventRepository extends JpaRepository<CampuesEvent,Long> {
    boolean findByTitle(String title);
    List<User> findByUsername_id(Long username);

}
