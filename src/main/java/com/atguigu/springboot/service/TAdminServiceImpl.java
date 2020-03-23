package com.atguigu.springboot.service;

import com.atguigu.springboot.bean.TAdmin;
import com.atguigu.springboot.mapper.TAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TAdminServiceImpl implements TAdminService {

    @Autowired
    private TAdminMapper adminMapper;
    @Override
    public TAdmin getAdminById(Integer id) {
        return adminMapper.getAdminById(id);
    }
}
