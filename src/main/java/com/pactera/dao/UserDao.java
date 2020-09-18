package com.pactera.dao;

import com.pactera.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class UserDao {

    public List<User> findAllUser() {
        List<User> list = new ArrayList<User>();
        for(Map.Entry<Integer,User> entry: DataBase.map.entrySet()){
            list.add(entry.getValue());
        }
        return  list;
    }
    public void addUser(User user) {
        DataBase.map.put(DataBase.map.size() +1,user);
    }
    public void deleteById(Integer id) {
        DataBase.map.remove(id);
    }
    public void updateUser( User user) {
        DataBase.map.put(user.getId(),user);
    }
}
