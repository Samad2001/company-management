package org.example.companymanagement.service;

import org.example.companymanagement.model.dto.request.PositionRequest;
import org.example.companymanagement.model.dto.response.PositionResponse;

import java.util.List;

public interface PositionService {

    List<PositionResponse> getAllPositions();
    PositionResponse getPositionById(Long positionId);
    void addPosition(PositionRequest positionRequest);
    void updatePosition(Long positionId, PositionRequest positionRequest);
    void deletePosition(Long positionId);
}
