package com.team.landhouse.utils;

/**
 * @author Ocean
 *
 */
public class SearchPage {
	int pageSize;
	int pageNumber;
	String textSearch;
	int boardId;

	/**
	 * @param pageSize
	 * @param pageNumber
	 * @param textSearch
	 */
	public SearchPage(int pageSize, int pageNumber, String textSearch) {
		super();
		this.pageSize = pageSize;
		this.pageNumber = pageNumber;
		this.textSearch = textSearch;
	}
	/**
	 * @return pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize
	 * 		the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return pageNumber
	 * 		the pageNumber to set
	 */
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	 * @param pageNumber
	 */
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	/**
	 * @return textSearch
	 */
	public String getTextSearch() {
		return textSearch;
	}

	/**
	 * @param textSearch
	 * 		the textSearch to set
	 */
	public void setTextSearch(String textSearch) {
		this.textSearch = textSearch;
	}

	/**
	 * @return
	 */
	public int getBoardId() {
		return boardId;
	}

	/**
	 * @param boardId
	 */
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
}
