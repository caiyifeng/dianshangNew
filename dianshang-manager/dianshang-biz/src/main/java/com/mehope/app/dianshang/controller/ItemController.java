package com.mehope.app.dianshang.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mehope.app.dianshang.common.EUDataGridResult;
import com.mehope.app.dianshang.pojo.TbItem;
import com.mehope.app.dianshang.service.ItemService;

/**
 * 商品管理Controller
 * <p>Title: ItemController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	入云龙
 * @date	2015年9月2日上午10:52:46
 * @version 1.0
 */

@Slf4j
@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId) {
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EUDataGridResult getItemList(Integer page, Integer rows) {
		EUDataGridResult result = itemService.getItemList(page, rows);
		return result;
	}
	
//	@RequestMapping(value="/item/save", method=RequestMethod.POST)
//	@ResponseBody
//	private TaotaoResult createItem(TbItem item, String desc, String itemParams) throws Exception {
//		TaotaoResult result = itemService.createItem(item, desc, itemParams);
//		return result;
//	}
}
