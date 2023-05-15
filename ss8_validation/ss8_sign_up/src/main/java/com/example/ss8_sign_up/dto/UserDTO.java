package com.example.ss8_sign_up.dto;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.Period;

public class UserDTO implements Validator {
    @NotNull
    @NotBlank
    @Size(min = 5, max = 45)
    private String firstName;
    @NotNull
    @NotBlank
    @Size(min = 5, max = 45)
    private String lastName;
    @Pattern(regexp = "^0\\d{9}$", message = "enough 10 number, start number 0")
    private String phoneNumber;

    private String age;
    @Email
    private String email;

    public UserDTO() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDTO userDTO = (UserDTO) target;
        LocalDate dayOfBirth = LocalDate.parse(userDTO.age);
        LocalDate now = LocalDate.now();
        int age = Period.between(now, dayOfBirth).getYears();
        if (age < 18) {
            errors.rejectValue("age", "age", "age more 18 years old");
        }
    }
}
