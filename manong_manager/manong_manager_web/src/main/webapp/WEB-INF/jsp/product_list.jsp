<%--
  Created by IntelliJ IDEA.
  User: zkz
  Date: 2019/7/22
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
    <link rel="stylesheet" type="text/css" href="/css/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="/css/themes/icon.css"/>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script type="text/javascript" src="/js/jquery.easyui.min.js"></script>
</head>
<body>
<table class="easyui-datagrid" style="width:400px;height:250px"
       data-options="url:'datagrid_data.json',fitColumns:true,singleSelect:true">
    <thead>
    <tr>
        <th data-options="field:'code',width:100">Code</th>
        <th data-options="field:'name',width:100">Name</th>
        <th data-options="field:'price',width:100,align:'right'">Price</th>
    </tr>
    </thead>
</table>
</body>
</html>
