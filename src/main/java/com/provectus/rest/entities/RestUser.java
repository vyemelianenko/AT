package com.provectus.rest.entities;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class RestUser {

    public Integer createUser(User user) throws IOException {

        Gson gson = new Gson();
        String json = gson.toJson(user);

        System.out.println(json);

        RequestBody body = RequestBody.create(json.getBytes());

        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore.swagger.io/v2/user")
                .addHeader("Content-type", "application/json")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println("createUser -> " + response.code());

        UserResponse newUser = gson.fromJson(response.body().string(), UserResponse.class);
        return newUser.getCode();
    }


    public String getUserByName(User user) throws IOException {

        Gson gson = new Gson();
        String json = gson.toJson(user);

        System.out.println(json);

// get не має body

        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user/" + user.getUsername())
                .addHeader("Content-type", "application/json")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println("getUserByName -> " + response.code());

        User newUser = gson.fromJson(response.body().string(), User.class);

        JSONObject responceJson = new JSONObject(response);
        return newUser.getUsername();
    }


    public Integer loginUser(User user) throws IOException {

        Gson gson = new Gson();
        String json = gson.toJson(user);

        System.out.println(json);

        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user/login?username=" + user.getUsername() + "&password=" + user.getPassword())
                .addHeader("Content-type", "application/json")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println("loginUser -> " + response.code());

        UserResponse newUser = gson.fromJson(response.body().string(), UserResponse.class);
        return newUser.getCode();
    }

    public Integer logoutUser(User user) throws IOException {

        Gson gson = new Gson();
        String json = gson.toJson(user);

        System.out.println(json);

        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user/logout")
                .addHeader("Content-type", "application/json")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println("logoutUser -> " + response.code());

        UserResponse newUser = gson.fromJson(response.body().string(), UserResponse.class);
        return newUser.getCode();
    }

    public String updateUser(User user) throws IOException {

        JSONObject json = new JSONObject(user);
        json.put("email", "newEmail@gmail.com");


        System.out.println(json);

        RequestBody body = RequestBody.create(json.toString().getBytes());

        Request request = new Request.Builder()
                .put(body)
                .url("https://petstore.swagger.io/v2/user/" + user.getUsername())
                .addHeader("Content-type", "application/json")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println("updateUser -> " + response.code());

        String responceBody = response.body().string();
        JSONObject responceJson = new JSONObject(responceBody);
        return responceJson.get("code").toString();
    }

    public Integer deleteUser(User user) throws IOException {

        Gson gson = new Gson();
        String json = gson.toJson(user);

        System.out.println(json);

        Request request = new Request.Builder()
                .delete()
                .url("https://petstore.swagger.io/v2/user/" + user.getUsername())
                .addHeader("Content-type", "application/json")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println("deleteUser -> " + response.code());

        UserResponse newUser = gson.fromJson(response.body().string(), UserResponse.class);
        return newUser.getCode();
    }
}
