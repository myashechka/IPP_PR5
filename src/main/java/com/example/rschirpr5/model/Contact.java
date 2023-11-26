package com.example.rschirpr5.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "phones")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    @Id
    private Integer id;
    private String name;
    private String phone;
}
