package com.example.demo.entity;

import jakarta.persistence.*;
    @Entity
    @Table(name = "Employees")

    public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id ;
        private String firstName;
        private String lastName;
        private String email;
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
        public void setfirstName(String firstName ){
            this.firstName = firstName;
        }

        public String getLastName (){
            return lastName ;
        }
        public void setlastName(String lastName){
            this.lastName = lastName;
        }

        public String getEmail(){
            return email;
        }
        public void setemail(String email){
            this.email = email;
        }

        public String getDepartment (){
            return department;
        }
        public void setdepartmanet(String department){
            this.department = department ;
        }

    }

