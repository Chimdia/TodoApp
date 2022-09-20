package com.example.todoapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Users ")

@Controller
//@RequiredArgsConstructor
@RequestMapping(value = "/user")
public class User {
@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
 private int id;

 private String name;

 @Column(unique = true)
 private String email;


 private String password;


 @OneToMany(mappedBy = "user")
 private List<Task> tasks;
}
