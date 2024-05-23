/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2021 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package com.my.bbs.service;

import com.my.bbs.entity.BBSUser;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface BBSUserService {


    String register(String loginName, String password, String nickName);


    String login(String loginName, String passwordMD5, HttpSession httpSession);


    Boolean updateUserInfo(BBSUser bbsUser, HttpSession httpSession);

    Boolean updateUserHeadImg(BBSUser bbsUser, HttpSession httpSession);


    BBSUser getUserById(Long userId);


    Boolean updatePassword(Long userId, String originalPassword, String newPassword);
}
