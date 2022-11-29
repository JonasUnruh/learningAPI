package com.learning.learningAPI.table;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("table")
@AllArgsConstructor
public class TableController {

    private final TableService tableService;

    @GetMapping
    public List<TableFurniture> getTables(){
        return tableService.getTables();
    }

    @PostMapping
    public void postTable(@RequestBody TableFurniture tableFurniture){ tableService.addNewTable(tableFurniture); }

}
