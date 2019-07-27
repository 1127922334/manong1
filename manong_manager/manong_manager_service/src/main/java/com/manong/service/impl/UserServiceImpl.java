package com.manong.service.impl;

import com.manong.mapper.UserSMapper;
import com.manong.pojo.UserS;
import com.manong.pojo.UserSExample;
import com.manong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserSMapper userMapper;

    @Override
        public UserS getUserById(Integer id) {
        UserSExample usersExample = new UserSExample();
        UserSExample.Criteria criteria = usersExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<UserS> userList = userMapper.selectByExample(usersExample);
        if (userList!=null){
            return userList.get(0);
        }
        else return null;
    }
}
