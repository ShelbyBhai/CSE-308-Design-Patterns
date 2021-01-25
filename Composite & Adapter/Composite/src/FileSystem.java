import java.util.Scanner;
public class FileSystem {
    public static FileGeneral check(String dir,FileGeneral fileGeneral){
        if(fileGeneral.getDirectoryPath().equalsIgnoreCase(dir)){
            return fileGeneral;
        }
        for(int i = 0;i<fileGeneral.getFileGenerals().size();i++){
            return check(dir,fileGeneral.getFileGenerals().get(i));
        }
        return null;
    }
    public static void main(String[] args) {
       /* while (true) {
            System.out.println("1.Create new Drive 2.Create new Folder");
            System.out.println("3.Add Folder 4.Add File 5.Remove Folder 6.Remove File 7.press e to exit");
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("1")) {
                String userDriveName = sc.nextLine();
                FileGeneral fileGeneral = new Drive(userDriveName);
            }
            if (userInput.equalsIgnoreCase("2")) {
                String userFolderName = sc.nextLine();
                FileGeneral fileGeneral = new Folder(userFolderName);
            }
            if(userInput.equalsIgnoreCase("7")){
                break;
            }
        }*/
       FileGeneral drive1 = new Drive("C");
       FileGeneral folder1 = new Folder("a");
       FileGeneral folder2 = new Folder("b");
       FileGeneral file1 = new File("tia");
       FileGeneral file2 = new File("plz");
       FileGeneral file3 = new File("okay");
       drive1.add(folder1);
       drive1.add(file1);
       folder1.add(file2);
       folder2.add(file3);
       drive1.add(folder2);
       drive1.details();
       System.out.println();
       file3.details();
       System.out.println();
       folder1.list();




    }
}
