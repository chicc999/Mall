package com.cy.mall.service;

import com.cy.mall.pojo.TbItemCat;

import java.util.List;

/**
 * Created by cy on 2016/4/22.
 */
public interface ItemCatServiceI {
	List<TbItemCat> getItemCatList(Long parentId) throws Exception;
}
