package com.example.demo.Repository;

import java.util.Map;

public interface TestRepository {

    //C
    Long save(Map<String, String> map);

    //R
    Map<String, String> findById(Long id);

}
