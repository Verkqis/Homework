package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ServerUpdate {

    LocalDate serverLaunchDay;

    public ServerUpdate(LocalDate serverLaunchDay) {
        this.serverLaunchDay = serverLaunchDay;
    }

    public void updateDays(LocalDate server) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        LocalDate updateDate = server.plusDays(14);

        LocalDate nextUpdateDate = updateDate.plusDays(14);
        System.out.println("Servers next update will be in: " + dtf.format(updateDate) + ", and next after will be in : " + dtf.format(nextUpdateDate) + "!");
    }


    public static void main(String[] args) {

        LocalDate serverLaunchDay = LocalDate.of(2023, 5, 1);
        ServerUpdate serverUpdate = new ServerUpdate(serverLaunchDay);
        serverUpdate.updateDays(serverLaunchDay);

    }


}
