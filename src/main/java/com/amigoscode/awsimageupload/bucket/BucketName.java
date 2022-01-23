package com.amigoscode.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("amigoscode-image-upload-dmatos");
    
    private final String bucketName;


    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }
}
