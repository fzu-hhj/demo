package com.example.demo.mapper;

import com.example.demo.bean.Admin;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminMapper {
    @Select("select * from admin where id=#{id}")
    public Admin getAdminById(Integer id);

    @Delete("delete from admin where id=#{id}")
    public int deleteAdminById(Integer id);
}
