#!/bin/bash

read -s "Digite a senha do sistema: " senha

echo $senha | sudo -S docker build -t server_img server/.

echo $senha | sudo -S docker-compose up -d


