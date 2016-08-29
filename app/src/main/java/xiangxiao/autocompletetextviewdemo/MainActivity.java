package xiangxiao.autocompletetextviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView acTextView;
    private String[] res = {"China", "Chinese", "United States", "America", "American"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        第一步:初始化控件
        第二步:需要一个适配器
        第三步:初始化数据源---这数据源去匹配文本框输入的内容
        第四步:将adapter与当前AutoCompleteTextView绑定
         */
        acTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, res);
        acTextView.setAdapter(adapter);
    }
}
