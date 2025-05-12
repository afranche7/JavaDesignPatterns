package com.learn.practice;


import com.learn.practice.patterns.behavioral.command.*;
import com.learn.practice.patterns.behavioral.observer.CurrentConditionsDisplay;
import com.learn.practice.patterns.behavioral.observer.ForecastDisplay;
import com.learn.practice.patterns.behavioral.observer.StatisticsDisplay;
import com.learn.practice.patterns.behavioral.observer.WeatherStation;
import com.learn.practice.patterns.behavioral.strategy.*;
import com.learn.practice.patterns.behavioral.template.BeveragePreparation;
import com.learn.practice.patterns.behavioral.template.CoffeeMaker;
import com.learn.practice.patterns.behavioral.template.TeaMaker;
import com.learn.practice.patterns.creational.builder.Computer;
import com.learn.practice.patterns.creational.factory.creator.DocumentCreator;
import com.learn.practice.patterns.creational.factory.creator.PDFDocumentCreator;
import com.learn.practice.patterns.creational.factory.creator.WordDocumentCreator;
import com.learn.practice.patterns.creational.singleton.Singleton;
import com.learn.practice.patterns.creational.dependencyinjection.ApplicationContext;
import com.learn.practice.patterns.creational.dependencyinjection.UserService;
import com.learn.practice.patterns.structural.adapter.inheritance.DocumentManagementSystem;
import com.learn.practice.patterns.structural.adapter.inheritance.FileSystemAdapter;
import com.learn.practice.patterns.structural.adapter.inheritance.ModernStorage;
import com.learn.practice.patterns.structural.adapter.object.AudioPlayerAdapter;
import com.learn.practice.patterns.structural.adapter.object.LegacyAudioPlayer;
import com.learn.practice.patterns.structural.adapter.object.MediaApplication;
import com.learn.practice.patterns.structural.adapter.object.MediaPlayer;
import com.learn.practice.patterns.structural.composite.Designer;
import com.learn.practice.patterns.structural.composite.Developer;
import com.learn.practice.patterns.structural.composite.Employee;
import com.learn.practice.patterns.structural.composite.Manager;
import com.learn.practice.patterns.structural.decorator.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        creationalPatterns();
        structuralPatterns();
        behavioralPatterns();
    }

    public static void creationalPatterns() {
        singletonPattern();
        factoryPattern();
        builderPattern();
        dependencyInjectionPattern();
    }

    private static void singletonPattern() {
        // -------- Singleton --------
        var singleton = Singleton.getInstance();
        singleton.welcome();
    }

    private static void factoryPattern() {
        // -------- Factory method --------
        DocumentCreator creator;

        creator = new PDFDocumentCreator();
        creator.editDocument();

        creator = new WordDocumentCreator();
        creator.editDocument();
    }

    private static void builderPattern() {
        // -------- Builder --------
        Computer officeComputer = new Computer.Builder(
                "Intel i3", "8GB", "256GB SSD")
                .wifi(true)
                .build();

        Computer gamingComputer = new Computer.Builder(
                "AMD Ryzen 9", "32GB", "2TB NVMe")
                .graphicsCard("NVIDIA RTX 4080")
                .networkCard("Killer E3100")
                .soundCard("Creative Sound Blaster")
                .bluetooth(true)
                .wifi(true)
                .build();

        System.out.println("Office Computer: " + officeComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
    }

    private static void dependencyInjectionPattern() {
        // -------- Dependency Injection --------
        ApplicationContext context = new ApplicationContext();

        // Get the service through the context
        UserService userService = context.getComponent(UserService.class);

        // Use the service
        userService.registerUser("alice");
        userService.deleteUser("bob");
    }

    public static void structuralPatterns() {
        adapterObjectPattern();
        adapterClassPattern();
        decoratorPattern();
        compositePattern();
    }

    public static void adapterObjectPattern() {
        // -------- Adapter: Object --------

        // Create the legacy player
        LegacyAudioPlayer legacyPlayer = new LegacyAudioPlayer();

        // Create the adapter
        MediaPlayer adapter = new AudioPlayerAdapter(legacyPlayer);

        // Create application with the adapter
        MediaApplication app = new MediaApplication(adapter);

        // Use the application with legacy player through adapter
        app.playMedia("song.mp3");
    }

    public static void adapterClassPattern() {
        // -------- Adapter: Class --------
        // Create the Class Adapter
        ModernStorage storageAdapter = new FileSystemAdapter("/usr/documents");

        // Create the application with the adapter
        DocumentManagementSystem dms = new DocumentManagementSystem(storageAdapter);

        // Use the application
        byte[] documentContent = "This is a sample document content".getBytes();

        dms.saveDocument("report.txt", documentContent);
        byte[] retrievedContent = dms.openDocument("report.txt");
        dms.deleteDocument("report.txt");
    }

    public static void decoratorPattern() {
        // -------- Decorator --------
        // Simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Add milk to coffee
        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.getCost());

        // Add whip to milk coffee
        Coffee whipMilkCoffee = new WhipDecorator(milkCoffee);
        System.out.println(whipMilkCoffee.getDescription() + " $" + whipMilkCoffee.getCost());

        // Create a complex coffee with multiple decorators
        Coffee specialCoffee = new ChocolateDecorator(
                new WhipDecorator(
                        new MilkDecorator(
                                new SimpleCoffee())));

        System.out.println(specialCoffee.getDescription() + " $" + specialCoffee.getCost());
    }

    public static void compositePattern() {
        // Creating the organization structure
        Employee CEO = new Manager("John Smith", "CEO", 250000);

        Employee CTO = new Manager("Jane Davis", "CTO", 200000);
        Employee CFO = new Manager("Michael Johnson", "CFO", 190000);

        Employee devManager = new Manager("Robert Wilson", "Development Manager", 150000);
        Employee designManager = new Manager("Lisa Thompson", "Design Manager", 145000);

        Employee accountingManager = new Manager("Sarah Brown", "Accounting Manager", 135000);

        // Adding developers to the dev manager
        Employee dev1 = new Developer("Alex Turner", 120000);
        Employee dev2 = new Developer("Emma Harris", 110000);
        Employee dev3 = new Developer("David Martinez", 115000);

        // Adding designers to the design manager
        Employee designer1 = new Designer("Olivia Parker", 105000);
        Employee designer2 = new Designer("William Chen", 108000);

        // Adding accountants
        Employee accountant1 = new Developer("Sophia Kim", 90000);
        Employee accountant2 = new Developer("James Lee", 95000);

        // Building the organizational structure
        CEO.add(CTO);
        CEO.add(CFO);

        CTO.add(devManager);
        CTO.add(designManager);

        CFO.add(accountingManager);

        devManager.add(dev1);
        devManager.add(dev2);
        devManager.add(dev3);

        designManager.add(designer1);
        designManager.add(designer2);

        accountingManager.add(accountant1);
        accountingManager.add(accountant2);

        // Print the organization chart
        System.out.println("Organization Chart:");
        CEO.printOrganizationChart(0);

        // Calculate department salaries
        System.out.println("\nDepartment Salary Totals:");
        System.out.println("Technology Department: $" + CTO.calculateTotalSalary());
        System.out.println("Finance Department: $" + CFO.calculateTotalSalary());
        System.out.println("Development Team: $" + devManager.calculateTotalSalary());

        // Calculate total company salary
        System.out.println("\nTotal Company Salary: $" + CEO.calculateTotalSalary());
    }

    public static void behavioralPatterns() {
        observerPattern();
        strategyPattern();
        commandPattern();
        templateMethodPattern();
    }

    public static void observerPattern() {
        // Create the weather station (subject)
        WeatherStation weatherStation = new WeatherStation();

        // Create the displays (observers)
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        // Register the displays
        weatherStation.registerObserver(currentDisplay);
        weatherStation.registerObserver(statisticsDisplay);
        weatherStation.registerObserver(forecastDisplay);

        // Simulate new weather measurements
        System.out.println("--- First weather update ---");
        weatherStation.setMeasurements(27.5f, 65.0f, 30.4f);

        System.out.println("\n--- Second weather update ---");
        weatherStation.setMeasurements(28.2f, 70.0f, 29.2f);

        // Remove one observer
        weatherStation.removeObserver(forecastDisplay);

        System.out.println("\n--- Third weather update (Forecast Display removed) ---");
        weatherStation.setMeasurements(26.7f, 75.0f, 29.8f);
    }

    public static void strategyPattern() {
        // Create an array for testing
        int[] numbers = {64, 34, 25, 12, 22, 11, 90, 75, 56, 42, 69, 83, 15, 29, 51};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        SortingContext context = new SortingContext();

        // Test with different sorting strategies
        context.setSortingStrategy(new BubbleSort());
        context.sort(numbers);

        context.setSortingStrategy(new InsertionSort());
        context.sort(numbers);

        context.setSortingStrategy(new QuickSort());
        context.sort(numbers);

        context.setSortingStrategy(new MergeSort());
        context.sort(numbers);
    }

    public static void commandPattern() {
        // Create the remote control
        RemoteControl remoteControl = new RemoteControl();

        // Create all the devices
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Thermostat livingRoomThermostat = new Thermostat("Living Room");
        Stereo livingRoomStereo = new Stereo("Living Room");

        // Create all the commands
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomLightDim = new LightDimCommand(livingRoomLight, 50);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        ThermostatSetCommand thermostatSet22 = new ThermostatSetCommand(livingRoomThermostat, 22);
        ThermostatSetCommand thermostatSet18 = new ThermostatSetCommand(livingRoomThermostat, 18);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(livingRoomStereo);
        StereoOffCommand stereoOff = new StereoOffCommand(livingRoomStereo);

        // Create macro commands
        Command[] partyOn = {livingRoomLightDim, stereoOnWithCD, thermostatSet22};
        Command[] partyOff = {livingRoomLightOff, stereoOff, thermostatSet18};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // Set the commands on the remote control
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, livingRoomLightDim, livingRoomLightOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, thermostatSet22, thermostatSet18);
        remoteControl.setCommand(5, partyOnMacro, partyOffMacro);

        // Print the remote layout
        System.out.println(remoteControl);

        // Test individual commands
        System.out.println("--- Testing individual commands ---");
        remoteControl.onButtonWasPushed(0);  // Living room light on
        remoteControl.offButtonWasPushed(0); // Living room light off
        remoteControl.onButtonWasPushed(1);  // Kitchen light on
        remoteControl.offButtonWasPushed(1); // Kitchen light off

        // Test dimming
        System.out.println("\n--- Testing dimming ---");
        remoteControl.onButtonWasPushed(2);  // Living room light dim
        remoteControl.undoButtonWasPushed(); // Undo dim

        // Test stereo
        System.out.println("\n--- Testing stereo ---");
        remoteControl.onButtonWasPushed(3);  // Stereo on with CD
        remoteControl.offButtonWasPushed(3); // Stereo off

        // Test thermostat
        System.out.println("\n--- Testing thermostat ---");
        remoteControl.onButtonWasPushed(4);  // Set to 22°C
        remoteControl.offButtonWasPushed(4); // Set to 18°C

        // Test party mode (macro)
        System.out.println("\n--- Testing party mode ---");
        System.out.println("Party on!");
        remoteControl.onButtonWasPushed(5);  // Party on macro

        System.out.println("\nUndo party mode:");
        remoteControl.undoButtonWasPushed(); // Undo party on (undoes all commands in reverse)

        System.out.println("\nParty off!");
        remoteControl.offButtonWasPushed(5); // Party off macro
    }

    public static void templateMethodPattern() {
        BeveragePreparation coffee = new CoffeeMaker();
        BeveragePreparation tea = new TeaMaker();

        System.out.println("Making coffee...");
        coffee.prepareBeverage();

        System.out.println("\nMaking tea...");
        tea.prepareBeverage();
    }
}