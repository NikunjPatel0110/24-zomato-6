package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="customers")
@Data //auto generated getters and setters 
@FieldDefaults(level = AccessLevel.PRIVATE) //for private fields 
public class CustomerEntity 
{
@Id //primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment 
Integer customerId;
String firstName;
String lastName;
String email;
String password;
String profilePicPath;
String otp;
String gender;
Integer bornYear;
String contactNum;
}
