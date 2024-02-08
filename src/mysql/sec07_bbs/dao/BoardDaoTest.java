package mysql.sec07_bbs.dao;

import mysql.sec07_bbs.entity.Board;

public class BoardDaoTest {

	public static void main(String[] args) {
		BoardDao bDao = new BoardDao();

		Board b = bDao.getBoard(1);
		System.out.println(b);
	}

}
