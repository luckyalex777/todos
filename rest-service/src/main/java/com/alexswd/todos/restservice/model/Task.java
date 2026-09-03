package com.alexswd.todos.restservice.model;

import java.util.Objects;

public class Task extends BaseEntity {

  private String title;
  private String description;
  private boolean routine;

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

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), title, description, routine);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Task)) {
      return false;
    }
    if (!super.equals(obj)) {
      return false;
    }
    Task other = (Task) obj;
    return routine == other.routine && Objects.equals(title, other.title)
        && Objects.equals(description, other.description);
  }
}
