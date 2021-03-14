    CREATE TABLE IF NOT EXISTS simplegame_result
    (
        id serial primary key,
        win_result int NOT NULL,
        game_number int NOT NULL,
        date_of_win date NOT NULL


    );
drop table simplegame_result;