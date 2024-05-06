package com.CD2024.smarTravel.plan.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlaceInfo {
    private Long placeInfoId;
    private Long planId;
    private String startTime;
    private String endTime;
    private String planDay;
    private String pictureUrl;
    private int cost;
    private Long contentId;
}

