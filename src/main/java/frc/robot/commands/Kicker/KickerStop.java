package frc.robot.commands.Kicker;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class KickerStop extends Command {

  public KickerStop() {
    requires(Robot.kicker);
  } 

  @Override
     protected void initialize() {
     
    }
 
   @Override
     protected void execute() {
       Robot.kicker.stopKicker();
     }

   @Override
     protected void end() {    
    
    }
    
    @Override
    protected boolean isFinished(){
        return false;
    }

}