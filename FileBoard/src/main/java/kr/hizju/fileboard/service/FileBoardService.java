package kr.hizju.fileboard.service;

import kr.hizju.fileboard.vo.CommVO;
import kr.hizju.fileboard.vo.FileBoardVO;
import kr.hizju.fileboard.vo.PagingVO;

public interface FileBoardService {
	// 1. 목록보기
	PagingVO<FileBoardVO> selectList(CommVO commVO);
	// 2. 내용보기
	FileBoardVO selectByIdx(int idx);
	// 3. 글쓰기
	void insert(FileBoardVO vo);
	// 4. 글 수정하기
	void update(FileBoardVO vo, String[] delFiles, String realPath);
	// 5. 글삭제하기
	void delete(FileBoardVO vo, String realPath);
	
}
