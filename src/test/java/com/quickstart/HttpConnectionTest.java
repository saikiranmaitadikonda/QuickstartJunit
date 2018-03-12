package com.quickstart;

import junit.framework.TestCase;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;

import java.io.PrintWriter;

public class HttpConnectionTest extends TestCase {

    public static final String URL_TO_CONNECT = "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/" +
            "shop/gb/groceries/berries-cherries-currants/sainsburys-british-strawberries-400g.html";



    public void testHttpConnection() throws Exception {
        HttpURLConnection httpURLConnection = new HttpURLConnection();
        httpURLConnection.setUrlString(URL_TO_CONNECT);

        PrintWriter out = new PrintWriter("elements_list.txt");
        out.println(httpURLConnection.getElements(httpURLConnection.getConnection()));
    }
}
