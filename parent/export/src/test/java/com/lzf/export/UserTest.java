package com.lzf.export;

import com.lzf.export.service.UserService;
import com.lzf.export.util.ExcelUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserService service;
    @Test
    public void test1(){
        List<String> list =service.getSubsIds();
        System.out.println(list.size());
        //ExcelUtil.writerToExcel(list);
    }
    @Test
    public void test2(){
        List<String> list = new ArrayList<String>();
        list.add("123");
        list.add("456");
        list.add("789");
        list.add("987");
        list.add("654");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String id = it.next();
            if(id.equalsIgnoreCase("123")){
                it.remove();
            }
        }
        for(String s:list){
            System.out.println(s);
        }
    }
}
