package com.CD2024.smarTravel.board.service;

import com.github.pagehelper.Page;
import com.CD2024.smarTravel.board.model.dto.Board;
import com.CD2024.smarTravel.board.model.dto.BoardRequestDto;


public interface BoardService {
    Board detail(int boardId);

    int regist(BoardRequestDto boardRequestDto, String userId);

    int modify(int boardId, BoardRequestDto boardRequestDto);

    int delete(int boardId);

    int updateHit(int boardId);

    Page<Board> getBoardList();
}
