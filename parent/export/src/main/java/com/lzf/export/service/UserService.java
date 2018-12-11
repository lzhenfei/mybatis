package com.lzf.export.service;

import com.lzf.export.dao.UserDao;
import com.lzf.export.model.User;
import com.lzf.export.util.ExportInterface;
import com.lzf.export.util.ExportTask;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserDao dao;
    public List<String> getSubsIds(){
        User user = new User();
        List<String> acctIds = dao.getSubsIdByAcctinfo();
        Iterator<String> it = acctIds.iterator();
        return acctIds;
    }
    public void exportInfo() throws IllegalAccessException {

        int count = dao.getCount();
        if(count>0){
            ExportInterface exportInterface = new ExportInterface<User>() {

                @Override
                public List<User> queryList(Integer startRow, Integer endRow) {
                    List<User> lists = dao.getUser(startRow,endRow);
                    return lists;
                }
            };
            ExportTask task = new ExportTask(count,exportInterface,User.class);
            task.execute();
        }
    }
}
