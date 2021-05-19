package com.tts.formlab.repository;

import com.tts.formlab.model.FormModel;
import org.springframework.data.repository.CrudRepository;

public interface ModelRepository extends CrudRepository<FormModel, Long> {
}
