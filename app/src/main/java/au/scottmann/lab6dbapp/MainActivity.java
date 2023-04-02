package au.scottmann.lab6dbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHandler db = new DBHandler(this);

        // Inserting students
        Log.d("Insert: ", "Inserting ..");
        db.addStudent(new Student("Mat", "0412345678"));
        db.addStudent(new Student("Alex", "0423232333"));
        db.addStudent(new Student("Sameer", "04163322323"));
        db.addStudent(new Student("Shaz", "04242342342"));

        // Reading all students
        Log.d("Reading: ", "Reading all students..");
        List<Student> students = db.getAllStudents();

        for (Student cn : students) {
            String log = "Id: "+cn.getID()+" ,Name: " + cn.getName() + " ,Phone: "
                    + cn.getPhone();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }

    }
}