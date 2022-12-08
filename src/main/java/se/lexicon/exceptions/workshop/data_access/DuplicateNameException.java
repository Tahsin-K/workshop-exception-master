package se.lexicon.exceptions.workshop.data_access;

public class DuplicateNameException extends RuntimeException {
    public DuplicateNameException(String message){
    super(message);
}
}
