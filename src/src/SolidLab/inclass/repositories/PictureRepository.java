package src.SolidLab.inclass.repositories;

import src.SolidLab.inclass.resources.Picture;
import src.SolidLab.inclass.resources.Resource;

public class PictureRepository implements ResourceRepository {
    @Override
    public Resource fetchOne() {
        return new Picture();
    }
}
