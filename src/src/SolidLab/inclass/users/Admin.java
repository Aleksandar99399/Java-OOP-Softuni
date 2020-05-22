package src.SolidLab.inclass.users;

import src.SolidLab.inclass.resources.Resource;

public class Admin implements User {

    @Override
    public void read(Resource resource) {
        System.out.println("reading "+resource.getClass());
    }

}
