import android.R
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
   private val webView:WebViewTeamsfullsite= null
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(R.layout.teams_main)
      val webView = findViewById(R.id.webview) as WebView
      webView.webViewClient = WebViewClient()
      webView.loadUrl("https://euterpe.webuntis.com/WebUntis/?school=Gym_k%C3%B6nigsbrunn#/basic/login")
      val webSettings = webView.settings
      webSettings.javaScriptEnabled = true
   }

   override fun onBackPressed() {
      if (webView!!.canGoBack()) {
         webView.goBack()
      } else {
         super.onBackPressed()
      }
   }
}