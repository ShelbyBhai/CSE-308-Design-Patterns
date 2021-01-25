import java.util.List;

public class File extends FileGeneral {
    private String FileName;
    private String FileType = "File";
    private String DirectoryPath;
    public File(String fileName) {
        FileName = fileName;
    }
    public void setFileName(String fileName) {
        FileName = fileName;
    }
    public void setFileType(String fileType) {
        FileType = fileType;
    }
    public void setDirectoryPath(String directoryPath) {
        DirectoryPath = directoryPath;
    }
    @Override
    public String getFileName() {
        return FileName;
    }
    @Override
    public String getFileType() {
        return FileType;
    }
    @Override
    public String getDirectoryPath() {
        return DirectoryPath;
    }
    @Override
    public int getComponent_count() {
        return 1;
    }
    @Override
    public void list() {
        System.out.println(FileName);
    }
    @Override
    public void details() {
        System.out.println("Details About " + getFileName());
        System.out.println("Name :" + getFileName());
        System.out.println("Type :" + getFileType());
        System.out.println("Directory :" + getDirectoryPath());
        System.out.println("Component_count :" + getComponent_count());
    }
    public  List<FileGeneral> getFileGenerals(){
        return null;
    }

    @Override
    public void add(FileGeneral fileGeneral) {
    }
    @Override
    public void remove(FileGeneral fileGeneral) {
    }
}
