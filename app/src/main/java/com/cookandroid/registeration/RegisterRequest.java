package com.cookandroid.registeration;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    final static private String URL = "http://kim03208.cafe24.com/UserRegister.php";
    private Map<String, String> parameters;

    public RegisterRequest(String userID, String userPassword, String userGender, String userMajor, String userEmail, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null); // 해당 URL의 파라메터들을 POST방식으로(숨겨서) 보내줘라
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);
        parameters.put("userGender", userGender);
        parameters.put("userEmail", userEmail);
        parameters.put("userMajor", userMajor);

    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}
