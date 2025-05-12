package com.learn.practice.patterns.behavioral.command;

public class ThermostatSetCommand implements Command {
    private Thermostat thermostat;
    private int prevTemperature;
    private int temperature;

    public ThermostatSetCommand(Thermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        prevTemperature = thermostat.getTemperature();
        thermostat.setTemperature(temperature);
    }

    @Override
    public void undo() {
        thermostat.setTemperature(prevTemperature);
    }
}
