package interfaces;

import databases.BaseDatabase;

public interface IDataAccess {
    IBaseDatabase database=new BaseDatabase().getDatabase();
}
