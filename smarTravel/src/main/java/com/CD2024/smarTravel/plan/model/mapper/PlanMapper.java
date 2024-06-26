package com.CD2024.smarTravel.plan.model.mapper;

import com.CD2024.smarTravel.plan.model.dto.PlanBoard;
import com.CD2024.smarTravel.plan.model.dto.PlanDay;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface PlanMapper {
    PlanBoard selectPlanBoardByPlanId(int planId);
    List<PlanBoard> selectPlanBoard();
    List<PlanBoard> selectPlanBoardByUserId(String userId);
    PlanDay selectPlanDay(int dayId);
    List<PlanDay> selectPlanDayByPlanId(int planId);

    int insertPlanDay(PlanDay planDay);
    int insertPlanBoard(PlanBoard planBoard);

    int updatePlanDay(PlanDay planDay);
    int updatePlanBoard(PlanBoard planBoard);

    int deletePlanByPlanId(int planId);
}
