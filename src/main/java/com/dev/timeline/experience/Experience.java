package com.dev.timeline.experience;

import com.dev.timeline.achievement.Achievement;
import com.dev.timeline.core.Identifiable;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Experience extends Identifiable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String company;
    private String description;
    @OneToMany
    private List<Achievement> achievements;
}
