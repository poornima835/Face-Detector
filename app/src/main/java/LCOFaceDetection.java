import com.google.firebase.FirebaseApp;

import android.app.Application;

public class LCOFaceDetection extends Application{

    public final static String RESULT_TEXT = "RESULT_TEXT";
    public final static String RESULT_DIALOG = "RESULT_DIALOG";

    // initializing our firebase
    @Override
    public void onCreate()
    {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }

}


