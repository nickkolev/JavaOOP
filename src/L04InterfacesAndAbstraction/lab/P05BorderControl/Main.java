package L04InterfacesAndAbstraction.lab.P05BorderControl;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Identifiable> citizensAndRobots = new ArrayList<>();

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split(" ");

            if(tokens.length == 3) {
                //citizen
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String id = tokens[2];

                Citizen citizen = new Citizen(name, age, id);
                citizensAndRobots.add(citizen);
            } else if (tokens.length == 2){
                //robot
                String model = tokens[0];
                String id = tokens[1];

                Robot robot = new Robot(id, model);
                citizensAndRobots.add(robot);
            }
            input = scanner.nextLine();
        }

        String idEnds = scanner.nextLine();

        citizensAndRobots.stream().filter(s -> s.getId().endsWith(idEnds)).forEach(s -> System.out.println(s.getId()));
    }
}
