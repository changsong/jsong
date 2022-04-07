## 删除文件夹temp
rm -rf temp

## 后台启动Nginx
nohup nginx -c conf/nginx.conf > /dev/null 2>&1 &

## 后台启动Tomcat
nohup java -jar target/copilot-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 &

## 列出data目录下所有大小大于100M的文件
find data -type f -size +100M -exec ls -lh {} \;

## 检查tomcat是否启动，如果未启动，则启动
if [ ! -f "temp/tomcat.pid" ]; then
    nohup java -jar target/copilot-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 &
fi

