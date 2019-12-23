package com.mehope.app.dianshang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mehope.app.dianshang.common.EUDataGridResult;
import com.mehope.app.dianshang.common.Result;
import com.mehope.app.dianshang.mapper.TbItemDescMapper;
import com.mehope.app.dianshang.mapper.TbItemMapper;
import com.mehope.app.dianshang.mapper.TbItemParamItemMapper;
import com.mehope.app.dianshang.pojo.TbItem;
import com.mehope.app.dianshang.service.ItemService;

/**
 * 商品管理Service
 * <p>Title: ItemServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	入云龙
 * @date	2015年9月2日上午10:47:14
 * @version 1.0
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	@Autowired
	private TbItemDescMapper itemDescMapper;
	
	@Autowired
	private TbItemParamItemMapper itemParamItemMapper;
	
	@Override
	public TbItem getItemById(long itemId) {
		
		QueryWrapper<TbItem> queryWrapper = new QueryWrapper<TbItem>();
		
		queryWrapper.eq("id", itemId);
		TbItem item = this.itemMapper.selectOne(queryWrapper);
		return item;
	}

	@Override
	public EUDataGridResult getItemList(int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result createItem(TbItem item, String desc, String itemParam)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 商品列表查询
	 * <p>Title: getItemList</p>
	 * <p>Description: </p>
	 * @param page
	 * @param rows
	 * @return
	 * @see com.taotao.service.ItemService#getItemList(long, long)
	 */
//	@Override
//	public EUDataGridResult getItemList(int page, int rows) {
//		//查询商品列表
//		TbItemExample example = new TbItemExample();
//		//分页处理
//		PageHelper.startPage(page, rows);
//		List<TbItem> list = itemMapper.selectByExample(example);
//		//创建一个返回值对象
//		EUDataGridResult result = new EUDataGridResult();
//		result.setRows(list);
//		//取记录总条数
//		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
//		result.setTotal(pageInfo.getTotal());
//		return result;
//	}

//	@Override
//	public TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception {
//		//item补全
//		//生成商品ID
//		Long itemId = IDUtils.genItemId();
//		item.setId(itemId);
//		// '商品状态，1-正常，2-下架，3-删除',
//		item.setStatus((byte) 1);
//		item.setCreated(new Date());
//		item.setUpdated(new Date());
//		//插入到数据库
//		itemMapper.insert(item);
//		//添加商品描述信息
//		TaotaoResult result = insertItemDesc(itemId, desc);
//		if (result.getStatus() != 200) {
//			throw new Exception();
//		}
//		//添加规格参数
//		result = insertItemParamItem(itemId, itemParam);
//		if (result.getStatus() != 200) {
//			throw new Exception();
//		}
//		return TaotaoResult.ok();
//	}
//	/**
//	 * 添加商品描述
//	 * <p>Title: insertItemDesc</p>
//	 * <p>Description: </p>
//	 * @param desc
//	 */
//	private TaotaoResult insertItemDesc(Long itemId, String desc) {
//		TbItemDesc itemDesc = new TbItemDesc();
//		itemDesc.setItemId(itemId);
//		itemDesc.setItemDesc(desc);
//		itemDesc.setCreated(new Date());
//		itemDesc.setUpdated(new Date());
//		itemDescMapper.insert(itemDesc);
//		return TaotaoResult.ok();
//	}
//	
//	/**
//	 * 添加规格参数
//	 * <p>Title: insertItemParamItem</p>
//	 * <p>Description: </p>
//	 * @param itemId
//	 * @param itemParam
//	 * @return
//	 */
//	private TaotaoResult insertItemParamItem(Long itemId, String itemParam) {
//		//创建一个pojo
//		TbItemParamItem itemParamItem = new TbItemParamItem();
//		itemParamItem.setItemId(itemId);
//		itemParamItem.setParamData(itemParam);
//		itemParamItem.setCreated(new Date());
//		itemParamItem.setUpdated(new Date());
//		//向表中插入数据
//		itemParamItemMapper.insert(itemParamItem);
//		
//		return TaotaoResult.ok();
//		
//	}

}
