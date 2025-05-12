package com.learn.practice.patterns.creational.builder;

public class Computer {
    // Required parameters
    private final String cpu;
    private final String ram;
    private final String storage;

    // Optional parameters
    private final String graphicsCard;
    private final String networkCard;
    private final String soundCard;
    private final boolean bluetooth;
    private final boolean wifi;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.networkCard = builder.networkCard;
        this.soundCard = builder.soundCard;
        this.bluetooth = builder.bluetooth;
        this.wifi = builder.wifi;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", networkCard='" + networkCard + '\'' +
                ", soundCard='" + soundCard + '\'' +
                ", bluetooth=" + bluetooth +
                ", wifi=" + wifi +
                '}';
    }

    public static class Builder {
        // Required parameters
        private final String cpu;
        private final String ram;
        private final String storage;

        // Optional parameters with default values
        private String graphicsCard = "Integrated Graphics";
        private String networkCard = "Basic Ethernet";
        private String soundCard = "Integrated Audio";
        private boolean bluetooth = false;
        private boolean wifi = false;

        public Builder(String cpu, String ram, String storage) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }

        public Builder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder networkCard(String networkCard) {
            this.networkCard = networkCard;
            return this;
        }

        public Builder soundCard(String soundCard) {
            this.soundCard = soundCard;
            return this;
        }

        public Builder bluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Builder wifi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        public Computer build() {
            // Validation logic could go here
            return new Computer(this);
        }
    }
}
