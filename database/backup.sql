CREATE DATABASE sistema;

USE sistema;

CREATE TABLE pessoa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    cpf VARCHAR(11)
);

INSERT INTO pessoa (nome, cpf) VALUES ('Ana Silva', '12345678901');
INSERT INTO pessoa (nome, cpf) VALUES ('Bruno Souza', '23456789012');
INSERT INTO pessoa (nome, cpf) VALUES ('Carlos Santos', '34567890123');
INSERT INTO pessoa (nome, cpf) VALUES ('Daniela Lima', '45678901234');
INSERT INTO pessoa (nome, cpf) VALUES ('Eduardo Gomes', '56789012345');
INSERT INTO pessoa (nome, cpf) VALUES ('Fernanda Araújo', '67890123456');
INSERT INTO pessoa (nome, cpf) VALUES ('Gustavo Ribeiro', '78901234567');
INSERT INTO pessoa (nome, cpf) VALUES ('Helena Alves', '89012345678');
INSERT INTO pessoa (nome, cpf) VALUES ('Igor Costa', '90123456789');
INSERT INTO pessoa (nome, cpf) VALUES ('Juliana Ferreira', '01234567890');
INSERT INTO pessoa (nome, cpf) VALUES ('Karen Martins', '11223344556');
INSERT INTO pessoa (nome, cpf) VALUES ('Lucas Pereira', '22334455667');
INSERT INTO pessoa (nome, cpf) VALUES ('Mariana Carvalho', '33445566778');
INSERT INTO pessoa (nome, cpf) VALUES ('Nicolas Mendes', '44556677889');
INSERT INTO pessoa (nome, cpf) VALUES ('Olivia Rocha', '55667788990');
INSERT INTO pessoa (nome, cpf) VALUES ('Pedro Cunha', '66778899001');
INSERT INTO pessoa (nome, cpf) VALUES ('Quesia Barros', '77889900112');
INSERT INTO pessoa (nome, cpf) VALUES ('Rafael Nunes', '88990011223');
INSERT INTO pessoa (nome, cpf) VALUES ('Sara Oliveira', '99001122334');
INSERT INTO pessoa (nome, cpf) VALUES ('Tiago Vieira', '10111222345');
