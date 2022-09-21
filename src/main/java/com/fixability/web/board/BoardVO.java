package com.fixability.web.board;

import java.util.Date;

public class BoardVO {
	private int board_id;
	private int b_user_id;
	private String board_writer;
	private String board_title;
	private String board_contetn;
	private Date board_reg_date;
	private int board_see;
	
	public int getBoard_id() {
		return board_id;
	}
	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}
	public int getB_user_id() {
		return b_user_id;
	}
	public void setB_user_id(int b_user_id) {
		this.b_user_id = b_user_id;
	}
	public String getBoard_writer() {
		return board_writer;
	}
	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_contetn() {
		return board_contetn;
	}
	public void setBoard_contetn(String board_contetn) {
		this.board_contetn = board_contetn;
	}
	public Date getBoard_reg_date() {
		return board_reg_date;
	}
	public void setBoard_reg_date(Date board_reg_date) {
		this.board_reg_date = board_reg_date;
	}
	public int getBoard_see() {
		return board_see;
	}
	public void setBoard_see(int board_see) {
		this.board_see = board_see;
	}
	
	
	
}
