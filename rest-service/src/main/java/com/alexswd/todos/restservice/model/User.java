package com.alexswd.todos.restservice.model;

import java.util.Objects;

public class User extends BaseEntity {

  private String name;
  private String loginName;
  private String password;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), name, loginName, password);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof User)) {
      return false;
    }
    if (!super.equals(obj)) {
      return false;
    }
    User other = (User) obj;
    return Objects.equals(name, other.name) && Objects.equals(loginName, other.loginName)
        && Objects.equals(password, other.password);
  }
}
