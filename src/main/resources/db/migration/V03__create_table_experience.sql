create table experience
(
    id             INT AUTO_INCREMENT PRIMARY KEY,
    company        VARCHAR(255) NOT NULL,
    description    VARCHAR(255) NOT NULL,
    achievement_id INT
);

ALTER TABLE experience
    ADD FOREIGN KEY (achievement_id)
        REFERENCES achievement (id);