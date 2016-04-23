package com.cy.mall.service.impl;

import com.cy.mall.mapper.TbItemCatMapper;
import com.cy.mall.pojo.TbItemCat;
import com.cy.mall.pojo.TbItemCatExample;
import com.cy.mall.service.ItemCatServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cy on 2016/4/22.
 */
@Service
public class ItemCatServiceImpl implements ItemCatServiceI{

	@Autowired
	private TbItemCatMapper itemCatMapper;

	@Override
	public List<TbItemCat> getItemCatList(Long parentId) throws Exception {
		TbItemCatExample example = new TbItemCatExample();
		//设置查询条件
		TbItemCatExample.Criteria criteria = example.createCriteria();
		//根据parentid查询子节点
		criteria.andParentIdEqualTo(parentId);
		//返回子节点列表
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		return list;
	}

}
