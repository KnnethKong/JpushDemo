package gjcm.kxf.jpushdemo;

import android.app.Application;
import android.util.Log;

import java.util.Set;

import cn.jpush.android.api.JPushInterface;
import cn.jpush.android.api.TagAliasCallback;

/**
 * For developer startup JPush SDK
 * <p/>
 * 一般建议在自定义 Application 类里初始化。也可以在主 Activity 里。
 */
public class ExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        setTag();
        JPushInterface.setDebugMode(true);    // 设置开启日志,发布时请关闭日志
        JPushInterface.init(this);            // 初始化 JPush
    }

    private void setTag() {
        JPushInterface.setAlias(this, "11102600631", new TagAliasCallback() {
            @Override
            public void gotResult(int i, String s, Set<String> set) {
                Log.i("kxflog", "  sss ------->" + i + s);
            }
        });

    }

}
