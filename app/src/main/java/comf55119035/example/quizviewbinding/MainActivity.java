package comf55119035.example.quizviewbinding;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import comf55119035.example.quizviewbinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        setContentView(R.layout.activity_main);

        // Data Ahmad Dahlan
        binding.imgPhoto1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ahmad_dahlan));
        binding.txtName1.setText("Ahmad Dahlan");
        binding.txtDescription1.setText("Salah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta pada masa itu, dan ibu dari K.H. Ahmad Dahlan adalah puteri dari H. Ibrahim yang juga menjabat penghulu Kesultanan Ngayogyakarta Hadiningrat pada masa itu. KH. Ahmad Dahlan telah mempelopori kebangkitan ummat Islam untuk menyadari nasibnya sebagai bangsa terjajah yang masih harus belajar dan berbuat.");
        // Data Ahmad Yani
        binding.imgPhoto2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ahmad_yani));
        binding.txtName2.setText("Ahmad Yani");
        binding.txtDescription2.setText("Jenderal TNI Anumerta Ahmad Yani (juga dieja Achmad Yani; lahir di Purworejo, Jawa Tengah, 19 Juni 1922 – meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 43 tahun) adalah komandan Tentara Nasional Indonesia Angkatan Darat, dan dibunuh oleh anggota Gerakan 30 September saat mencoba untuk menculik dia dari rumahnya.");
        // Data Bung Tomo
        binding.imgPhoto3.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.bung_tomo));
        binding.txtName3.setText("Sutomo");
        binding.txtDescription3.setText("Sutomo (lahir di Surabaya, Jawa Timur, 3 Oktober 1920 – meninggal di Padang Arafah, Arab Saudi, 7 Oktober 1981 pada umur 61 tahun) lebih dikenal dengan sapaan akrab oleh rakyat sebagai Bung Tomo, adalah pahlawan yang terkenal karena peranannya dalam membangkitkan semangat rakyat untuk melawan kembalinya penjajah Belanda melalui tentara NICA, yang berakhir dengan pertempuran 10 November 1945 yang hingga kini diperingati sebagai Hari Pahlawan.");

        // Gatot Subroto
        binding.imgPhoto4.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.gatot_subroto));
        binding.txtName4.setText("Gatot Subroto");
        binding.txtDescription4.setText("Jenderal TNI (Purn.) Gatot Soebroto (lahir di Sumpiuh, Banyumas, Jawa Tengah, 10 Oktober 1907 – meninggal di Jakarta, 11 Juni 1962 pada umur 54 tahun) adalah tokoh perjuangan militer Indonesia dalam merebut kemerdekaan dan juga pahlawan nasional Indonesia. Ia dimakamkan di Ungaran, kabupaten Semarang.");
    }
}