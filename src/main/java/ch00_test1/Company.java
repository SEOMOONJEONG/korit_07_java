package ch00_test1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Company {
    private int companyId;
    private String companyName;
    private String address;
    private String city;
    private String state;
    private String zipCode;

    public static void main(String[] args) {
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        Company company1 = new Company(100, "Apple", "Apple Computer Inc. 1 infinite Loop", "Cupertino", "CA", "95014");
        String company2 = gsonBuilder.toJson(company1);
        System.out.println(company2);

    }
}

