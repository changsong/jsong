### 不是基础知识，是收集工作中常见的命令及使用场景

### 查看日志

#### 统计nginx日志里访问次数最多的前十个IP
awk '{print $1}' /var/log/nginx/access.log | sort | uniq -c | sort -nr -k1 | head -n 10

> 封IP，可以在nginx上配置 deny
> deny 110.249.201.0/24;