package flower.com.service.wxapi;

import android.app.Activity;

import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;

/**
 * Created by wp on 2017/3/29.
 *
 * @description
 */

public class WXEntryActivity extends Activity implements IWXAPIEventHandler {

    /**
     * 微信发送过来消息的回调
     * @param baseReq
     */
    @Override
    public void onReq(BaseReq baseReq) {

    }


    /**
     * 主动发送请求的回调
     * @param baseResp
     */
    @Override
    public void onResp(BaseResp baseResp) {

    }
}
