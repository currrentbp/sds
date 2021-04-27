package com.bp.mapper;

import com.bp.entry.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Mapper
public interface StudentMapper {


    Student getById(Integer id);

    Integer insert(Student student);
}
