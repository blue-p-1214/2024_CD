package com.CD2024.smarTravel.board.model.dto;

import lombok.*;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardResponseDto {
    private int boardId;
    private String userId;
    private String subject;
    private String content;
    private int hit;
    private String currentUpdate;

    public BoardResponseDto(Board board) {
        this.boardId = board.getBoardId();
        this.userId = board.getUserId();
        this.subject = board.getSubject();
        this.content = board.getContent();
        this.hit = board.getHit();
        this.currentUpdate = board.getCurrentUpdate();
    }
}
