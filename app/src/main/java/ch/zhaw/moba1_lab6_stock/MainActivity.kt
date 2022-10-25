package ch.zhaw.moba1_lab6_stock

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView

    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // arrayadapter, define array
        val arrayAdapter: ArrayAdapter<*>
        val items = mutableListOf(
            Stock("Apple", "AAPL", 115.69),
            Stock("Microsoft", "MSFT", 214.36),
            Stock("Google", "GOOGL", 1519.45),
            Stock("Salesforce", "CRM", 255.52),
            Stock("Facebook", "FB", 260.02),
            Stock("Amazon", "AMZN", 3201.86),
            Stock("eBay", "EBAY", 54.05),
            Stock("Twitter", "TWTR", 45.41),
            Stock("Snapchat", "SNAP", 28.11)
        )

        var stocks = ArrayList<String>();
        for (item in items) {
            var entry = ""
            entry += item.name + " "
            entry += item.symbol + " "
            entry += item.value.toString()
            stocks.add(entry)
            //entry = ""
        }

        // listView
        listView = findViewById(R.id.stocklist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, stocks)
        listView.adapter = arrayAdapter
    }
}
