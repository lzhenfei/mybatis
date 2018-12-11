package com.lzf.export.dao;

import com.lzf.export.model.User;

import java.util.List;

public interface UserDao {

    List<Long> getSubsId();
    List<String> getSubsIdByAcctinfo();
    List<String> getSubsIdById(String id);
    List<String> getacctinfo2ById();
    int getCount();
    List<User> getUser(Integer startRow, Integer endRow);
}
