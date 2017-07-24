package loading.mam.com.loading;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import loading.mam.com.mamloadingview.MAMBallView;


public class MainActivity extends AppCompatActivity {

    private MAMBallView mamBallView,mamBallView2,mamBallView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mamBallView = (MAMBallView) this.findViewById(R.id.metaball);

        mamBallView2= (MAMBallView) this.findViewById(R.id.metaball2);
        mamBallView2.SetColor(Color.GREEN);

        mamBallView3= (MAMBallView) this.findViewById(R.id.metaball3);
        mamBallView3.SetColor(Color.DKGRAY);
        mamBallView3.setPaintMode(0);

    }

}
