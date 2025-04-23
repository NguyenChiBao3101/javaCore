package oops.bai14;

public class Exceptions {
     static  Regex r = new Regex();

    class InvalidFullNameException extends Exception {
        public InvalidFullNameException (String message) {
            super(message);
        }
    }

    class InvalidDOBException extends Exception {
        public InvalidDOBException(String message) {
            super(message);
        }
    }
    class InvalidPhoneNumberException extends Exception {
        public InvalidPhoneNumberException(String message) {
            super(message);
        }
    }

    public void validateFullName(String fullName) throws InvalidFullNameException {
        if (r.checkFullName(fullName) == false) {
            throw new InvalidFullNameException("Invalid full name: " + fullName);
        }
    }
    public void validateDOB(String dob) throws InvalidDOBException {
        if (r.checkDOB(dob) == false) {
            throw new InvalidDOBException("Invalid date of birth: " + dob);
        }
    }

    public void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (r.checkPhoneNumber(phoneNumber) == false) {
            throw new InvalidPhoneNumberException("Invalid phone number: " + phoneNumber);
        }
    }

}
