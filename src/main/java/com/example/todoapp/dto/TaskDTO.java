package com.example.todoapp.dto;


import com.example.todoapp.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String title;

    private String description;

       @Column(columnDefinition = "varchar(255) default 'pending'")
        private String status;

        @CreationTimestamp
        private LocalDateTime createdAt;

        @UpdateTimestamp
        private  LocalDateTime updatedAt;

        @Column(nullable = true)
        private LocalDateTime completedAt;

        @ManyToOne
        @JoinColumn(name = "user_id" , referencedColumnName = "id")
        private int user_id;



}
