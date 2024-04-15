package org.example.mapper;

import org.example.pojo.AdminPojo;

import java.util.List;

public interface AdminMapper {
    //查询所有
    List<AdminPojo> selectAll();
    //插入数据
    void add(AdminPojo adminadd);
    //删除数据
    void deleteByID(String aid);
    //更新数据
    int update (AdminPojo aup);
    //新建查询作业1
    AdminPojo selectZy(String aid);
}
