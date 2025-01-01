package com.jh.tds.tms.registry;

import com.jh.tds.tms.model.Sequence;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SequenceRepository extends MongoRepository<Sequence, String> {
}
