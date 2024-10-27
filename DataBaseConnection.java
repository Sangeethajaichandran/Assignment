package day8assignment2;

public interface DataBaseConnection
{
public abstract void connect();
public abstract void disconnect();
public abstract void executeUpdate();
}
//data abstraction is used to hide unimportant information and showing only needed information
//Abstract class cannot instantiate object,abstract method cannot implement methods
//but it can be subclassed to implement those methods
//Interface is defining things 