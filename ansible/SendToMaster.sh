#!/bin/bash

msg1='
Это скриптик чтобы шустро отправить этот проектик
на сервачек удаленный, который через [Ansible]
разворачивает приложение.

'
msg2='
по [ ssh ] можем выполнять удаленные команды

'

msg3='
формат команды копирования:
(*) для копирования папок ключ [ -r ]
 [ scp <local_file> <remote_user>@<remote_ip>: <remote_dir> ]

'

remote_user="dzhukov"
remote_ip="192.168.56.10"
remote_dir="~/My/experience"



# удаляем все что было + создаем папку
ssh $remote_user@$remote_ip     "rm -r $remote_dir"
ssh $remote_user@$remote_ip     "mkdir $remote_dir"

# копируем в папку проекта необходимые файлы
scp -r ../development/   $remote_user@$remote_ip:$remote_dir/development
scp -r ../ansible/       $remote_user@$remote_ip:$remote_dir/ansible
scp -r ../bin/           $remote_user@$remote_ip:$remote_dir/bin
scp -r ../db/            $remote_user@$remote_ip:$remote_dir/db






