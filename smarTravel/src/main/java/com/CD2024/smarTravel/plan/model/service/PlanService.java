package com.CD2024.smarTravel.plan.model.service;


import com.CD2024.smarTravel.plan.model.dto.PlanBoard;
import com.CD2024.smarTravel.plan.model.dto.PlanDay;

import java.util.List;

public interface PlanService {
    List<PlanBoard> listMyPlan(String userId);
    int registPlanBoard(PlanBoard planBoard);
    int registPlanDay(List<PlanDay> planDays);
}
