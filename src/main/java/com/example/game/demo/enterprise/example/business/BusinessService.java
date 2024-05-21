package com.example.game.demo.enterprise.example.business;

import com.example.game.demo.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService{
    @Autowired
    private DataService dataService;

    public BusinessService(DataService dataService) {
        super();
        System.out.println("Constructor injection");
        this.dataService = dataService;
    }

    public long calculateSum(){
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();

    }
}
