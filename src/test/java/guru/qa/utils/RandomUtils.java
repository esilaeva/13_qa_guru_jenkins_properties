package guru.qa.utils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    public static String getRandomString(int len) {
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));

        return sb.toString();
    }

    public static String getRandomFirstName() {

        return new Faker(Locale.ENGLISH).name().firstName();
    }

    public static String getRandomLastName() {

        return new Faker(Locale.ENGLISH).name().lastName();
    }

    public static String getRandomEmail() {

        return new Faker().internet().emailAddress();
    }

    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};

        return new Faker().options().option(genders);
    }

    public static int getRandomInt(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomPhone() {

        return new Faker().phoneNumber().subscriberNumber(10);
    }

    public static String[] getRandomDate(int minAge, int maxAge) {
        Faker faker = new Faker();
        Date date = faker.date().birthday(minAge, maxAge);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");

        return dateFormat.format(date).split("-");
    }

    public static String getRandomSubject() {
        String[] subject = {"English", "Chemistry", "Computer Science", "Commerce", "Economics", "Social Studies"};

        return new Faker().options().option(subject);
    }

    public static String getRandomHobbies() {
        String[] hobby = {"Sports", "Reading", "Music"};

        return new Faker().options().option(hobby);
    }

    public static String getRandomAddress() {
        return new Faker().address().streetAddress();
    }

    public static String getRandomState() {
        String[] state = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

        return new Faker().options().option(state);
    }

    public static String getRandomCity(String state) {

        if (state.equals("NCR")) {
            String[] cityNCR = {"Delhi", "Gurgaon", "Noida"};

            return new Faker().options().option(cityNCR);
        } else if (state.equals("Uttar Pradesh")) {
            String[] cityUP = {"Agra", "Lucknow", "Merrut"};

            return new Faker().options().option(cityUP);
        } else if (state.equals("Haryana")) {
            String[] cityH = {"Karnal", "Panipat"};

            return new Faker().options().option(cityH);
        } else {
            String[] cityR = {"Jaipur", "Jaiselmer"};

            return new Faker().options().option(cityR);
        }
    }
}
