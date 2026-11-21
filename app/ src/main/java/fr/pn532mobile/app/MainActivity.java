package fr.pn532mobile.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView status;

    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(28, 48, 28, 28);
        layout.setBackgroundColor(0xFF151923);

        TextView title = new TextView(this);
        title.setText("PN532 Mobile");
        title.setTextSize(28);
        title.setTextColor(0xFFFFFFFF);
        layout.addView(title);

        status = new TextView(this);
        status.setText("Connecte ton lecteur PN532 via USB OTG.");
        status.setTextColor(0xFFE0E5EF);
        status.setTextSize(16);
        layout.addView(status);

        Button check = new Button(this);
        check.setText("Vérifier le lecteur USB");
        check.setOnClickListener(v ->
            status.setText("Diagnostic USB en préparation.")
        );
        layout.addView(check);

        setContentView(layout);
    }
}
