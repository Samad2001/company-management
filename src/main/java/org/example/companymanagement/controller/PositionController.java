package org.example.companymanagement.controller;

import lombok.RequiredArgsConstructor;
import org.example.companymanagement.model.dto.request.PositionRequest;
import org.example.companymanagement.model.dto.response.PositionResponse;
import org.example.companymanagement.service.PositionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/positions")
@RequiredArgsConstructor
public class PositionController {

    private final PositionService positionService;

    @GetMapping
    public ResponseEntity<List<PositionResponse>> getAllPositions() {
        List<PositionResponse> positions = positionService.getAllPositions();
        return ResponseEntity.ok().body(positions);
    }

    @GetMapping("/getby-id/{positionId}")
    public ResponseEntity<PositionResponse> getPositionById(@PathVariable("positionId") Long positionId) {
    PositionResponse response = positionService.getPositionById(positionId);
    return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Void> addPosition(@RequestBody PositionRequest positionRequest) {
        positionService.addPosition(positionRequest);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/positionId/{positionId}")
    public ResponseEntity<Void> updatePosition(@PathVariable("positionId") Long positionId,
                                               @RequestBody PositionRequest positionRequest) {

        positionService.updatePosition(positionId, positionRequest);
        return ResponseEntity.ok().build();
    }


    @DeleteMapping("/delete/{positionId}")
    public ResponseEntity<Void> deletePosition(@PathVariable Long positionId) {
    positionService.deletePosition(positionId);
    return ResponseEntity.ok().build();
    }



}
