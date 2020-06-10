package com.board.service;

import java.util.List;

import com.board.domain.GoodsJoinCate;
import com.board.domain.ReplyListVO;
import com.board.domain.ReplyVO;

public interface ShopService {


	public List<GoodsJoinCate> list(int cateCode,int level) throws Exception;
	
	public GoodsJoinCate goodsView(int gdsNum) throws Exception;
	
	public void registerReply(ReplyVO reply)throws Exception;
	
	public List<ReplyListVO> replyList(int gdsNum) throws Exception;
	
	public void deleteReply(ReplyVO reply) throws Exception;
	public String idCheck(int repNum) throws Exception;
}
