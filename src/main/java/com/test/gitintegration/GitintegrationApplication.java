package com.test.gitintegration;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.Ref;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

import static org.eclipse.jgit.api.Git.*;

@SpringBootApplication
public class GitintegrationApplication {

    public static void main(String[] args) throws GitAPIException {
        SpringApplication.run(GitintegrationApplication.class, args);
        
    }
}
