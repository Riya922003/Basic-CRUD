package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
    @Table(name = "Employees")

    public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id ;
    @NotBlank(message = "First name is required")
        private String firstName;
    @NotBlank(message = "Last name is required")
        private String lastName;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
        private String email;
    @NotBlank(message = "Department is required")
        private String department;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFirstName (){
            return firstName;
        }
        public void setFirstName(String firstName ){
            this.firstName = firstName;
        }

        public String getLastName (){
            return lastName ;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email = email;
        }

        public String getDepartment (){
            return department;
        }
        public void setDepartment(String department){
            this.department = department ;
        }

    }

