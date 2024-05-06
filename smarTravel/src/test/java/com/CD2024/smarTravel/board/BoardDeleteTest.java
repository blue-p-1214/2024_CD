package com.CD2024.smarTravel.board;

import com.CD2024.smarTravel.board.model.mapper.BoardMapper;
import com.CD2024.smarTravel.board.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
public class BoardDeleteTest {


    @Autowired
    BoardMapper boardMapper;

    @Autowired
    BoardService boardService;

    @Test
    @DisplayName("빈 동작 확인")
    void testBoardMapperLoad() {
        assertNotNull(boardMapper);
    }

    @Test
    @DisplayName("board delete 확인")
    @Transactional
    void testBoardUpdate() {
        // given
        int boardId = 5;
        // when
        int result = boardMapper.deleteBoard(boardId);

        // then
        assertEquals(1, result);
        assertFalse(boardMapper.selectBoard(boardId).isPresent());

    }
}
