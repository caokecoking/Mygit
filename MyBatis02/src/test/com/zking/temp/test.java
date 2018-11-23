package com.zking.temp;

import com.zking.mapper.IUserMapper;
import com.zking.pojo.user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    @Test
    public void FindOnly() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession session = sqlSessionFactory.openSession();
        IUserMapper ium = session.getMapper(IUserMapper.class);
        user u1 = new user();
        u1.setUname("?v");
        user u = ium.findOnly(u1);
        System.out.println(u.getUname());
        session.close();
    }

    @Test
    public void FindOnAll() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession session = sqlSessionFactory.openSession();
        IUserMapper ium = session.getMapper(IUserMapper.class);
        List<String> a = new ArrayList<>();
        a.add("23013fc5-bff4-11e8-b123-54e1ad4df251");
        a.add("21e69329-bff8-11e8-b123-54e1ad4df251");
        List<user> u = ium.findOnAll(a);
        for (user user : u) {
            System.out.println(user.getUname());
        }
        session.close();
    }

    @Test
    public void FindAll() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession session = sqlSessionFactory.openSession();
        IUserMapper ium = session.getMapper(IUserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("start", 1);
        map.put("end", 10);
        List<user> u = ium.findAll(map);
        for (user user : u) {
            System.out.println(user.getUname());
        }
        session.close();
    }

    @Test
    public void edit() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession session = sqlSessionFactory.openSession();
        IUserMapper ium = session.getMapper(IUserMapper.class);
        user u = new user();
        u.setUid("21e69329-bff8-11e8-b123-54e1ad4df251");
        u.setUname("ck");
        ium.edit(u);
        session.commit();
        session.close();
    }
}
