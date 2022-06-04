package SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class StudentHandler extends DefaultHandler {
    private List<Student> students = new ArrayList<>();
    private Student currentStudent;
    private boolean isFirstName = false;
    private boolean isLastName = false;
    private boolean isNickName = false;
    private boolean isMarks = false;

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case "student":
                currentStudent = new Student();
                String rollNo = attributes.getValue("rollno");
                currentStudent.setRollno(Integer.parseInt(rollNo));
                break;
            case "firstname":
                isFirstName = true;
                break;
            case "lastname":
                isLastName = true;
                break;
            case "nickname":
                isNickName = true;
                break;
            case "mark":
                isMarks = true;
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "student":
                students.add(currentStudent);
                break;
            case "firstname":
                isFirstName = false;
                break;
            case "lastname":
                isLastName = false;
                break;
            case "nickname":
                isNickName = false;
                break;
            case "mark":
                isMarks = false;
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String content = new String(ch, start, length);
        if (isFirstName) {
            currentStudent.setFirstName(content);
        }
        if (isLastName) {
            currentStudent.setLastName(content);
        }
        if (isNickName) {
            currentStudent.setNickName(content);
        }
        if (isMarks) {
            currentStudent.setMark(Integer.parseInt(content));
        }
    }
}
