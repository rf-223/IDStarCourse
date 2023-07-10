package com.idstarcourse.latihan.dao.request;


import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RegisterModel {
    public Long id;

    private String email;

    //    @ValidPassword
    @Size(min = 6, message = "Minimal 6 karakter")
    @NotNull(message =  "Password is mandatory")
    public String password;

//    @ValidPassword
    @Size(min = 6, message = "Minimal 6 karakter")
    @NotNull(message =  "Password is mandatory")
    private String confirmPassword;

    private String fullname;

}
