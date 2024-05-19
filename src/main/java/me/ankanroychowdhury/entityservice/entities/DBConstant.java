package me.ankanroychowdhury.entityservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DBConstant extends BaseModel{

    @Column(nullable = false, unique = true)
    private String name;
    private String value;
}
