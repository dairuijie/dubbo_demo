package com.dairuijie.app.rpc.service;

import java.util.List;
import java.util.Map;

public interface BaseService<T> {
    int INT_ZERO = 0;
    int INT_ONE = 1;
    int INT_TWO = 2;

    int insert(T record);
    int update(T record);
    int delete(Integer id);
    T queryById(Integer id);
    List<T> selectByPage(Map<String, Object> map);
    int countByPage(Map<String, Object> map);

}
