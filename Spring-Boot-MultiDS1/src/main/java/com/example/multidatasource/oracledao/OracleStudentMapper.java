package com.example.multidatasource.oracledao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by dengzhiming on 2019/3/27
 */
@Repository
public interface OracleStudentMapper {
    List<Map<String, Object>> getAllStudents();
}
