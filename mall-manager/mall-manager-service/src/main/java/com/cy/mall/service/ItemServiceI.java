package com.cy.mall.service;

import com.cy.mall.pojo.TbItem;
import org.springframework.stereotype.Service;

/**
 * Created by cy on 2016/4/12.
 */

public interface ItemServiceI {
	TbItem getItemById(long itemId);
}
