package sg.edu.np.mad.madtutorial2;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.TypeConverter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String TAG = "Main Activity";
    User user1 = new User("Kuan Zher","Hello",1, false);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView nameTextView = findViewById(R.id.textView);
        nameTextView.setText(user1.name);
        TextView desciptionTextView = findViewById(R.id.textView2);
        desciptionTextView.setText(user1.description);
        Log.v(TAG, "On Create!");
        Button followButton = findViewById(R.id.followButton);
        followButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.v(TAG, "Button Pressed");
                if (user1.followed)
                {
                    followButton.setText("Follow");
                    user1.followed = false;
                    String follow = new Boolean(user1.followed).toString();
                    Log.v(TAG, follow);
                }
                else
                {
                    followButton.setText("Unfollow");
                    user1.followed = true;
                    String follow = new Boolean(user1.followed).toString();
                    Log.v(TAG, follow);
                }
            }
        });
    }
}