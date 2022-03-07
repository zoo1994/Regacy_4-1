package com.sj.s1.util;

public class Pager_2 {
		//page당 보여줄  row 갯수
		private Long perPage;
		//page번호
		private Long page;
		//시작번호
		private Long startRow;
		//끝번호
		private Long lastRow;
		//검색변수
		private String search;
		private String kind;
		
		//----------------------- jsp사용변수
		private Long startNum;
		private Long lastNum;
		private boolean pre;
		private boolean next;
		
		public void makeRow() {
			this.startRow=1+this.getPerPage()*(this.page-1);
			this.lastRow=this.getPage()*this.getPerPage();
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
		public String getSearch() {
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
		
}
