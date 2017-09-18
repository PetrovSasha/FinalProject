/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itstep.service;

import java.util.List;
import org.itstep.pojo.Group;

/**
 *
 * @author admin
 */
public interface GroupService {

    public Group getGroup(String groupName);

    public Group createAndUpdateGroup(Group group);

    public void deleteGroup(String groupName);

    List<Group> findAllByCourse(int course);

    public boolean isUnique(Group group);
}
