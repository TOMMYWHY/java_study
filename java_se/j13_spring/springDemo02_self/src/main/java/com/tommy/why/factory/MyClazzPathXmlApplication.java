package com.tommy.why.factory;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyClazzPathXmlApplication implements MyFactory {

    private Map<String,Object> beanMap = new HashMap<>();
    private List<MyBean> beanList = null;

    public MyClazzPathXmlApplication(String fileName) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        parseXml(fileName);
        instanceBean();
    }

    private void instanceBean() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (beanList != null && beanList.size() > 0){
            for (MyBean myBean: beanList
                 ) {
                String id = myBean.getId();
                String clazz = myBean.getClazz();
                Object obj = Class.forName(clazz).newInstance();
                beanMap.put(id,obj);
            }
        }
    }

    private void parseXml(String fileName) {

        try {
            SAXReader reader = new SAXReader();
            URL url = this.getClass().getClassLoader().getResource(fileName);
            System.out.println("classLoader:" + this.getClass().getClassLoader());
            System.out.println("url: "+ url);
            Document document = reader.read(url);
            XPath xPath = document.createXPath("beans/bean");
            List<Element> elementList = xPath.selectNodes(document);
            if(elementList != null && elementList.size() > 0){
                beanList = new ArrayList<>();

                for (Element element: elementList
                     ) {
                    String id = element.attributeValue("id");
                    String clazz = element.attributeValue("class");
                    MyBean myBean = new MyBean(id, clazz);
                    beanList.add(myBean);
                }
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Object getBean(String id) {
        Object obj = beanMap.get(id);
        return obj;
    }
}
