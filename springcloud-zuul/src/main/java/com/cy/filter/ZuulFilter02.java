package com.cy.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class ZuulFilter02 extends ZuulFilter {

    private static Map<String, String> routingMap = new ConcurrentHashMap();
    private static Map<String, String> PathMap = new ConcurrentHashMap();

    static {
        routingMap.put("test1", "springcloud-hystrix");
        routingMap.put("test2", "springcloud-hystrix");
        PathMap.put("test1", "/hy/getStu/{id}");
        PathMap.put("test2", "/hy/getStu");
    }

    @Override
    public String filterType() {//此方法必须有返回值
        return "pre";
    }

    @Override  //order ： 订单、顺序
    public int filterOrder() {//相同类型过滤器执行顺序，数字越小，优先级越高
        return 30;
    }

    @Override
    public boolean shouldFilter() { //是否启动该过滤器
        RequestContext requestContext = RequestContext.getCurrentContext();
        boolean response = requestContext.sendZuulResponse();
        return response;
    }

    @Override
    public Object run() throws ZuulException {
        System.err.println("执行了优先级为30的过滤器");
        RequestContext requestContext = RequestContext.getCurrentContext();
        System.err.println(requestContext);
        HttpServletRequest request = requestContext.getRequest();
        System.out.println(request);
        String name = request.getParameter("name");
        System.err.println(name);
//        requestContext.put(FilterConstants.SERVICE_ID_KEY, serviceid)
        String uri = requestContext.getRequest().getRequestURI();
        System.err.println("请求的URI :"+uri); //请求的URI :/hy/getStu/1

        Enumeration<String> names = request.getParameterNames();
        System.err.println("获取到的names ："+names);
        String s = names.nextElement();
        System.out.println("s? :"+ s);
        while (names.hasMoreElements()){
            String nextElement = names.nextElement();//获取括号里的字母
            String kuohao = "{"+nextElement+"}";
            System.out.println("获取括号里的字母: " + kuohao);
            String parameter = request.getParameter(nextElement);//将url后？id=1替换到{id}中
            String s1 = PathMap.get("test1");
            String replace = s1.replace(kuohao, parameter);
            System.err.println("替换后的地址 ："+replace);
        }
        return null;
    }
}
