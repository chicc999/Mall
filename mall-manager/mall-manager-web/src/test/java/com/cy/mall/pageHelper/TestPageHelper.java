package com.cy.mall.pageHelper;

import com.cy.mall.mapper.TbItemMapper;
import com.cy.mall.pojo.TbItem;
import com.cy.mall.pojo.TbItemExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by cy on 2016/4/20.
 */
public class TestPageHelper {

	@Test
	public void testPageHelper(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext*");
		TbItemMapper mapper = applicationContext.getBean(TbItemMapper.class);

		TbItemExample example = new TbItemExample();

		PageHelper.startPage(1,10);

		List<TbItem> list = mapper.selectByExample(example);

		for(TbItem item : list){
			System.out.println(item.getTitle());
		}

		PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(list);
		long total = pageInfo.getTotal();
		System.out.println(total);
	}
}
