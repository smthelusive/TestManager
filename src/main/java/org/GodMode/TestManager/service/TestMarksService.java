package org.GodMode.TestManager.service;

import org.GodMode.TestManager.entities.TestMarks;

import java.util.List;

/**
 * Created by Natalie on 11-May-16.
 */
public interface TestMarksService {

    List<TestMarks> findAll();
    TestMarks find(Long id);
    void saveOrUpdate(TestMarks entry);
    void delete(TestMarks entry);
}
