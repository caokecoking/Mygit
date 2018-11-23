package com.zking.mapper;

import com.zking.pojo.user;

import java.util.List;
import java.util.Map;

public interface IUserMapper {
    public user findOnly(user name);

    public List<user> findAll(Map<String,Object> map);

    public List<user> findOnAll(List<String> list);

    public void edit(user u);
}
