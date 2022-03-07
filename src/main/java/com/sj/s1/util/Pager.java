package com.sj.s1.util;

public class Pager {
	//page당 보여줄  row 갯수
	private Long perPage;
	//page번호
	private Long page;
	//시작번호
	private Long startRow; //1페이지에 1번부터 10번 1번 startRow 10번 lastRow
	//끝번호
	private Long lastRow;
	//검색변수
	private String search;
	private String kind;
	
	//----------------------- jsp사용변수
	private Long startNum; // 하단에 1페이지~10페이지 1페이지 startnum
	private Long lastNum;
	private boolean pre;
	private boolean next;
	public void makeRow() {
		this.startRow=(this.getPage()-1)*this.getPerPage()+1;
		this.lastRow=this.getPage()*this.getPerPage();
	}
	
	public void makeNum(Long totalCount) {
		//2.전체 page의 갯수 구하기
		Long totalPage= totalCount/this.getPerPage();
		if(totalCount%this.getPerPage()!=0) {
			totalPage++;
		}
		//3. block당 갯수
		Long perBlock =10L;
		//4. 전체 block 갯수 구하기
		Long totalBlock = totalPage/perBlock;
		if(totalPage%perBlock!=0) {
			totalBlock++;
		}
		//5. page번호로 현재 몇번째 block인지 구하기
		Long curBlock = this.getPage()/perBlock;
		if(this.getPage()%perBlock!=0) {
			curBlock++;
		}
		//6. curBlock로 startNum lastNum을 구하기
		this.startNum= (curBlock-1)*perBlock+1L;
		this.lastNum=curBlock*perBlock;
		//8. 이전,다음 블럭 유무
		this.next=true;
		this.pre=false;
		if(totalBlock==curBlock) {
			this.next=false;
		}
		if(curBlock>1) {
			this.pre=true;
		}
		//현재 블럭이 마지막 블럭번호와 같다면
		if(curBlock==totalBlock) {
			this.lastNum=totalPage;
		}
	}
	
	public Long getPerPage() {
		if(this.perPage==null||this.perPage<1) {
			this.perPage=10L;
		}
		return perPage;
	}
	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}
	public Long getPage() {
		if(this.page==null||this.page<1) {
			this.page=1L;
		}
		return page;
	}
	public void setPage(Long page) {
		this.page = page;
	}
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}

	public Long getStartNum() {
		return startNum;
	}

	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}

	public Long getLastNum() {
		return lastNum;
	}

	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}

	public boolean isPre() {
		return pre;
	}

	public void setPre(boolean pre) {
		this.pre = pre;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public String getSearch() {
		if(this.search==null) {
			this.search="";
		}
	//	this.search="%"+this.search+"%";
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
}
