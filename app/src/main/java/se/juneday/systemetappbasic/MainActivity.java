package se.juneday.systemetappbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  private Button Over20;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Over20 = (Button) findViewById(R.id.Over20);
    Over20.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        openMainProductList();
      }
    });
  }

  public void openMainProductList() {
    Intent intent = new Intent(this, MainProductList.class);
    startActivity(intent);
  }
}