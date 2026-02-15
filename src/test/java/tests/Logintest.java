package tests;

import factory.Browser;

import java.util.Properties;

public class Logintest {

    public static void main(String[] args) {
        Browser br = new Browser();
        Properties pp = br.initProp();
        System.out.println(pp.get("browser"));

    }

}
