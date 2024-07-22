package org.example.companymanagement.mapper;

import org.example.companymanagement.model.dto.request.PositionRequest;
import org.example.companymanagement.model.dto.response.EmployeeResponse;
import org.example.companymanagement.model.dto.response.PositionResponse;
import org.example.companymanagement.model.entity.Employee;
import org.example.companymanagement.model.entity.Position;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PositionMapper {
    PositionResponse toPositionResponse(Position position);
    List<PositionResponse> toPositionResponse(List<Position> position);
    Position toPosition(PositionRequest positionRequest);
    Position toPosition(Long id, PositionRequest positionRequest);

}
