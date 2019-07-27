<%--
  Created by IntelliJ IDEA.
  User: zkz
  Date: 2019/7/21
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
    <link rel="stylesheet" type="text/css" href="/css/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="/css/themes/icon.css"/>
<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript" src="/js/jquery.easyui.min.js"></script>
<body class="easyui-layout">

<div data-options="region:'west',title:'West',split:true,minWidth:180" style="width:100px;">
    <ul id="tt" class="easyui-tree">
        <li>
            <span>商品分类管理</span>
            <ul>
                <li data-options="attributes:{'url':'product_cat_list'}">商品分类列表</li>
            </ul>
        </li>
        <li>
            <span>商品管理</span>
            <ul>
                <li data-options="attributes:{'url':'product_list'}">商品列表</li>
                <li data-options="attributes:{'url':'product_add'}">商品添加</li>
            </ul>
        </li>
    </ul>
</div>
<div data-options="region:'center',title:''" style="padding:5px;background:#eee;">
    <div id="tabs" class="easyui-tabs">
        <div title="首页" style="padding:20px;display:none;">
            首页
        </div>
        <script>
            $('#tt').tree({
                onClick: function(node){
                    var tabs=$("#tabs")
                    var tab = tabs.tabs("getTab",node.text);

                        if(tab){
                            tabs.tabs("select",node.text);
                        }else{
                            tabs.tabs('add',{
                                title:node.text,
                                content:'Tab Body',
                                href:node.attributes.url,
                                closable:true,
                            });
                        }

                }
            });
        </script>

    </div>
</div>
</body>
</html>
