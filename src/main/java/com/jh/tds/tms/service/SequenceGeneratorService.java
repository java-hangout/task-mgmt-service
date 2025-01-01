package com.jh.tds.tms.service;

import com.jh.tds.tms.registry.SequenceRepository;
import com.jh.tds.tms.model.Sequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SequenceGeneratorService {

    @Autowired
    private SequenceRepository sequenceRepository;

    private static final String SEQUENCE_NAME = "task_sequence";

    public String generateTaskId() {
        // Retrieve the current sequence or create a new one if it doesn't exist
      Sequence sequence = sequenceRepository.findById(SEQUENCE_NAME).orElseGet(this::createNewSequence);

        // Generate the task ID based on the current sequence
        int currentSeq = sequence.getSeq();

        // Generate the task ID (starting from task_0001, task_0002, etc.)
        String generatedId = String.format("task_%04d", currentSeq);

        // Increment the sequence counter for future tasks
        sequence.setSeq(currentSeq + 1);

        // Save the updated sequence value to the database
        sequenceRepository.save(sequence);

        // Return the generated task ID
        return generatedId;
    }

    private Sequence createNewSequence() {
        Sequence sequence = new Sequence();
        sequence.setId(SEQUENCE_NAME);
        sequence.setSeq(1);  // Start from task_0001
        return sequenceRepository.save(sequence);
    }
}
