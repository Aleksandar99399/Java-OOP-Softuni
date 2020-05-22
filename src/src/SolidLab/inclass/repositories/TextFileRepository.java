package src.SolidLab.inclass.repositories;

import src.SolidLab.inclass.resources.Resource;
import src.SolidLab.inclass.resources.TextFile;

public class TextFileRepository implements ResourceRepository {
    @Override
    public Resource fetchOne() {
        return new TextFile();
    }
}
