CREATE TABLE Posts (
    id_posts BIGINT NOT NULL AUTO_INCREMENT,
    title VARCHAR(100),
    description VARCHAR(255)
);

CREATE TABLE Comments (
    id_comments BIGINT NOT NULL AUTO_INCREMENT,
    text VARCHAR(255),
    id_posts BIGINT
);