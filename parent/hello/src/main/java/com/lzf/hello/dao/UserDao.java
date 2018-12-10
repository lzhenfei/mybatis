package com.lzf.hello.dao;

import java.util.List;

public interface UserDao {

    List<Long> getSubsId();
    List<String> getSubsIdByAcctinfo();
    List<String> getSubsIdById(String id);
    List<String> getacctinfo2ById();
}
