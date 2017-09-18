/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itstep.service;

import java.util.List;
import org.itstep.pojo.Group;
import org.itstep.pojo.Lesson;

/**
 *
 * @author admin
 */
public interface LessonService {

    Lesson saveAndUpdate(Lesson lesson);

    void delete(Long id);

    Lesson getOneByGroupAndStartTime(String group, Long startTime);

    Lesson getOneByTeacherAndStartTime(String teacher, Long startTime);

    List<Lesson> getLessonsForGroupForPeriod(String group, Long start, Long end);

    List<Lesson> getLessonsForCourseForPeriod(Integer course, Long start, Long end);

    List<Lesson> getLessonsForTeacherForPeriod(String teacher, Long start, Long end);

    public boolean isUnique(Lesson lesson);
}
