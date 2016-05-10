package org.GodMode.TestManager.service.impl;



import org.GodMode.TestManager.dao.impl.TestMarksDaoImpl;
import org.GodMode.TestManager.entities.TestMarks;
import org.GodMode.TestManager.service.TestMarksService;

import java.util.List;

/**
 * Created by Natalie on 11-May-16.
 */
public class TestMarksServiceImpl implements TestMarksService{
    @Autowired
    TestMarksDaoImpl testMarksDaoDao;

    public List<TestMarks> findAll() {
        return testMarksDaoDao.findAll();
    }

    public TestMarks find(Long id) {
        return testMarksDaoDao.find(id);
    }

    public void saveOrUpdate(TestMarks entry) {
        testMarksDaoDao.saveOrUpdate(entry);
    }

    public void delete(TestMarks entry) {
        testMarksDaoDao.delete(entry);
    }
}
