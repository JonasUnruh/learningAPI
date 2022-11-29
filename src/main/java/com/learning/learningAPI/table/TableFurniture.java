package com.learning.learningAPI.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@javax.persistence.Table
public class TableFurniture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer length;

    private Integer depth;

    private Integer height;

    private String material;

    private LocalDate dateOfManufacturing;

}
