package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class UserResponse {

  private String userName;
  private String email;
  private String mobilenumber;
  private String role;
  private String password;
  private String confirm_password;
  private String message;
  private String status;
  private long patient_id;

  public static UserResponse getInstance() {
    return new UserResponse();
  }

  public long getPatient_id() {
    return patient_id;
  }

  public void setPatient_id(long patient_id) {
    this.patient_id = patient_id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getMobileNumber() {
    return mobilenumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobilenumber = mobileNumber;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getConfirm_password() {
    return confirm_password;
  }

  public void setConfirm_password(String confirm_password) {
    this.confirm_password = confirm_password;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
