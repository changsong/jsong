## 删除文件夹temp
rm -rf temp

## 后台启动Nginx
nohup nginx -c conf/nginx.conf > /dev/null 2>&1 &

## 后台启动Tomcat
nohup java -jar target/copilot-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 &

## 后台启动tomcat
nohup java -jar target/copilot-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 &


## 列出data目录下所有大小大于100M的文件
find data -type f -size +100M -exec ls -lh {} \;

## 检查tomcat是否启动，如果未启动，则启动
if [ ! -f "temp/tomcat.pid" ]; then
    nohup java -jar target/copilot-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 &
fi

## 启动kafka
nohup /usr/local/kafka/bin/kafka-server-start.sh /usr/local/kafka/config/server.properties > /dev/null 2>&1 &

## 删除tmp目录下创建时间超过20天的文件
find tmp -type f -mtime +20 -exec rm -rf {} \;

## 添加新的hosts解析


## 切割文件
split -b 100M -d -a 3 data/2018-01-01.log data/2018-01-01.log.

## 合并文件
cat data/2018-01-01.log.* > data/2018-01-01.log





