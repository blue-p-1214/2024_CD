package com.CD2024.smarTravel.board.model.mapper;

import com.github.pagehelper.Page;
import com.CD2024.smarTravel.board.model.dto.Board;
import org.apache.ibatis.annotations.Mapper;


import java.util.Optional;

@Mapper
public interface BoardMapper {
    // ToDo 게시판 CRUD
    Optional<Board> selectBoard(int boardId);
    int insertBoard(Board board);
    int updateBoard(Board board);
    int deleteBoard(int boardId);
    int updateHit(int boardId);
    Page<Board> selectAll();

}
