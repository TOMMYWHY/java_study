package com.java_web.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        Document d = Jsoup.parse(new File(path), "utf-8");

        Elements elements = d.getElementsByTag("name");
//        System.out.println(elements.size());
        Element e = elements.get(0);
        String name = e.text();
        System.out.println(name);
    }

}
