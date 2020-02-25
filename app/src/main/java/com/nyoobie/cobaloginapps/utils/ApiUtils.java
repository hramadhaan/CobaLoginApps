package com.nyoobie.cobaloginapps.utils;

import com.nyoobie.cobaloginapps.network.ApiService;
import com.nyoobie.cobaloginapps.services.RetrofitClient;

public class ApiUtils {
    private ApiUtils() {
    }

    public static final String API_URL = "";

    public static ApiService getApiService() {
        return RetrofitClient.getClient(API_URL).create(ApiService.class);
    }
}
