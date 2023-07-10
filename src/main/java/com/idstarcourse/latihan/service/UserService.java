package com.idstarcourse.latihan.service;



import com.idstarcourse.latihan.dao.request.LoginModel;
import com.idstarcourse.latihan.dao.request.RegisterModel;

import java.util.Map;


public interface UserService {


    Map register(RegisterModel registerModel);

    Map login(LoginModel loginModel);




}
