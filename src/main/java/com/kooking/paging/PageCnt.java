package com.kooking.paging;

public class PageCnt {
	private static int pageCnt; //총페이지 수Math.ceil(전체레코드수 /pagesize) 
	public static int pagesize = 8;// 한 페이지 당 5개 출력물
	public static int pageNo=1;//현재 페이지번호
	
	public  int blockcount=3;//한 블럭당 보여질 페이지 개수
	
	//String keyField;
	
	public PageCnt() {
		super();
	}

	public PageCnt(int pageCnt) {
		super();
		PageCnt.pageCnt = pageCnt;
	}

	public int getPageCnt() {
		return pageCnt;
	}

	public void setPageCnt(int pageCnt) {
		PageCnt.pageCnt = pageCnt;
	}

	public static int getPagesize() {
		return pagesize;
	}

	public static void setPagesize(int pagesize) {
		PageCnt.pagesize = pagesize;
	}

	public static int getPageNo() {
		return pageNo;
	}

	public static void setPageNo(int pageNo) {
		PageCnt.pageNo = pageNo;
	}

	public int getBlockcount() {
		return blockcount;
	}

	public void setBlockcount(int blockcount) {
		this.blockcount = blockcount;
	}

	
}
