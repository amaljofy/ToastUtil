package android.accubits.com.toastutil;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Amal Jofy on 24-10-2017.
 */

public class ToastUtil extends AppCompatActivity{

    public static void showErrorToast(String msg,Context context) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService (Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.toast_error_layout, null);
        // set a message
        TextView text = (TextView) view.findViewById(R.id.text);
        text.setText(msg);
        // Toast...
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(view);
        toast.show();
    }

    public static void showToast(String message, Context context) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT)
                .show();
    }

    public static void showSuccessToast(String msg,Context context) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService (Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.toast_sucess_layout, null);
        // set a message
        TextView text = (TextView) view.findViewById(R.id.text);
        text.setText(msg);
        // Toast...
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(view);
        toast.show();
    }
}
