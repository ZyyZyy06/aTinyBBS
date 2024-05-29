
package com.my.bbs.service;

import com.my.bbs.entity.BBSUser;
import jakarta.servlet.http.HttpSession;


import java.util.List;

public interface BBSUserService {


    String register(String loginName, String password, String nickName);


    String login(String loginName, String passwordMD5, HttpSession httpSession);


    Boolean updateUserInfo(BBSUser bbsUser, HttpSession httpSession);

    Boolean updateUserHeadImg(BBSUser bbsUser, HttpSession httpSession);


    BBSUser getUserById(Long userId);


    Boolean updatePassword(Long userId, String originalPassword, String newPassword);
}
