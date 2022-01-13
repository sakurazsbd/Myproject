sudo passwd root
设置root用户
	



解决虚拟机无法复制粘贴





装完linux后完成的动作
一、ubuntu改apt阿里源
1、复制源文件备份，以防万一，我们要修改的文件是sources.list，它在目录/etc/apt/下，sources.list是包管理工具apt所用的记录软件包仓库位置的配置文件，同样类型的还有位于 同目录下sources.list.d文件下的各种.list后缀的各文件。

命令如下：
sudo cp /etc/apt/sources.list /etc/apt/sources.list.bak

2.编辑源列表文件2.编辑源列表文件
命令如下：
sudo vim /etc/apt/sources.list

如果报错：sudo:vim:command not found    说明没装vim编辑器
可以执行命令：  sudo vi /etc/apt/sources.list
使用命令：
sudo apt-get install vim 安装即可

4.将原有的内容注释掉，添加以下内容（或者你把里面内容修改成下面的就可以，但是不能有除了以下内容的有效内容）

deb http://mirrors.aliyun.com/ubuntu/ bionic main restricted universe multiverse

deb-src http://mirrors.aliyun.com/ubuntu/ bionic main restricted universe multiverse

deb http://mirrors.aliyun.com/ubuntu/ bionic-security main restricted universe multiverse

deb-src http://mirrors.aliyun.com/ubuntu/ bionic-security main restricted universe multiverse

deb http://mirrors.aliyun.com/ubuntu/ bionic-updates main restricted universe multiverse

deb-src http://mirrors.aliyun.com/ubuntu/ bionic-updates main restricted universe multiverse

deb http://mirrors.aliyun.com/ubuntu/ bionic-backports main restricted universe multiverse

deb-src http://mirrors.aliyun.com/ubuntu/ bionic-backports main restricted universe multiverse

deb http://mirrors.aliyun.com/ubuntu/ bionic-proposed main restricted universe multiverse

deb-src http://mirrors.aliyun.com/ubuntu/ bionic-proposed main restricted universe multiverse

5.更新软件列表
运行如下命令：
sudo apt-get update

6.更新软件包
运行如下命令：
sudo apt-get upgrade




二、ubuntu安装docker

完全参考菜鸟教程：https://www.runoob.com/docker/ubuntu-docker-install.html


三、修改docker源

docker默认的源为国外官方源，下载速度较慢，可改为国内，加速
修改或新增 /etc/docker/daemon.json
运行如下命令：
sudo vim /etc/docker/daemon.json
写入：
{

"registry-mirrors": ["http://hub.c.163.com"]

}

运行如下命令：
systemctl restart docker
即可



四、拉取docker镜像


除了拉取上面写的几个外，还需要拉取federatedai/python:1.5.1-release，federatedai/client:1.5.1-release
另外注意federatedai/serving的版本，不是最新的版本号，要看下后面具体使用的版本

docker pull federatedai/eggroll:1.5.1-release
docker pull federatedai/fateboard:1.5.1-release
docker pull federatedai/python:1.5.1-release
docker pull federatedai/serving-server:2.0.0-release
docker pull federatedai/serving-proxy:2.0.0-release
docker pull redis:5
docker pull mysql:8
	
docker pull federatedai/python:1.5.1-release
docker pull federatedai/client:1.5.1-release


   

五、将下载好的镜像打包

docker save federatedai/eggroll:1.5.1-release -o eggroll.tar
docker save federatedai/fateboard:1.5.1-release -o fateboard.tar
docker save federatedai/python:1.5.1-release -o python.tar
docker save federatedai/serving-server:2.0.0-release -o serving-server.tar
docker save federatedai/serving-proxy:2.0.0-release -o serving-proxy.tar
docker save redis:5 -o redis.tar
docker save mysql:8 -o mysql.tar
docker save federatedai/client:1.5.1-release -o client.tar




1.从github上下载docker-compose二进制文件安装
下载最新版的docker-compose文件 
sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose

若是github访问太慢，可以用daocloud下载
sudo curl -L https://get.daocloud.io/docker/compose/releases/download/1.25.1/docker-compose-`uname -s`-`uname -m` -o /usr/local/bin/docker-compose

































########################################################################################################
备份
sudo cp /etc/apt/sources.list /etc/apt/sources.list.bak

修改sources.list

sudo vi /etc/apt/sources.list

sudo vim /etc/apt/sources.list

如果报错：sudo:vim:command not found    说明没装vim编辑器
使用命令：
sudo apt-get install vim 安装即可



4.将原有的内容注释掉，添加以下内容（或者你把里面内容修改成下面的就可以，但是不能有除了以下内容的有效内容）

deb http://mirrors.aliyun.com/ubuntu/ bionic main restricted universe multiverse

deb-src http://mirrors.aliyun.com/ubuntu/ bionic main restricted universe multiverse

deb http://mirrors.aliyun.com/ubuntu/ bionic-security main restricted universe multiverse

deb-src http://mirrors.aliyun.com/ubuntu/ bionic-security main restricted universe multiverse

deb http://mirrors.aliyun.com/ubuntu/ bionic-updates main restricted universe multiverse

deb-src http://mirrors.aliyun.com/ubuntu/ bionic-updates main restricted universe multiverse

deb http://mirrors.aliyun.com/ubuntu/ bionic-backports main restricted universe multiverse

deb-src http://mirrors.aliyun.com/ubuntu/ bionic-backports main restricted universe multiverse

deb http://mirrors.aliyun.com/ubuntu/ bionic-proposed main restricted universe multiverse

deb-src http://mirrors.aliyun.com/ubuntu/ bionic-proposed main restricted universe multiverse















{

"registry-mirrors": ["http:hub.c.163.com"]

}

{ 
"registry-mirrors": ["https://docker.mirrors.ustc.edu.cn"] 
}




$ docker pull federatedai/eggroll:1.5.1-release
$ docker pull federatedai/fateboard:1.5.1-release
$ docker pull federatedai/python:1.5.1-release
$ docker pull federatedai/serving-server:1.5.1-release
$ docker pull federatedai/serving-proxy:1.5.1-release
$ docker pull redis:5
$ docker pull mysql:8
