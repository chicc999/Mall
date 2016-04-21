package com.cy.mall.controller;

import com.cy.mall.common.pojo.EUDataGridResult;
import com.cy.mall.pojo.TbItem;
import com.cy.mall.service.ItemServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cy on 2016/4/14.
 */
@Controller
public class ItemController {

	@Autowired
	private ItemServiceI itemService;

	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable long itemId){
		return	itemService.getItemById(itemId);
	}

	@RequestMapping("/item/list")
	@ResponseBody
	public EUDataGridResult getItemList(Integer page, Integer rows) {
		EUDataGridResult result = itemService.getItemList(page, rows);
		return result;
	}

}
