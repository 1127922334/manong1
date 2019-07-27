package com.manong.service;
import pojo.EasyUITree;
import pojo.ResponseJsonResult;

import java.util.List;

public interface ProductCategoryService {

    List<EasyUITree> findProductCategoryListByParentId(Short parentid);
    ResponseJsonResult addCategory(Short parentId,String name);
    ResponseJsonResult editedCategory(Short parentId,Short id,String name);
    ResponseJsonResult deleteCategory(Short parentId,Short id);
}
