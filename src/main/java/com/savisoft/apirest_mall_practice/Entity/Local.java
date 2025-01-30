package com.savisoft.apirest_mall_practice.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Local {

    @Id
    @SequenceGenerator(
            name = "local_sequence",
            sequenceName = "local_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "local_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long localId;
    private String name;
    private String floor;

    @OneToOne
    @JoinColumn(
            name = "manager_id",
            referencedColumnName = "managerId"
    )
    private Manager manager;
}
