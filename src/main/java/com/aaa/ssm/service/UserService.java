package com.aaa.ssm.service;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.List;
import java.util.Map;

public interface UserService {

    /**
     * 获取人员列表
     * @return
     */
    List<Map> getUserList();
}
