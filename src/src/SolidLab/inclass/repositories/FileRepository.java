package src.SolidLab.inclass.repositories;

import src.SolidLab.inclass.resources.Filee;
import src.SolidLab.inclass.resources.Resource;

public class FileRepository implements ResourceRepository {
    @Override
    public Resource fetchOne() {
        return new Filee();
    }
}
