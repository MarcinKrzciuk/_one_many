CREATE TABLE posts (
    id BIGINT NOT NULL AUTO_INCREMENT,
    title VARCHAR(100),
    description VARCHAR(255)
);

CREATE TABLE comments (
    id BIGINT NOT NULL AUTO_INCREMENT,
    text VARCHAR(255)
);