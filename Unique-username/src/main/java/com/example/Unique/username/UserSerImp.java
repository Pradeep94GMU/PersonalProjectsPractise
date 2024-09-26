package com.example.Unique.username;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UserSerImp implements UserService{

    private final UserRepo userRepo;

    @Autowired
    public UserSerImp(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public int createUsernames(int count) {

        List<Username> usernames = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String randomUsername = generateRandomUsername();
            usernames.add(new Username(randomUsername));
        }

        userRepo.saveAll(usernames);

        return usernames.size();


    }

    @Override
    public List<Username> findUsername(String name) {
        return userRepo.findByNameContainingIgnoreCase(name);
    }

    @Override
    public int findtotalusers() {
        return userRepo.findTotalUsers();
    }

    private static final String[] FIRST_NAMES = {
            "Aarav", "Vihaan", "Arjun", "Vivaan", "Aditya",
            "Ananya", "Diya", "Aarohi", "Saanvi", "Ishaan",
            "Rohit", "Amit", "Rahul", "Neha", "Riya",
            "Kavya", "Sneha", "Priya", "Akash", "Nikhil"
    };


    // Sample list of last names
    private static final String[] LAST_NAMES = {
            "Sharma", "Verma", "Gupta", "Patel", "Reddy",
            "Singh", "Kumar", "Joshi", "Nair", "Chopra",
            "Mehra", "Rao", "Menon", "Das", "Iyer",
            "Mishra", "Saxena", "Thakur", "Bhat", "Kapoor"
    };


    private static final Random RANDOM = new Random();

    private String generateRandomUsername() {
        String firstName = FIRST_NAMES[RANDOM.nextInt(FIRST_NAMES.length)];
        String lastName = LAST_NAMES[RANDOM.nextInt(LAST_NAMES.length)];

        // Optionally add random numbers to increase uniqueness
        int randomNumber = RANDOM.nextInt(9999); // Up to 4 digits

        // Combine first name, last name, and random number (if needed)
        return firstName + lastName + randomNumber;
    }
}
