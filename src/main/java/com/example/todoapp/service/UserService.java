package com.example.todoapp.service;

import com.example.todoapp.dto.TaskDTO;
import com.example.todoapp.dto.UserDTO;
import com.example.todoapp.model.Task;
import com.example.todoapp.model.User;
import com.example.todoapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {


    User registerUser(UserDTO userDTO);

    String loginUser(String email, String password);

    Task createTask(TaskDTO taskDTO);

    Task updateTitleAndDescription(TaskDTO taskDTO , int id);

    Task markTaskCompleted(int id);

    List<Task> allTaskByUserId(int id);

    Task getTaskById(int id);

    List<Task> viewAllTasks();

    int updateTaskStatus(String status, int id);

    List<Task> viewAllTaskByStatus(String status);

    List<Task> findAllByUser_idAndStatus(int user_id , String status);
    boolean deleteById(int id);
    User getUserByEmail(String email);

}

