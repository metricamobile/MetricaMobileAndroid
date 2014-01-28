package com.metricamobile.android.demo;

import android.app.Activity;
//import android.app.AlertDialog;
//import android.content.DialogInterface;
import android.os.Bundle;
import android.util.FloatMath;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
  //private CheckUpdateTask checkUpdateTask;
	private TextView first, second;
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    System.setProperty("http.keepAlive", "false");
  }
  

  public void onClickCrashButton(View view) {
	  first=(TextView)findViewById(R.id.txtError);
	  int error = Integer.parseInt(first.getText().toString());
	  
	  switch(error){
	  	case 1:{
	  		new Exception("This is an error");
	  		break;
	  	}
	  	case 2:{
	  		//View missing = (View)findViewById(R.id.icon_view);
	  		//missing.bringToFront();
	  		break;
	  	}
	  	case 3:{
	  		float raiz=FloatMath.sqrt((float) -4.0);
	  		System.out.print(raiz);
	  		break;
	  	}
	  	case 4:{
	  		String array[]={};
	  		System.out.print(array[23]);
	  		break;
	  	}
	  	default:
	  		//View missing = (View)findViewById(R.id.icon_view);
	  		//missing.bringToFront();
	  }
    // Find a view that does not exist
    //View missing = (View)findViewById(R.id.icon_view);
    
    // This should raise a null pointer exception
    //missing.bringToFront();
  }
  
  
  public void onClickCalcButton(View view) {
	  
	  first=(TextView)findViewById(R.id.txtOne);
	  second=(TextView)findViewById(R.id.txtTwo);
	  int a = Integer.parseInt(first.getText().toString());
	  int b = Integer.parseInt(second.getText().toString());
	  first=(TextView)findViewById(R.id.txtresult);
	  first.setText(String.valueOf(a/b));
	 
  }
  
}