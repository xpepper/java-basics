package it.xpeppers.learn.through_practice;

class MissingChar {
    public String removeCharFrom(String string, int charIndex) {
        return string.substring(0, charIndex) + string.substring(charIndex + 1);
    }
}
