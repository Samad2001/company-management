package org.example.companymanagement.service.lmpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.companymanagement.mapper.PositionMapper;
import org.example.companymanagement.model.dto.request.PositionRequest;
import org.example.companymanagement.model.dto.response.PositionResponse;
import org.example.companymanagement.model.entity.Employee;
import org.example.companymanagement.model.entity.Position;
import org.example.companymanagement.repository.PositionRepository;
import org.example.companymanagement.service.PositionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class PositionServicelmpl implements PositionService {

    private final PositionRepository positionRepository;
    private final PositionMapper positionMapper;

    @Override
    public List<PositionResponse> getAllPositions() {
        List<Position> positions = positionRepository.findAll();
        List<PositionResponse> positionResponseList = new ArrayList<>();
        Position position = new Position();
        position.setPositionName(position.getPositionName());
        position.setPostionSalary(position.getPostionSalary());

        return positionResponseList;
    }

    @Override
    public PositionResponse getPositionById(Long positionId) {
        Optional<Position> optionalPosition = positionRepository.findById(positionId);
        return optionalPosition
                .map(positionMapper::toPositionResponse)
                .orElse(null);
    }

    @Override
    public void addPosition(PositionRequest positionRequest) {
        log.info("addPosition request received. PositionRequest: {}", positionRequest);
        Position position = positionMapper.toPosition(positionRequest);
        positionRepository.insert(position);
        log.info("Position added successfully.");
    }

    @Override
    public void updatePosition(Long positionId, PositionRequest positionRequest) {
    Position position = positionMapper.toPosition(positionId,positionRequest);
    positionRepository.update(position);

    }

    @Override
    public void deletePosition(Long positionId) {
        positionRepository.deleteById(positionId);
    }
}
