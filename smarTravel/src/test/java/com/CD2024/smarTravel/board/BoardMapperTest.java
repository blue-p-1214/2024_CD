package com.CD2024.smarTravel.board;

import com.CD2024.smarTravel.board.model.mapper.BoardMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardMapperTest {
    @Autowired
    BoardMapper boardMapper;

    @Test
    void testBoardMapperLoad(){
        assertNotNull(boardMapper);
    }

    // ToDo BoardMapper Test 작성



}
