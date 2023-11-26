package com.example.rschirpr5.repository;

import com.example.rschirpr5.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}