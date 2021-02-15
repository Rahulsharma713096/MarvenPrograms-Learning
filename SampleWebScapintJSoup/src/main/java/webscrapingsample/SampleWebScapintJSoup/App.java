package webscrapingsample.SampleWebScapintJSoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Weclcome" );
        try {
        	Document doc = Jsoup.connect("https://www.google.co.in/?hl=en&gws_rd=cr&ei=DoCEWfDeF4O50ATxlrCQAg").get();
        	log(doc.title());
        	Elements newsHeadlines = doc.select("#mp-itn b a");
        	for (Element headline : newsHeadlines) {
        	  log("%s\n\t%s", 
        	    headline.attr("title"), headline.absUrl("href"));
        	}
        	
        	
		} catch (Exception e) {
			System.out.println("Some Error occured \n Exit");
			System.exit(0);
		}
    }

	private static void log(String string, String attr, String absUrl) {
        System.out.println("String  -->"+string);
        System.out.println("Attributes -->"+attr);
        System.out.println("Absolute Url  --->"+absUrl);
		
	}

	private static void log(String title) {
		System.out.println("Title :  "+title);
		
	}
}
