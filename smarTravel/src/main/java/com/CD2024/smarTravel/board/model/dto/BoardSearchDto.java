package com.CD2024.smarTravel.board.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardSearchDto {
    private Integer pageNum;
    private Integer pageSize;
    private String searchType;
    private String searchContent;
}
