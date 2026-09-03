package com.alexswd.todos.restservice.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Notification extends BaseEntity {

  private String title;
  private LocalDate date;
  private LocalTime time;
  private String description;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public LocalTime getTime() {
    return time;
  }

  public void setTime(LocalTime time) {
    this.time = time;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), title, date, time, description);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Notification)) {
      return false;
    }
    if (!super.equals(obj)) {
      return false;
    }
    Notification other = (Notification) obj;
    return Objects.equals(title, other.title) && Objects.equals(date, other.date)
        && Objects.equals(time, other.time) && Objects.equals(description, other.description);
  }
}
