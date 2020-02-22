package com.cy.service;

import com.cy.dao.ProDao;
import com.cy.pojo.TStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProServiceImpl implements ProService {

    @Autowired
    private ProDao proDao;

    @Override
    public TStudent getUser(int id) {
        TStudent user = proDao.getUser(id);
        return user;
    }
}
