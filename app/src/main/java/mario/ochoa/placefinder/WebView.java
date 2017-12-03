package mario.ochoa.placefinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebViewClient;

public class WebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        android.webkit.WebView view = (android.webkit.WebView)findViewById(R.id.webView2);
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.loadUrl("https://celulares.mercadolibre.com.mx/iphone/iphone-6/");

        view.setWebViewClient(new WebViewClient(){
            public boolean shouldOverriceUrlLoading(android.webkit.WebView view, String utl){
                return false;
            }
        });
    }
}
