package src.SolidLab.inclass;

import src.SolidLab.inclass.repositories.ResourceRepository;
import src.SolidLab.inclass.resources.Resource;
import src.SolidLab.inclass.users.User;

public class UserService {

    private ResourceRepository resourceRepository;

    UserService(ResourceRepository resourceRepository){

        this.resourceRepository = resourceRepository;
    }

    public void readResourceFor(User user){
        Resource resource=resourceRepository.fetchOne();
        user.read(resource);
    }
}
