package com.tumo.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public class FeedDto {
	private int boardIdx;
	private int userIdx;
	private String nickname;
	private int likes;
	private String stock;
	private String title;
	private String content;
	private String createAt;
	private String updateAt;

	public int getBoardIdx() {
		return boardIdx;
	}

	public void setBoardIdx(int boardIdx) {
		this.boardIdx = boardIdx;
	}

	public int getUserIdx() {
		return userIdx;
	}

	public void setUserIdx(int userIdx) {
		this.userIdx = userIdx;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	public String getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public FeedDto() {
		super();
	}

	public FeedDto(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	@JsonCreator
	public FeedDto(int userIdx, String nickname, String stock, String title, String content) {
		super();
		this.userIdx = userIdx;
		this.nickname = nickname;
		this.stock = stock;
		this.title = title;
		this.content = content;
	}

	public FeedDto(int boardIdx, int userIdx, String stock, String title, String content) {
		super();
		this.boardIdx = boardIdx;
		this.userIdx = userIdx;
		this.stock = stock;
		this.title = title;
		this.content = content;
	}

	public FeedDto(int boardIdx, int userIdx, String nickname, int likes, String stock, String title, String content,
			String createAt, String updateAt) {
		super();
		this.boardIdx = boardIdx;
		this.userIdx = userIdx;
		this.nickname = nickname;
		this.likes = likes;
		this.stock = stock;
		this.title = title;
		this.content = content;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	@Override
	public String toString() {
		return "FeedDto [boardIdx=" + boardIdx + ", userIdx=" + userIdx + ", nickname=" + nickname + ", likes=" + likes
				+ ", stock=" + stock + ", title=" + title + ", content=" + content + ", createAt=" + createAt
				+ ", updateAt=" + updateAt + "]";
	}

}
