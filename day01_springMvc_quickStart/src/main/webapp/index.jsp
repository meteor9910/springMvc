<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>

    <a href="springmvc/quickstart">小试牛刀</a>
    <a href="hello/demo?name=zs&age=18">测试</a>
    <a href="demo3">测试2</a>
    <a href="hello?username=123&password=123">测试01</a>
    <a href="demo4?students=张洋&students=李四">参数封装-数组类型</a>
    <a href="demo6?date = 2020-11-6">参数封装-时间类型</a><br>
    <a href="demo77">域封装</a>
    <a href="demo88">mode封装2</a>
    <a href="demo9">ModelAndView封装</a>
    <a href="demo10">扩展请求转发</a>
    <a href="demo11">使用原生的servlet的对象进行请求转发</a>
    <a href="demo12">使用redirect关键字进行重定向</a>
    <a href="demo13">使用原生的servlet的对象进行重定向</a>
    <a href="demo14">使用@ResponseBody注解</a>
    <a href="demo15">使用@ResponseBody返回JSON数据 </a>
    <a href="demo16">使 @ResponseBody 相应一个自定义结果对象,同样要返回json格式</a>
    <a href="demo888">响应一个自定义结果对象</a>


<h2>Hello World!</h2>

<div>
    <form action="demo5" method="post" >
        第一个User的name<input type="text" name="users[0].name" value="张洋">
        第一个User的age <input type="text" name="users[0].age" value="22">
        第二个User的name<input type="text" name="users[1].name" value="张洋01">
        第二个User的age <input type="text" name="users[1].age" value="18">
        第一个Student:<input type="text" name="students['1001']" value="zhangsan">
        第一个Student:<input type="text" name="students['1002']" value="lisi">
        <input type="submit" value="参数封装-集合类型" >




    </form>
</div>

</body>
</html>
