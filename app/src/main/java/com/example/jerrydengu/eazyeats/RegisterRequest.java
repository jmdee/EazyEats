package com.example.jerrydengu.eazyeats;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jerry Dengu on 21/01/2017.
 */

public class RegisterRequest extends StringRequest{
    private static final String REGISTER_REQUEST_URL = "localhost/EazyEats/Register.php";
    private Map<String,String> params;
    public  RegisterRequest(String name , String surname, String address, String username, String password, String city, int phonenumber, Response.Listener<String>listener){
        super(Request.Method.POST,REGISTER_REQUEST_URL,listener,null);
        params = new HashMap<>();
        params.put("name",name);
        params.put("surname",surname);
        params.put("address",address);
        params.put("username",username);
        params.put("password",password);
        params.put("city",city);
        params.put("phonenumder",phonenumber +"");


    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
