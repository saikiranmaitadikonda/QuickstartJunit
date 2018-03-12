package com.quickstart;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.Set;
import org.jsoup.nodes.*;
import org.jsoup.select.*;


public class HttpURLConnection {


    private String urlString;

    public String getUrlString() {
        return urlString;
    }

    public void setUrlString(String urlString) {
        this.urlString = urlString;
    }

    public Document getConnection() throws IOException {


        Document document = null;
        try {
            document = Jsoup.connect(getUrlString()).get();

            return document;

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return null;

    }

    public String getElements(Document input_document) {

        Elements elements = input_document.getAllElements();
        Set<String> url_Class_Names = input_document.classNames();
        StringBuilder allElements = new StringBuilder();

        for (Element element : elements)
            allElements.append(element.text() + "\n");

        return allElements.toString();

    }


}
