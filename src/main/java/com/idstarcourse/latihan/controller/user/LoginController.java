package com.idstarcourse.latihan.controller.user;


import com.idstarcourse.latihan.dao.request.LoginModel;
import com.idstarcourse.latihan.dao.request.RegisterModel;
import com.idstarcourse.latihan.model.oauth.User;
import com.idstarcourse.latihan.repository.oauth.UserRepository;
import com.idstarcourse.latihan.service.UserService;
import com.idstarcourse.latihan.util.SimpleStringUtils;
import com.idstarcourse.latihan.util.TemplateResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/user-login/")
@Slf4j
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @Autowired
    TemplateResponse templateResponse;

    @PostMapping("")
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Map> login(@Valid @RequestBody LoginModel loginModel) {
        User checkUser = userRepository.findOneByUsername(loginModel.getEmail());
        Map map = new HashMap();
        if(checkUser == null) {
            RegisterModel registerModel = new RegisterModel();
            registerModel.setEmail(loginModel.getEmail());
            registerModel.setPassword(loginModel.getPassword());
            registerModel.setConfirmPassword(loginModel.getPassword());
             map = userService.register(registerModel);

        } else {
            map = userService.login(loginModel);
        }

        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
