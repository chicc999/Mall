package com.cy.mall.service.impl;

import com.cy.mall.common.pojo.EUDataGridResult;
import com.cy.mall.mapper.TbItemMapper;
import com.cy.mall.pojo.TbItem;
import com.cy.mall.pojo.TbItemExample;
import com.cy.mall.service.ItemServiceI;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cy on 2016/4/13.
 */
@Service
public class ItemServiceImpl implements ItemServiceI {

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long itemId) {
        TbItem item = itemMapper.selectByPrimaryKey(itemId);
        return item;
    }

    @Override
    public EUDataGridResult getItemList(long page, long rows) {
        // 查询商品列表
        TbItemExample example = new TbItemExample();
        // 分页处理
        PageHelper.startPage((int) page, (int) rows);
        List<TbItem> list = itemMapper.selectByExample(example);
        // 创建一个返回值对象
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        // 取记录总条数
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

}
