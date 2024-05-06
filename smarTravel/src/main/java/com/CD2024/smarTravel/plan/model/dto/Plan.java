package com.CD2024.smarTravel.plan.model.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class Plan {
    private Long planId;
    private String userId;
    private String title;
    private String description;
    private List<PlaceInfo> placeInfoList;
    public void updatePlaceInfoList(List<PlaceInfo> placeInfoList) {
        this.placeInfoList = placeInfoList;
    }
}
