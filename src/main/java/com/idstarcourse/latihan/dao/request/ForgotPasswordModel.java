package com.idstarcourse.latihan.dao.request;

import lombok.Data;

@Data
public class ForgotPasswordModel {
    private String email;
    private String otp;
    private String newPassword;
    private String confirmNewPassword;
}
