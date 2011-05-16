package org.example

class Developer {
    String name
    int birthAge
    int javaAge
    
    static constraints = {
        name(blank: false)
        javaAge(nullable: false)
    }
}
