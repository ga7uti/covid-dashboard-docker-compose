
CREATE TABLE IF NOT EXISTS countries (
    id int  PRIMARY KEY,
    name varchar(80) NOT NULL,
    code varchar(3) DEFAULT NULL
);