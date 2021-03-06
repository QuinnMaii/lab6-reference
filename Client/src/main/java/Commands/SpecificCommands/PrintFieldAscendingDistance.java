package Commands.SpecificCommands;

import Commands.AbstractCommand;
import Utilities.Receiver;

import java.io.IOException;
import java.io.Serializable;

public class PrintFieldAscendingDistance extends AbstractCommand implements Serializable {
    private Receiver receiver;
    private static final long serialVersionUID = 1234567L;

    public PrintFieldAscendingDistance(){

    }

    public PrintFieldAscendingDistance(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void aboutCommand() {
        System.out.println("print_field_ascending_distance - display elements whose name field value contains the given substring");
    }

    @Override
    public void execute(String[] args) throws IOException {
        if(args.length != 2){
            System.out.println("Client: Invalid command's format! Fail to execute InfoCommand!");
        }
        else{
            receiver.printFieldAscendingDistance(args[1]);
        }
    }
}
