package com.example.demo.Repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Repository
public class MemoryTestRepository implements TestRepository{

    private final List<Map<String, String>> collectors = new ArrayList<>();

    @Override
    public Long save(Map<String, String> map) {
        collectors.add(map);
        return null;
    }

    @Override
    public Map<String, String> findById(Long id) {
        collectors.get(id.intValue() - 1);

        return collectors.get(id.intValue() - 1);
    }
}
