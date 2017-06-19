#!/usr/bin/env bash

msg1='
Это скриптик, чтобы сбилдить наш [ Angular4 ]
проектик и кинуть на сервачек

'
msg2='
по [ ssh ] можем выполнять удаленные команды

'

msg3='
формат команды копирования:
(*) для копирования папок ключ [ -r ]
 [ scp <local_file> <remote_user>@<remote_ip>: <remote_dir> ]

'

remote_user="doneathome"
remote_ip="192.168.56.11"
remote_dir="/u01/experience/tomcat/webapps/web"

# сохраняем текущую директорию в переменную (это [ё])
path=`pwd`

# сходим в директорию откуда можем запустить сборку
cd ././../development/web-server/web-chat/

# запускаем сборку
ng build --output-path ../../../ansible/distrib/web/

# возвращаемся
cd "$path"



# удаляем старый [front-server]
ssh $remote_user@$remote_ip     "rm -r $remote_dir"

# копируем в папку
scp -r ./distrib/web/   $remote_user@$remote_ip:$remote_dir