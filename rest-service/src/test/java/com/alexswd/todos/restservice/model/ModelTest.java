package com.alexswd.todos.restservice.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

class ModelTest {

  @Test
  void shouldCreateTodoDomainModel() {
    OffsetDateTime now = OffsetDateTime.now();

    User user = new User();
    user.setId(1L);
    user.setName("Alice");
    user.setLoginName("alice");
    user.setPassword("secret");
    user.setCreatedBy("system");
    user.setCreatedWhen(now);
    user.setUpdatedBy("system");
    user.setUpdatedWhen(now);

    Task task = new Task();
    task.setId(10L);
    task.setTitle("Write API");
    task.setDescription("Create the REST endpoints");
    task.setRoutine(true);
    task.setCreatedBy("alice");
    task.setCreatedWhen(now);
    task.setUpdatedBy("alice");
    task.setUpdatedWhen(now);

    Project project = new Project();
    project.setId(100L);
    project.setTitle("Todos");
    project.setDescription("Project tracker");
    project.setRoutine(true);
    project.setTasks(List.of(task));
    project.setProjects(List.of());
    project.setCreatedBy("alice");
    project.setCreatedWhen(now);
    project.setUpdatedBy("alice");
    project.setUpdatedWhen(now);

    Notification notification = new Notification();
    notification.setId(1000L);
    notification.setTitle("Daily reminder");
    notification.setDate(LocalDate.now());
    notification.setTime(LocalTime.of(9, 0));
    notification.setDescription("Check the project board");
    notification.setCreatedBy("alice");
    notification.setCreatedWhen(now);
    notification.setUpdatedBy("alice");
    notification.setUpdatedWhen(now);

    assertEquals("Alice", user.getName());
    assertEquals("alice", user.getLoginName());
    assertEquals("secret", user.getPassword());
    assertEquals("Write API", task.getTitle());
    assertTrue(task.isRoutine());
    assertEquals("Todos", project.getTitle());
    assertEquals("Daily reminder", notification.getTitle());
    assertEquals(LocalTime.of(9, 0), notification.getTime());
  }
}
