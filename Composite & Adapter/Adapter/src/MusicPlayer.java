import java.util.Scanner;
public class MusicPlayer {
    public static void main(String[] args) {
    PlayList playList = new PlayList();
    while(true)
    {
        System.out.println("1.Add new song 2.Add playlist to player 3.Display 4.Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        AudioPlayer audioPlayer;
        if(choice == 1)
        {
            audioPlayer = new AudioPlayer();
            String name;
            String type;
            int filesize;
            int time;
            name = scanner.next();
            type = scanner.next();
            filesize = scanner.nextInt();
            time = scanner.nextInt();
            audioPlayer.setMusicName(name);
            audioPlayer.setMusicType(type);
            audioPlayer.setMusicSize(filesize);
            audioPlayer.setDuration(time);
            audioPlayer.play(name,type,filesize,time);
            playList.addItem(name,type,filesize,time);
        }
        else if(choice == 2){
            System.out.println("Give the Elapsed time : ");
            int etime = scanner.nextInt();
            int totalTime = 0;
            for(int i = 0;i<playList.p.size();i++){
                totalTime =+ playList.p.get(i).getDuration();
            }
            if(etime>totalTime){
                playList.p.clear();
            }
            else{
                System.out.println("Not allowed,a playlist is running");
            }
        }
        else if(choice == 3)
        {
            for(int i=0;i<playList.p.size();i++)
            {
                System.out.println(playList.p.get(i).getMusicName()+" "+playList.p.get(i).getMusicType()+" "+playList.p.get(i).getMusicSize()+" MB "+playList.p.get(i).getDuration()+" sec");
            }
        }
        else if(choice == 4)
        {
            break;
        }
    }
    }
}
