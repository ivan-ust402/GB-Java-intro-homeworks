package homework6;

import java.util.HashSet;

public class Laptop {
    int id;
    String manufacturer;
    String model;
    String color;
    String CPU;
    int numberOfCores;
    double freq;
    int RAM;
    String kindOfMemory;
    int hardDisk;
    String operatingSystem;
    double size;
    String screenResolution;
    String matrixTechnology;
    int price;

    public Laptop(
        int id,
        String manufacturer,
        String model,
        String color,
        String CPU,
        int numberOfCores,
        double freq,
        int RAM,
        String kindOfMemory,
        int hardDisk,
        String operatingSystem,
        double size,
        String screenResolution,
        String matrixTechnology,
        int price
    ) {
        this.id = id;
        this.manufacturer = manufacturer.trim().toLowerCase();
        this.model = model.trim().toLowerCase();
        this.color = color;
        this.CPU = CPU.trim().toLowerCase();
        this.numberOfCores = numberOfCores;
        this.freq = freq;
        this.RAM = RAM;
        this.kindOfMemory = kindOfMemory.trim().toLowerCase();
        this.hardDisk = hardDisk;
        this.operatingSystem = operatingSystem.trim().toLowerCase();
        this.size = size;
        this.screenResolution = screenResolution.trim().toLowerCase();
        this.matrixTechnology = matrixTechnology.trim().toLowerCase();
        this.price = price;
    }

    public String toString() {
        return "\n******* ID: " + id + ",\nПроизводитель: " 
        + manufacturer +",\nМодель: " + model  + ",\nЦвет: " + color  
        + ",\nПроцессор: " + CPU + ",\nКоличество ядер: " + numberOfCores +
         ",\nЧастота: " + freq + ",\nRAM: " + RAM + ",\nВид памяти: " 
        + kindOfMemory + ",\nHD: " + hardDisk  + ",\nСистема: " 
        + operatingSystem + ",\nРазмер экрана: " + size  + ",\nРазрешение: " 
        + screenResolution  + ",\nТехнология матрицы: " + matrixTechnology 
        + ",\nЦена: " + price;
    }

    public static HashSet<Laptop> findLaptopByParam(HashSet<Laptop> inputSet, int key, String value) {
        HashSet<Laptop> result = new HashSet<Laptop>();
        if (key == 1) {
            for (Laptop item : inputSet) {
                if (item.manufacturer.equals(value)) {
                    result.add(item);
                }
            }
        } else if (key == 2) {
            for (Laptop item : inputSet) {
                if (item.color.equals(value)) {
                    result.add(item);
                }
            }
        } else if (key == 3) {
            int cores;
            if (value.isEmpty() || !value.matches("[-+]?\\d+")){
                cores = -1;
            } else {
                cores = Integer.parseInt(value);
            }
            for (Laptop item : inputSet) {
                if (item.numberOfCores == cores) {
                    result.add(item);
                }
            }
        } else if (key == 4) {
            int RAM;
            if (value.isEmpty() || !value.matches("[-+]?\\d+")){
                RAM = -1;
            } else {
                RAM = Integer.parseInt(value);
            }
            for (Laptop item : inputSet) {
                if (item.RAM == RAM) {
                    result.add(item);
                }
            }
        } else if (key == 5) {
            for (Laptop item : inputSet) {
                if (item.kindOfMemory.equals(value)) {
                    result.add(item);
                }
            }
        } else if (key == 6) {
            int HD;
            if (value.isEmpty() || !value.matches("[-+]?\\d+")){
                HD = -1;
            } else {
                HD = Integer.parseInt(value);
            }
            for (Laptop item : inputSet) {
                if (item.hardDisk == HD) {
                    result.add(item);
                }
            }
        } else if (key == 7) {
            for (Laptop item : inputSet) {
                if (item.operatingSystem.equals(value)) {
                    result.add(item);
                }
            }
        } else if (key == 8) {
            double size;
            if (value.isEmpty() || !value.matches("[-+]?\\d+")){
                size = -1;
            } else {
                size = Double.parseDouble(value);
            }
            for (Laptop item : inputSet) {
                if (item.size == size) {
                    result.add(item);
                }
            }
        } else if (key == 9) {
            int price;
            if (value.isEmpty() || !value.matches("[-+]?\\d+")){
                price = -1;
            } else {
                price = Integer.parseInt(value);
            }
            
            for (Laptop item : inputSet) {
                if (item.price == price) {
                    result.add(item);
                }
            }
        }
        return result;
    }
}
