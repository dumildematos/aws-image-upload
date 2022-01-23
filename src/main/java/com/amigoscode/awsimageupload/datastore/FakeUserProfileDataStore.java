package com.amigoscode.awsimageupload.datastore;

import com.amigoscode.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "janetjone", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "antoniojunior", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "dumildematos", null));
    }

    public List<UserProfile> getUserProfileList(){
        return USER_PROFILES;
    }

}
