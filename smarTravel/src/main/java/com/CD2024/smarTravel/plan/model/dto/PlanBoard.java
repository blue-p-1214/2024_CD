package com.CD2024.smarTravel.plan.model.dto;

import lombok.*;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class PlanBoard {
    int planId;
    String userId;
    String title;
    Date startDay;
    Date endDay;
    String description;
}
