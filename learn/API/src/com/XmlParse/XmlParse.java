package com.XmlParse;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlParse {
    public static void main(String[] args) throws DocumentException {
//        1获取一个解析器对象

        SAXReader reader = new SAXReader();
//        2 将xml文件加载到内存中 并返回一个文档对象

        Document read = reader.read(new File("C:\\Java\\workplace\\learn\\API\\xml\\student.xml"));
//        3 获取跟标签
        Element rootElement = read.getRootElement();
//        4 通过根标签来获取student标签
        List elements = rootElement.elements();//空参获取所有子标签
        List<Element> studentelements = rootElement.elements("student");//有参获取指定标签

        ArrayList<xmlStudent> list  = new ArrayList<>();
//        5 遍历集合 得到每一个student标签
        for (Element element : studentelements) {
//            element依次表示每一个student标签
            Attribute id = element.attribute("id");//获取该属性
            String idValue = id.getValue();// 获取该属性的值

            Element name = element.element("name");
            String nameText = name.getText();

            Element age = element.element("age");
            String ageText = age.getText();
            System.out.println(idValue);
            System.out.println(nameText);
            System.out.println(ageText);
            xmlStudent s = new xmlStudent(idValue,nameText,Integer.parseInt(ageText));
            list.add(s);
        }

        System.out.println(elements.size());
        for (xmlStudent xmlStudent : list) {
            System.out.println(xmlStudent);
        }

    }
}
