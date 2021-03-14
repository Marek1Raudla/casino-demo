package com.bta.casino.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "simplegame_result")
public class SimpleGameResult implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "win_result")
    private int winResult;
    @Column(name = "game_number")
    private int gameNumber;
    @Column(name = "date_of_win")
    private LocalDate dateOfWin;


}
