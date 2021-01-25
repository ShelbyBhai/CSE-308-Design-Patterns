import java.util.List;

public abstract class FileGeneral {
    public abstract String getFileName();
    public abstract String getFileType();
    public abstract String getDirectoryPath();
    public abstract int getComponent_count();
    public  abstract void setDirectoryPath(String directoryPath);
    public abstract void list();
    public abstract void details();
    public abstract void add(FileGeneral fileGeneral);
    public abstract void remove(FileGeneral fileGeneral);
    public abstract List<FileGeneral> getFileGenerals();
    static String helpinlist = "------";
}
