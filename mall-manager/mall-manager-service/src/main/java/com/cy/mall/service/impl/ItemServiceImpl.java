package com.cy.mall.service.impl;

import com.cy.mall.mapper.TbItemMapper;
import com.cy.mall.pojo.TbItem;
import com.cy.mall.service.ItemServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cy on 2016/4/13.
 */
@Service
public class ItemServiceImpl implements ItemServiceI{

	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem getItemById(long itemId) {
		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		return item;
	}
}
