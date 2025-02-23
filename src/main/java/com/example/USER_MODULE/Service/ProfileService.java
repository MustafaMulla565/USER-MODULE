package com.example.USER_MODULE.Service;


import com.example.USER_MODULE.Model.Profile;
import com.example.USER_MODULE.Repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    // Create or update a profile
    public Profile createOrUpdateProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    // Get profile by userId
    public Profile getProfileByUserId(Long userId) {
        return profileRepository.findByUser_Id(userId);  // Fetch profile by userId
    }

    // Update profile details
    public Profile updateProfile(Profile profile) {
        Profile existingProfile = profileRepository.findByUser_Id(profile.getUserId());
        if (existingProfile != null) {
            existingProfile.setFirstName(profile.getFirstName());
            existingProfile.setLastName(profile.getLastName());
            existingProfile.setEmail(profile.getEmail());
            existingProfile.setPhone(profile.getPhone());
            existingProfile.setAddress(profile.getAddress());
            return profileRepository.save(existingProfile);
        }
        return null; // Profile doesn't exist
    }

    // Delete profile by userId
    public boolean deleteProfile(Long userId) {
        Profile profile = profileRepository.findByUser_Id(userId);
        if (profile != null) {
            profileRepository.delete(profile);
            return true;
        }
        return false; // Profile doesn't exist
    }
}

