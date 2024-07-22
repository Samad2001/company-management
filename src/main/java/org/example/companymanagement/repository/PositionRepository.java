package org.example.companymanagement.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.companymanagement.model.entity.Position;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PositionRepository {

    List<Position> findAll();
    Optional<Position> findById(@Param("positionId") Long positionId);
    void insert(Position position);
    void update(Position position);
    void deleteById(@Param("positionId") Long positionId);
}
