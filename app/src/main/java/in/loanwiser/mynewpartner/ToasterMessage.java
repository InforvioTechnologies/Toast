package in.loanwiser.mynewpartner;

import android.content.Context;
import android.widget.Toast;

class ToasterMessage {
    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
