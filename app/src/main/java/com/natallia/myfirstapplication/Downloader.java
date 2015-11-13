package com.natallia.myfirstapplication;

import android.app.Activity;

import java.io.*;
import java.net.*;

/**
 * Created by Administrator on 12.11.15.
 */
public class Downloader {

    public static void requestJSONText(final Activity activity, final IDownloaderHandler handler){

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                String text = "";
                try {
                    text = Downloader.loadJSONText();
                } catch (Exception e) {
                    System.out.println("Второй поток прерван");
                }
                System.out.println("Второй поток завершён");
                System.out.println(text);

                final String res = text;

                activity.runOnUiThread(new Runnable() {
                                           @Override
                                           public void run() {
                                               handler.OnDownloadComplete(res);
                                           }
                                       }
                );
            }
        });
        thread.start();
    }
    public static String loadJSONText()  {
        URL url = null;
        StringBuffer textFile = new StringBuffer();

        try {
            url = new URL("https://www.dropbox.com/s/simkh0fqmxus3fn/test.json?dl=1");

            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String t;

            while ((t = reader.readLine()) != null) {
                textFile.append(t);
            }
            reader.close();
            urlConnection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return textFile.toString();
    }
}

