### Spring Boot、Spring MVC、Spring之间的区别？Spring Boot本质是什么？


### Spring Boot Starter是什么？


### 如何自定义Spring Boot Starter？


### Spring Boot的自动装配原理是什么？源码分析。


### Spring Boot的启动流程是什么？


### 有没有看过Spring Boot源码？你觉得最神奇的地方是什么？

### 简述Spring中常用注解
@Component ：标准一个普通的spring Bean类。
@Repository：标注一个DAO组件类。
@Service：标注一个业务逻辑组件类。
@Controller：标注一个控制器组件类。
@Resource：注入组件

### 简述SpringMVC的请求流程
用户发送请求至前端控制器DispatcherServlet
DispatcherServlet收到请求调用HandlerMapping处理器映射器。
处理器映射器根据请求url找到具体的处理器，生成处理器对象及处理器拦截器(如果有则生成)一并返回给DispatcherServlet。
DispatcherServlet通过HandlerAdapter处理器适配器调用处理器
执行处理器(Controller，也叫后端控制器)。
Controller执行完成返回ModelAndView
HandlerAdapter将controller执行结果ModelAndView返回给DispatcherServlet
DispatcherServlet将ModelAndView传给ViewReslover视图解析器
ViewReslover解析后返回具体View
DispatcherServlet对View进行渲染视图（即将模型数据填充至视图中）。
DispatcherServlet响应用户



%[{ contactme.md }]%