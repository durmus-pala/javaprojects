package com.company;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
        try {
//            Path fileToCreate = FileSystems.getDefault().getPath("files", "file1.txt");
//            Files.createFile(fileToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("files", "files2");
//            Files.createDirectory(dirToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("files", "files2/files3/files4");
//            Files.createDirectories(dirToCreate);

            Path filePath = FileSystems.getDefault().getPath("files1", "subdirectory.txt");
            long fileSize = Files.size(filePath);
            System.out.println("File Size = " + fileSize);
            System.out.println("Last modified time = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attributes.size());
            System.out.println("Last modified = " + attributes.lastModifiedTime());
            System.out.println("Created = " + attributes.creationTime());
            System.out.println("Is directory = " + attributes.isDirectory());
            System.out.println("Is regular file = " + attributes.isRegularFile());

//          Path fileToDelete = FileSystems.getDefault().getPath("files", "file1");
//          Files.delete(fileToDelete);


//            Path fileToMove = FileSystems.getDefault().getPath("files", "subdirectorycopy.txt");
//            Path destination = FileSystems.getDefault().getPath("files", "subdirectorycopy1.txt");
//            Files.move(fileToMove, destination);

//           Path fileToMove = FileSystems.getDefault().getPath("files", "subdirectory.txt");
//            Path destination = FileSystems.getDefault().getPath("files1", "subdirectory.txt");
//           Files.move(fileToMove, destination);
//            Path sourceFile = FileSystems.getDefault().getPath("files1", "subdirectory.txt");
//            Path copyFile = FileSystems.getDefault().getPath("files", "subdirectorycopy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

//            sourceFile = FileSystems.getDefault().getPath("files");
//            copyFile = FileSystems.getDefault().getPath("files1");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
//        Path path = FileSystems.getDefault().getPath("directory.txt");
//	//printFile(path);
//	//Path filepath = FileSystems.getDefault().getPath("files", "subdirectory.txt");
//	Path filepath = Paths.get(".", "files", "subdirectory.txt");
//	//filepath = Paths.get("C://Users/TOSHIBA/Downloads/FileSystemText1.txt");
//	printFile(filepath);
//	filepath = Paths.get(".");
//        System.out.println(filepath.toAbsolutePath());
//
//        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "subdirectory.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//
//        Path path3 = FileSystems.getDefault().getPath("thisfiledoesnotexist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        filepath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists: " + Files.exists(filepath));
//        System.out.println("Readable: " + Files.isReadable(filepath));
//	    }
//
//
//
//    private static void printFile(Path path){
//        try(BufferedReader fileReader = Files.newBufferedReader(path)){
//            String line;
//            while((line = fileReader.readLine()) != null){
//                System.out.println(line);
//            }
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }
}
