CREATE TABLE Post (
    id_post BIGINT NOT NULL AUTO_INCREMENT,
    title VARCHAR(100),
    description VARCHAR(255),
    PRIMARY KEY (id_post)
);

CREATE TABLE Comment (
    id_comment BIGINT NOT NULL AUTO_INCREMENT,
    text VARCHAR(255),
    id_post BIGINT,
    PRIMARY KEY (id_comment),
    FOREIGN KEY (id_post) REFERENCES Post(id_post)
);