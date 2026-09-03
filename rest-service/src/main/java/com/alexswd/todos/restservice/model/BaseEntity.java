package com.alexswd.todos.restservice.model;

import java.time.OffsetDateTime;
import java.util.Objects;

public abstract class BaseEntity {

  private Long id;
  private String createdBy;
  private OffsetDateTime createdWhen;
  private String updatedBy;
  private OffsetDateTime updatedWhen;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public OffsetDateTime getCreatedWhen() {
    return createdWhen;
  }

  public void setCreatedWhen(OffsetDateTime createdWhen) {
    this.createdWhen = createdWhen;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public OffsetDateTime getUpdatedWhen() {
    return updatedWhen;
  }

  public void setUpdatedWhen(OffsetDateTime updatedWhen) {
    this.updatedWhen = updatedWhen;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdBy, createdWhen, updatedBy, updatedWhen);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof BaseEntity)) {
      return false;
    }
    BaseEntity other = (BaseEntity) obj;
    return Objects.equals(id, other.id) && Objects.equals(createdBy, other.createdBy)
        && Objects.equals(createdWhen, other.createdWhen)
        && Objects.equals(updatedBy, other.updatedBy)
        && Objects.equals(updatedWhen, other.updatedWhen);
  }
}
