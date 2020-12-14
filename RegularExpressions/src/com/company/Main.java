package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = "I am a String. Yes I am.";
        System.out.println(string);

        String yourString = string.replaceAll("I am", "You are");
        System.out.println(yourString);

        String alphaNumeric = "aaabbeeaF12ceeeccDFiiij9k";
        System.out.println(alphaNumeric.replaceAll("." ,"Y"));
        System.out.println(alphaNumeric.replaceAll("^aaabbF", "YYY"));

        String secondString = "aaabbF12cccaaabbFDFiii";
        System.out.println(secondString.replaceAll("^aaabbF", "YYY"));

        System.out.println(alphaNumeric.matches("^Hello!"));
        System.out.println(alphaNumeric.matches("^aaabbF"));
        System.out.println(alphaNumeric.matches("^aaabbF12cccDFiii"));

        System.out.println(alphaNumeric.replaceAll("DFiii$", "THE END"));
        System.out.println(alphaNumeric.replaceAll("[aei]", "X"));
        System.out.println(alphaNumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphaNumeric = "aaabbeeaF12ceeeccDFiiij9k";
        System.out.println(newAlphaNumeric.replaceAll("[^ej]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("[a-f3-8]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("\\d", "X"));
        System.out.println(newAlphaNumeric.replaceAll("\\D", "X"));

        String hasWhiyeSpace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhiyeSpace);
        System.out.println(hasWhiyeSpace.replaceAll("\\s", ""));
        System.out.println(hasWhiyeSpace.replaceAll("\t", "X"));
        System.out.println(hasWhiyeSpace.replaceAll("\\S", ""));
        System.out.println(newAlphaNumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhiyeSpace.replaceAll("\\w", "X"));
        System.out.println(hasWhiyeSpace.replaceAll("\\b", "X"));

         String thirdAlphaNumericString = "aaabbeeaF12ceeeccDFiiij9k";
        System.out.println(thirdAlphaNumericString.replaceAll("^aaab{2}", "YYY"));
        System.out.println(thirdAlphaNumericString.replaceAll("^aaab+","YYY"));
        System.out.println(thirdAlphaNumericString.replaceAll("^aaab*","YYY"));
        System.out.println(thirdAlphaNumericString.replaceAll("^aaab{2,5}", "YYY"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is an another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while (matcher.find()){
            count++;
            System.out.println("Occurance " + count + ": " + matcher.start() + " to " + matcher.end());
        }


        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        while (groupMatcher.find()){
            System.out.println("Occurance: " + groupMatcher.group(1));
        }

        String h2TextGroup = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroup);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()){
            System.out.println("Occurance: " + h2TextMatcher.group(2));
        }

        //abc means a and b and c
        // [Hh]arry [H|h]arry
        // [^abc]

        String tvTest = "tstvtkt";
        //String tNotVRegEx = "t[^v]";
        String tNotVRegEx = "t(?!v)"; // t(?=v) --> bu ifade de onun pozitifi
        Pattern tNotVPattern = Pattern.compile(tNotVRegEx);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;

        while(tNotVMatcher.find()){
            count++;
            System.out.println("Occurence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }
    }
}
