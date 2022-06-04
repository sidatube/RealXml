package SAX;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SaxParseDemo {
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            StudentHandler studentHandler = new StudentHandler();
            saxParser.parse(inputFile,studentHandler);
            for (Student student: studentHandler.getStudents()
                 ) {
                System.out.println(student);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
