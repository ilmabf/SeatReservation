import scala.io.StdIn.readInt
import scala.util.control.Breaks._

object seatBooking{
  def main(args: Array[String]){

    var flightSeatBookings = Array(Array(0,0,0,0,0),
                                   Array(0,0,0,0,0),
                                   Array(0,0,0,0,0),
                                   Array(0,0,0,0,0))

    var flightSeatdestination = Array(Array(0,0,0,0,0),
                                      Array(0,0,0,0,0),
                                      Array(0,0,0,0,0),
                                      Array(0,0,0,0,0))


    val cities = Array("Colombo","Dubai","Frankfurt","Montreal")



    var city = 0;
    var z = -1;
    var row = -1;
    var column = -1;
    var y = -1;

    for(city <- 0 to 3){
      println("Location : " + cities(city));

      if(city>0){
        for(a<- 0 to 3){
          for(b<- 0 to 4){
            if(flightSeatdestination(a)(b) == city){
              flightSeatBookings(a)(b) = 0;
            }
          }
        }
      }

      for(a <- 0 to 3){
        for(b <- 0 to 4){
          print(flightSeatBookings(a)(b));
        }
        println("-----------------------");
      }
      println("Enter reserved seat and destination");
      println("Enter -1 to go to the next destination");
      z = readInt();
      y = readInt();
      while(z!= -1){
        row = z / 10;
        column = z % 10;

        if(flightSeatBookings(row)(column) == 0){
          flightSeatBookings(row)(column) = 1;
          flightSeatdestination(row)(column) = y;
          println("Seat reserved successfully!");
        }
        else{
          println("Error: Seat already reserved");
        }

        z = readInt();
        y = readInt();
      }
    }
/*
    var i = -1;
    var j = -1;
    var x = -1;
    var y = -1;
    var z = -1;


    for(i <- 0 to 3){
      println("Enter reserved seats in " + cities(i));
      for(j <- 0 until 20){

        z = readInt();

        if(z == -1){
          println("Reservations at " + cities(i) + ":");
          for(k <- 0 to 3){
            for(l <- 0 to 4){
              print(flightSeatBookings(x)(y) + " ");

            }
            println("--------------------");
          }
          break
        }

        else{          // z == 1
          x = readInt();
          y = readInt();
          flightSeatBookings(x)(y) = 1;
        }

      }
    }
*/
  }
}
