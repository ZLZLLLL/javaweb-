package org.example.sql;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.AdminMapper;
import org.example.pojo.AdminPojo;

import java.io.IOException;
import java.io.InputStream;

public class insert {
    public static void main(String[] args) throws IOException {
        //1、加载核心配置文件，获取sqlsessionfactory，通过官网复制
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2、获取sqlsession对象，用于执行sql语句;
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3、获取AdminMapper接口代理对象
        AdminMapper amapper =sqlSession.getMapper(AdminMapper.class);
        //4、模拟接收数据
        String aid ="Ad202303";
        String aname="admin103";
        String aphone="15775794445";
        //5、封装对象
        AdminPojo adminadd=new AdminPojo();
        adminadd.setAdminID(aid);
        adminadd.setAdminName(aname);
        adminadd.setAdminPhone(aphone);
        //执行方法
        amapper.add(adminadd);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
}
