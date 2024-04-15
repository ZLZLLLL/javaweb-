package org.example.sql;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.AdminMapper;
import org.example.pojo.AdminPojo;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class delete {
    public static void main(String[] args) throws IOException {
        //1、加载核心配置文件，获取sqlsessionfactory，通过官网复制
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2、获取sqlsession对象，用于执行sql语句;
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3、获取AdminMopper接口代理对象
        AdminMapper amapper =sqlSession.getMapper(AdminMapper.class);
        //4、删除数据
        String aid = "Ad202303";
        amapper.deleteByID(aid);
        //5、提交事务
        sqlSession.commit();
        //6、释放资源
        sqlSession.close();
    }
}
