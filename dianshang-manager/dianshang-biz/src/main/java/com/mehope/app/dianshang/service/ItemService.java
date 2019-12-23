package com.mehope.app.dianshang.service;

import com.mehope.app.dianshang.common.EUDataGridResult;
import com.mehope.app.dianshang.common.Result;
import com.mehope.app.dianshang.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);
	EUDataGridResult getItemList(int page, int rows);
	Result createItem(TbItem item, String desc, String itemParam) throws Exception;
}
