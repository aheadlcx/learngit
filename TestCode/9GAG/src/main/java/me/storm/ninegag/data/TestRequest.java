package me.storm.ninegag.data;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;

/**
 * Created by ahead on 2014/11/17.
 */
public class TestRequest<T> extends Request<T> {

    public TestRequest(int method, String url, Response.ErrorListener listener) {
        super(method, url, listener);
    }
    public TestRequest(int method, String url,Class clazz, Response.ErrorListener listener) {
//        super(method, url, listener);
        this(method, url, listener);

    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse networkResponse) {
        return null;
    }

    @Override
    protected void deliverResponse(T t) {

    }
}
