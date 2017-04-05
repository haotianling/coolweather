package sfx.lxht.com.coolweather.util;

/**
 * Created by haotian on 2017/4/1.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);

}
