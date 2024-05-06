package com.CD2024.smarTravel.board;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.CD2024.smarTravel.board.model.dto.Board;
import com.CD2024.smarTravel.board.model.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@Slf4j
public class BoardListTest {

    @Autowired
    BoardMapper boardMapper;

    @Test
    @Transactional
    @DisplayName("페이징 처리")
    void BoardListPage() {
        // given
        int perPage = 1;
        int pageNum = 1;
        // when
        PageHelper.startPage(pageNum,perPage);
        Page<Board> boards = boardMapper.selectAll();

        // then
        System.out.println("boards.getResult() = " + boards.getResult());
        assertEquals(boards.getPageNum(),pageNum);
    }

}
