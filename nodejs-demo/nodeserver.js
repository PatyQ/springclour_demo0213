var http = require('http');//引入指定的服务
var url = require("url");
var path = require('path');

// 创建server
var server = http.createServer(function(req, res) {
    // 获得请求的路径
    var pathname = url.parse(req.url).pathname;
    res.writeHead(200, { 'Content-Type' : 'application/json; charset=utf-8' });
    // 访问http://localhost:8060/，将会返回{"index":"欢迎来到首页"}
    if (pathname === '/') {//如果请求的是首页返回以下内容
        res.end(JSON.stringify({ "index" : "欢迎来到召唤师峡谷" }));
    }
    // 访问http://localhost:8060/health，将会返回{"status":"UP"}
    else if (pathname === '/health.json') {//如果请求的是 health.json 返回以下内容
        res.end(JSON.stringify({ "status" : "UP" }));//此处的 up down 会影响到 eureka 的状态,我们的 sidecar 的项目会请求这个地址 获取到状态后显示在 eureka 的后台,如果返回 DOWN 则 eureka 会显示 Down
    }else if(pathname=="/userinfo.json"){
        res.end(JSON.stringify({ "name" : "wanlixing","age":"35","address":"湖北省武汉市" }))
    }
    // 其他情况返回404
    else {
        res.end("404");
    }
});
// 创建监听，并打印日志
server.listen(8060, function() {//监听8060端口
    console.log('listening on localhost:8060');
});