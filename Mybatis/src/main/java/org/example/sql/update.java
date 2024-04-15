package org.example.sql;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.AdminMapper;
import org.example.pojo.AdminPojo;

import java.io.IOException;
import java.io.InputStream;

public class update {
    public static void main(String[] args) throws IOException {
        //1、加载核心配置文件，获取sqlsessionfactory，通过官网复制
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2、获取sqlsession对象，用于执行sql语句;
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3、获取AdminMopper接口代理对象
        AdminMapper amapper =sqlSession.getMapper(AdminMapper.class);
        // 4、构建一个 Admin 对象，设置需要更新的字段值
        String aid="Ad202301";
        String an="aaa";
        String ap="123";
        String apw="122";

        AdminPojo aup=new AdminPojo();
        aup.setAdminID(aid);
        aup.setAdminName(an);
        aup.setAdminPhone(ap);
        aup.setAdminPassword(apw);

        int c= amapper.update(aup);
        // 6、提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
        // 7、输出更新成功提示
        System.out.println("成功更新管理员信息。");
    }
}
