package me.ankanroychowdhury.entityservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Color extends BaseModel {

    @Column(nullable = false, unique = true)
    private String colorName;
}
