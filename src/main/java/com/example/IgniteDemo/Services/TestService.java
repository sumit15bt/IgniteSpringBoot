package com.example.IgniteDemo.Services;

import com.example.IgniteDemo.Dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;
    public List<Map<String, Object>> getUsers(){
        return testDao.getUsers();
    }
}
