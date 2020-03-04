package com.cy.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class ZuulFilter01 extends ZuulFilter {

    @Override
    public String filterType() {//此方法必须有返回值
        return "pre";
    }

    @Override  //order ： 订单、顺序
    public int filterOrder() {//相同类型过滤器执行顺序，数字越小，优先级越高
        return 10;
    }

    @Override
    public boolean shouldFilter() { //是否启动该过滤器
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String name = request.getParameter("name");
        if (name == null || "".equals(name.trim())){
            requestContext.setSendZuulResponse(false);//设置为false为后续判断拦截器是否拦截请求
            try {
                HttpServletResponse response = requestContext.getResponse();
                response.setCharacterEncoding("utf-8");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().print("哈哈哈");
//                requestContext.setResponseBody("");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
