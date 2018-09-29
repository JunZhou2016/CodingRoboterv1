package com.fangshuo.lib4fangshuo.model;

import java.io.Serializable;
import java.util.List;

import com.fangshuo.lib4fangshuo.annotation.FieldNote;
import com.fangshuo.lib4fangshuo.annotation.PojoNote;
/**
 * 
* Copyright: Copyright (c) 2018 Jun_Zhou
* 
* @ClassName: ResList.java
* @Description: 封装了分页信息的list对象;
* 
* @version: v1.0.0
* @author: JunZhou
* @Email: 1769676159@qq.com
* @Site: CERNO
* @date: 2018年9月29日 下午5:03:49
 */
@PojoNote(desc="返回对象")
public class ResList<T> implements Serializable
{
	private static final long serialVersionUID = 201703160101009002L;

	// 分页信息，结果数据
	@FieldNote(desc="页大小")
	private int pageRow = 0;
	@FieldNote(desc="起始页")
	private int startPage = 0;
	@FieldNote(desc="总页数")
	private long totalRow = 0;
	@FieldNote(desc="返回对象")
	private List<T> list;

	public ResList( List<T> list )
	{
		this.list = list;
		totalRow = (list == null) ? 0 : list.size();
	}
	
	public ResList()
	{
		
	}

	public int getPageRow()
	{
		return pageRow;
	}

	public void setPageRow(int pageRow) 
	{
		this.pageRow = pageRow;
	}

	public int getStartPage()
	{
		return startPage;
	}

	public void setStartPage(int startPage)
	{
		this.startPage = startPage;
	}

	public long getTotalRow()
	{
		return totalRow;
	}

	public void setTotalRow(long totalRow)
	{
		this.totalRow = totalRow;
	}

	public List<T> getList()
	{
		return list;
	}

	public void setList(List<T> list)
	{
		this.list = list;
	}

}
