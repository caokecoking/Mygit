package com.zking.temp;

import com.zking.pojo.t_user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;
import java.util.UUID;

public class Mybatis01Temp {
    //查询所有
    @Test
    public void findAll() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<t_user> la = sqlSession.selectList("findAll");
        for (t_user t : la) {
            System.out.println(t.getUser_id() + "...." + t.getUser_name() + "...." + t.getUser_pwd() + "....." + t.getUser_type());
        }
        sqlSession.close();
    }

    //名称查询
    @Test
    public void findAllByUserName() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        t_user t_user = sqlSession.selectOne("findAllByUserName", "admin");
        System.out.print(t_user);
        sqlSession.close();
    }

    //模糊查询
    @Test
    public void findAllByUserName2() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<t_user> lt = sqlSession.selectList("findAllByUserName2", "a");
        for (t_user user : lt) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    //增加
    @Test
    public void addUser() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        t_user u = new t_user();
        u.setUser_id(String.valueOf(UUID.randomUUID()));
        u.setUser_name("wu");
        u.setUser_pwd("123");
        u.setUser_type(1);
        System.out.println(sqlSession.insert("addUser", u));
        sqlSession.commit();
        sqlSession.close();
    }

    //增加后返回主键
    @Test
    public void addUser2() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        t_user u = new t_user();
        u.setUser_name("ls");
        u.setUser_pwd("123");
        u.setUser_type(1);
        System.out.println(sqlSession.insert("addUser2", u));
        System.out.println(u);
        sqlSession.commit();
        sqlSession.close();
    }

    //修改
    @Test
    public void editUser() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        t_user u = new t_user();
        u.setUser_id("5ec8e692-8909-4455-979e-59d71beab492");
        u.setUser_name("we");
        System.out.println(sqlSession.insert("editUser", u));
        sqlSession.commit();
        sqlSession.close();
    }

    //删除
    @Test
    public void removeUser() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession.insert("removeUser", "3b5357cd-d92d-11e8-ab16-54ee75bbb0cd"));
        sqlSession.commit();
        sqlSession.close();
    }
}
