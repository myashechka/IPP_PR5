package com.example.rschirpr5.controller;

import com.example.rschirpr5.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.rschirpr5.model.Contact;
import java.util.List;

@RestController
@RequestMapping("contact")
@RequiredArgsConstructor
public class ContactController {
    private final ContactRepository contactRepository;

    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    @GetMapping
    public Contact getContact(@RequestParam Integer id) {
        return contactRepository.findById(id).orElseThrow();
    }

    @GetMapping("all")
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @PatchMapping
    public Contact changeContact(@RequestBody Contact contact) {
        contactRepository.findById(contact.getId()).orElseThrow();

        return contactRepository.save(contact);
    }

    @DeleteMapping
    public Contact deleteContact(@RequestParam Integer id) {
        Contact contact = contactRepository.findById(id).orElseThrow();

        contactRepository.deleteById(id);

        return contact;
    }
}
