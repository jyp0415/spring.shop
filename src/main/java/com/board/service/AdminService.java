package com.board.service;

import java.util.List;

import com.board.domain.CategoryVO;
import com.board.domain.GoodsJoinCate;
import com.board.domain.GoodsVO;

public interface AdminService {

	
	public List<CategoryVO> category() throws Exception;
	
	public void register(GoodsVO vo)throws Exception;
	
	public List<GoodsVO> goodslist() throws Exception;
	
	public GoodsJoinCate goodsView(int gdsNum) throws Exception;
	public void goodsModify(GoodsVO vo) throws Exception;
	public void goodsDelete(int gdsNum) throws Exception;
}
