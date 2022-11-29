package com.learning.learningAPI.table;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TableService {

    private final TableRepository tableRepository;

    public List<TableFurniture> getTables(){
        return tableRepository.findAll();
    }

    public void addNewTable(TableFurniture tableFurniture){
        tableRepository.save(tableFurniture);
        //System.out.println(tableFurniture);
    }

}
