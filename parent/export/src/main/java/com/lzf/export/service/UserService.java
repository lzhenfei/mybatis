package com.lzf.export.service;

import com.lzf.export.dao.UserDao;
import com.lzf.export.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserDao dao;
    public List<String> getSubsIds(){
        //List<Long> subsId = dao.getSubsId();
        User user = new User();
        List<String> acctIds = dao.getSubsIdByAcctinfo();
        //List<String> subsId = dao.getacctinfo2ById();
        Iterator<String> it = acctIds.iterator();
//        while (it.hasNext()){
//            String id = it.next();
//            List<String> acctid = dao.getSubsIdById(id);
//            if(!CollectionUtils.isEmpty(acctid)){
//                it.remove();
//            }
//        }

        //List<Long> list = new ArrayList<Long>();
        //acctIds.removeAll(subsId);
        //List<Long> lists = acctIds.remove(subsId);
        return acctIds;
    }
}
