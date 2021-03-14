package com.bta.casino.repository;

import com.bta.casino.model.SimpleGameResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleGameResultRepository extends CrudRepository<SimpleGameResult,Long> {
}
