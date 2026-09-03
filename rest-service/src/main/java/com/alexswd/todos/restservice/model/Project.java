package com.alexswd.todos.restservice.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Project extends BaseEntity {

  private String title;
  private String description;
  private boolean routine;
  private List<Task> tasks = new ArrayList<>();
  private List<Project> projects = new ArrayList<>();

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isRoutine() {
    return routine;
  }

  public void setRoutine(boolean routine) {
    this.routine = routine;
  }

  public List<Task> getTasks() {
    return Collections.unmodifiableList(tasks);
  }

  public void setTasks(List<Task> tasks) {
    this.tasks = tasks == null ? new ArrayList<>() : new ArrayList<>(tasks);
  }

  public List<Project> getProjects() {
    return Collections.unmodifiableList(projects);
  }

  public void setProjects(List<Project> projects) {
    this.projects = projects == null ? new ArrayList<>() : new ArrayList<>(projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), title, description, routine, tasks, projects);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Project)) {
      return false;
    }
    if (!super.equals(obj)) {
      return false;
    }
    Project other = (Project) obj;
    return routine == other.routine && Objects.equals(title, other.title)
        && Objects.equals(description, other.description) && Objects.equals(tasks, other.tasks)
        && Objects.equals(projects, other.projects);
  }
}
