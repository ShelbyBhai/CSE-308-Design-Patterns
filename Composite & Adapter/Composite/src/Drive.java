import java.util.ArrayList;
import java.util.List;
public class Drive extends FileGeneral {
    private String FileName;
    private String FileType = "Drive";
    private String DirectoryPath;
    private int Component_count = 0;
    public Drive(String fileName) {
        FileName = fileName;
        DirectoryPath = fileName + ":";
    }
    public void setFileName(String fileName) {
        FileName = fileName;
    }
    public void setFileType(String fileType) {
        FileType = fileType;
    }
    public void setDirectoryPath(String directoryPath){
        DirectoryPath = directoryPath;
    }
    public void setComponent_count(int component_count) {
        Component_count = component_count;
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
        for(int i = 0;i<fileGenerals.size();i++){
            FileGeneral fileGeneral = fileGenerals.get(i);
            Component_count = Component_count + fileGeneral.getComponent_count();
        }
        return Component_count;
    }
    @Override
    public void list() {
        System.out.println(DirectoryPath);

        for(int i = 0;i<fileGenerals.size();i++){
            System.out.print(helpinlist);
            fileGenerals.get(i).list();
        }
    }
    @Override
    public void details() {
        System.out.println("Details About " + getFileName());
        System.out.println("Name: " + getFileName());
        System.out.println("Type: " + getFileType());
        System.out.println("Directory: " + getDirectoryPath());
        System.out.println("Component_count: " + getComponent_count());
    }
    public List<FileGeneral>fileGenerals = new ArrayList<FileGeneral>();

    public List<FileGeneral> getFileGenerals() {
        return fileGenerals;
    }

    @Override
    public void add(FileGeneral fileGeneral) {
        if(!fileGeneral.getFileType().equalsIgnoreCase("drive")){
            fileGeneral.setDirectoryPath(DirectoryPath+"\\"+fileGeneral.getFileName());
            fileGenerals.add(fileGeneral);
        }
    }

    @Override
    public void remove(FileGeneral fileGeneral) {
        fileGenerals.remove(fileGeneral);
    }
}
