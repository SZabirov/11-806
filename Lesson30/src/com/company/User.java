package com.company;

public class User {
    private Long id;
    private String firstname;
    private String secondname;
    private String address;
    private String phoneNumber;
    
    private User(Builder b) {
        this.id = b.id;
        this.firstname = b.firstname;
        this.secondname = b.secondname;
        this.address = b.address;
        this.phoneNumber = b.phoneNumber;
    }
    
    public static Builder builder() {
        return new Builder();
    }
    
    public static class Builder {
        private Long id;
        private String firstname;
        private String secondname;
        private String address;
        private String phoneNumber;
        
        public Builder id(Long id) {
            this.id = id;
            return this;
        }
        
        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder secondname(String secondname) {
            this.secondname = secondname;
            return this;
        }
        
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        
        public User build() {
            User newUser = new User(this);
            return newUser;
        }
    }
    
    
    
    
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
