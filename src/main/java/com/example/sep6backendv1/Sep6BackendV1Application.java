package com.example.sep6backendv1;

import com.google.api.gax.paging.Page;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

//@MappedTypes(Movie.class)
//@MapperScan("com.example.sep6backendv1.mapper")
@SpringBootApplication
public class Sep6BackendV1Application {
	static void authImplicit() {
		// If you don't specify credentials when constructing the client, the client library will
		// look for credentials via the environment variable GOOGLE_APPLICATION_CREDENTIALS.
		Storage storage = StorageOptions.getDefaultInstance().getService();

		System.out.println("Buckets:");
		Page<Bucket> buckets = storage.list();
		for (Bucket bucket : buckets.iterateAll()) {
			System.out.println(bucket.toString());
		}

	}
	public static void main(String[] args) {

//
//		authImplicit();

		SpringApplication.run(Sep6BackendV1Application.class, args);
	}

}
