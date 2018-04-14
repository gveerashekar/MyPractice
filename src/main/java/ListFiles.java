import org.apache.hadoop.fs.*;
import sun.nio.fs.WindowsFileSystemProvider;
import org.apache.hadoop.conf.Configuration;
import java.io.IOException;



public class ListFiles {

      public  static void main(String args[]) throws IOException {
        Configuration configuration= new Configuration();

        FileSystem winfs=FileSystem.get(configuration);

        Path path=winfs.getHomeDirectory();

        FileStatus[] filestatus=winfs.listStatus(path);

        Path[] paths= FileUtil.stat2Paths(filestatus);

        System.out.println("List of files");
        for (Path pt: paths)
        {
            System.out.println(pt);
        }


    }
}
