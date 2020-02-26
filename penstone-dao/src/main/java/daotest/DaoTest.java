package daotest;

import entitytest.EntityTest;

import javax.swing.text.html.parser.Entity;

public class DaoTest {
    public String showDao() {
        EntityTest entityTest = new EntityTest();
        return entityTest.showEntity()+"I'm Dao";
    }
}
