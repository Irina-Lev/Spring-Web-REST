package example.three.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import example.three.User;

public class UserDto {

    @JsonProperty("id")
    private  long id;
    @JsonProperty("name")
    private   String name;
    @JsonProperty("surname")
    private  String surname;
    @JsonProperty("phoneNumber")
    private   String phoneNumber;
    @JsonProperty("email")
    private   String email;



    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.surname = user.getSurname();
        this.phoneNumber = user.getPhoneNumber();
        this.email = user.getEmail();
    }

    public long getId() {
        return id;
    }



    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public String getEmail() {
        return email;
    }

}
