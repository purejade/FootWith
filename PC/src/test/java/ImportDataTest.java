import edu.thu.cslab.footwith.server.SiteManager;
import edu.thu.cslab.footwith.server.Site;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: roselone
 * Date: 3/15/13
 * Time: 10:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class ImportDataTest {
//    @Test
//    public void import4A() throws IOException, SQLException {
//        String fileName   ="4A.txt";
//        importData im=new importData();
//        im.importSite(new constant().PROJECT_PATH + "data/" + fileName);
//    }
//    @Test
//    public void import5A()throws IOException, SQLException {
//        String fileName="5A.txt";
//        importData im=new importData();
//        im.importSite2(new constant().PROJECT_PATH + "data/" + fileName);
//    }
//    @Test
//    public void importTest(){
//        Site site=new Site("中文1","尼玛",3);
//        SiteManager sm=new SiteManager();
//        try {
//            sm.addSite(site);
//        } catch (SQLException e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//    }
    @Test
    public void readSite() throws SQLException {
        SiteManager sm=new SiteManager();
        Vector<Site> sites=sm.getAllSite();
        for (int i=0;i<sites.size();i++){
            System.out.println(sites.elementAt(i).getSiteName());
        }
    }

}