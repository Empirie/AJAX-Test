package ch.fhnw.acrm.distancecalc;

import ch.fhnw.acrm.business.service.AgentService;
import ch.fhnw.acrm.deliverydata.DeliveryData;
import ch.fhnw.acrm.deliverydata.DeliveryService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class DistanceAPI {



    private static final String API_KEY = "AIzaSyA_anJ89KC18VQyOw4nRKauhHaQiJbsvoE";

    private static String destination;
    public static float[][] distances;

    public static final String ORIGIN_ADDRESS = "PeterMerian-Strasse86,4052Basel";
    private static long distance = 1;

    private DeliveryData deliveryData;
    private AgentService agentService;
    public DeliveryService deliveryService;

    public DistanceAPI(DeliveryData deliveryData, AgentService agentService, DeliveryService deliveryService) {
        this.deliveryData = deliveryData;
        this.agentService = agentService;
        this.deliveryService = deliveryService;
    }

    public DistanceAPI() {

    }


    public String getGod(){
        String god = deliveryService.getGodString();

        return god;
    }


    //downloading the data

    public static long getData(String destination) throws Exception {



        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(java.net.URI.create("https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + ORIGIN_ADDRESS + "&destinations=" + destination + "&key=" + API_KEY))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body);

        String response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();

        System.out.println(response);

        JSONParser jp = new JSONParser();
        JSONObject jo = (JSONObject) jp.parse(response);
        JSONArray ja = (JSONArray) jo.get("rows");
        jo = (JSONObject) ja.get(0);
        ja = (JSONArray) jo.get("elements");
        jo = (JSONObject) ja.get(0);
        JSONObject je = (JSONObject) jo.get("distance");

        distance = (long) je.get("value");

        return distance;

    }




    public static void main(String[] args) throws Exception {

        System.out.println("Let's see");

        getData("Florastrasse40,4057Basel");
        System.out.println("Did it work above?");
        System.out.println();




    }



}
