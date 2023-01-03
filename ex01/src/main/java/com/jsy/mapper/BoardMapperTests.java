package com.jsy.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jsy.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper mapper;
	
	
	
	
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
	
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("aaa");
		board.setContent("bbb");
		board.setWriter("ccc");
		
		mapper.insert(board);
		log.info(board);
	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO board = new BoardVO();
		board.setTitle("selectKey");
		board.setContent("SelectKey");
		board.setWriter("test03");
		mapper.insertSelectKey(board);
		log.info(board);
	}
	
	
	public void testRead() {
		BoardVO board = mapper.read(4L);
		log.info(board);
	}
	
	
	public void testDelete() {
		int count = mapper.delete(7L);
		log.info("Delete count : " + count);
	}
	
	
	public void testUpdate() {
		BoardVO board = new BoardVO();
		
		board.setBno(7L);
		board.setTitle("수정된것");
		board.setContent("수정된것");
		board.setWriter("수정된것");
		
		int count = mapper.update(board);
		log.info(count);

	}

}
