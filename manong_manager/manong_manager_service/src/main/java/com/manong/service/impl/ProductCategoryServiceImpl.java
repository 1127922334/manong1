package com.manong.service.impl;

import com.manong.mapper.ProductCategoryMapper;
import com.manong.pojo.ProductCategory;
import com.manong.pojo.ProductCategoryExample;
import com.manong.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.EasyUITree;
import pojo.ResponseJsonResult;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
        private ProductCategoryMapper productCategoryMapper;

    @Override
    public List<EasyUITree> findProductCategoryListByParentId(Short parentid){
        ProductCategoryExample productCategoryExample = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = productCategoryExample.createCriteria();
            criteria.andParentidEqualTo(parentid);
            List<ProductCategory> productCategoryList = productCategoryMapper.selectByExample(productCategoryExample);
        List<EasyUITree> easyUITrees = new ArrayList<>(productCategoryList.size());

        for (ProductCategory productCategory:productCategoryList) {
                EasyUITree easyUITree = new EasyUITree();

                easyUITree.setId(productCategory.getId());
                easyUITree.setState(productCategory.getParentid()==0?"closed":"open");
                easyUITree.setText(productCategory.getName());
                easyUITree.setAttributes(productCategory.getParentid()+"");
                easyUITrees.add(easyUITree);

        }
        return easyUITrees;
    }
    @Override
    public ResponseJsonResult addCategory(Short parentId, String name){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setParentid(parentId);
        productCategory.setName(name);

        productCategoryMapper.insert(productCategory);

        ResponseJsonResult responseJsonResult = new ResponseJsonResult();
        responseJsonResult.setMsg(productCategory.getId()+"");

        return responseJsonResult;
    }
    @Override
    public ResponseJsonResult editedCategory(Short parentId,Short id,String name){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setId(parentId);
        productCategory.setParentid(id);
        productCategory.setName(name);
        productCategoryMapper.updateByPrimaryKeySelective(productCategory);

        ResponseJsonResult responseJsonResult = new ResponseJsonResult();
        responseJsonResult.setMsg(productCategory.getId()+"");

        return responseJsonResult;
    }
    @Override
        public ResponseJsonResult deleteCategory(Short parentId,Short id){
                ProductCategoryExample productCategoryExample = new ProductCategoryExample();
                ProductCategoryExample.Criteria criteria = productCategoryExample.createCriteria();

                if(parentId==0){
                    criteria.andIdEqualTo(id);
                    ProductCategoryExample.Criteria criteria1 = productCategoryExample.createCriteria();
                   criteria1.andParentidEqualTo(id);
                    productCategoryExample.or(criteria1);
             }else {
                    criteria.andIdEqualTo(id);
                }
                productCategoryMapper.deleteByExample(productCategoryExample);
                ResponseJsonResult responseJsonResult = new ResponseJsonResult();
                responseJsonResult.setStatus(200);
                responseJsonResult.setMsg("success");
        return responseJsonResult;
    }
}
