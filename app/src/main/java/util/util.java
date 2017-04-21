package util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by itman on 4/22/17.
 */

public class util {
    public static boolean isLoggedIn(Context context){
        if (context != null){
            SharedPreferences sharedPreferences = context.getSharedPreferences(constant.SHARED_PREF, Context.MODE_PRIVATE);
            return sharedPreferences.getBoolean(constant.PREF_LOGGEDIN, false);
        }

        return false;
    }
}
