package com.example.USER_MODULE.Controller;

import com.example.USER_MODULE.Model.Profile;
import com.example.USER_MODULE.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    // Create or update a profile
    @PostMapping
    public Profile createOrUpdateProfile(@RequestBody Profile profile) {
        return profileService.createOrUpdateProfile(profile);
    }

    // Get profile by user ID
    @GetMapping("/{userId}")
    public Profile getProfile(@PathVariable Long userId) {
        return profileService.getProfileByUserId(userId);
    }

    // Update a profile
    @PutMapping
    public Profile updateProfile(@RequestBody Profile profile) {
        return profileService.updateProfile(profile);
    }

    // Delete profile by user ID
    @DeleteMapping("/{userId}")
    public boolean deleteProfile(@PathVariable Long userId) {
        return profileService.deleteProfile(userId);
    }
}
