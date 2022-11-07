package base.Lesson7_IO.Task7_rewrite;

public class NoOptionFoundException extends Exception{
    @Override
    public String getMessage() {
        return "Unacceptable option!";
    }
}