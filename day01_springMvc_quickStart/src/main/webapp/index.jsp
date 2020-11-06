<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>

    <a href="springmvc/quickstart">小试牛刀</a>
    <a href="hello/demo?name=zs&age=18">测试</a>
    <a href="demo3">测试2</a>
    <a href="hello?username=123&password=123">测试01</a>
    <a href="demo4?students=张洋&students=李四">参数封装-数组类型</a>

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
