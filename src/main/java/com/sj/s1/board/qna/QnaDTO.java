package com.sj.s1.board.qna;

import java.util.List;

import com.sj.s1.board.BoardDTO;
import com.sj.s1.board.notice.NoticeFileDTO;

public class QnaDTO extends BoardDTO {
	private List<QnaFileDTO> fileDTOs;
	private Long ref;
	private Long step;
	private Long depth;
	
	public List<QnaFileDTO> getFileDTOs() {
		return fileDTOs;
	}
	public void setFileDTOs(List<QnaFileDTO> fileDTOs) {
		this.fileDTOs = fileDTOs;
	}
	public Long getRef() {
		return ref;
	}
	public void setRef(Long ref) {
		this.ref = ref;
	}
	public Long getStep() {
		return step;
	}
	public void setStep(Long step) {
		this.step = step;
	}
	public Long getDepth() {
		return depth;
	}
	public void setDepth(Long depth) {
		this.depth = depth;
	}
	
}
