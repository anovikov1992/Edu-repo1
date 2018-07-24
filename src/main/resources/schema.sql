CREATE TABLE IF NOT EXISTS Person (
    id         INTEGER  PRIMARY KEY AUTO_INCREMENT,
    version    INTEGER NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    age        INTEGER  NOT NULL
);

CREATE TABLE IF NOT EXISTS House (
    id         INTEGER  PRIMARY KEY AUTO_INCREMENT,
    version    INTEGER NOT NULL,
    address    VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS Person_House (
    person_id   INTEGER  NOT NULL,
    house_id    INTEGER  NOT NULL,

    PRIMARY KEY (person_id, house_id)
);

CREATE TABLE IF NOT EXISTS Org (
    id         LONG  PRIMARY KEY AUTO_INCREMENT,
    Name    VARCHAR NOT NULL,
    FullName VARCHAR NOT NULL,
    inn        LONG  NOT NULL,
    kpp        LONG  NOT NULL,
    Adress        VARCHAR  NOT NULL,
    phone        VARCHAR  NOT NULL,


);

CREATE INDEX IX_Person_House_Id ON Person_House (house_id);
ALTER TABLE Person_House ADD FOREIGN KEY (house_id) REFERENCES House(id);

CREATE INDEX IX_House_Person_Id ON Person_House (person_id);
ALTER TABLE Person_House ADD FOREIGN KEY (person_id) REFERENCES Person(id);