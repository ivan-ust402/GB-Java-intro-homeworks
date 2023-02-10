package homework6;

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
        this.kindOfMemory = kindOfMemory;
        this.hardDisk = hardDisk;
        this.operatingSystem = operatingSystem.trim().toLowerCase();
        this.size = size;
        this.screenResolution = screenResolution.trim().toLowerCase();
        this.matrixTechnology = matrixTechnology.trim().toLowerCase();
        this.price = price;
    }

    public String toString() {
        return "ID: " + id + ",\nПроизводитель: " + manufacturer  
        +",\nМодель: " + model  + ",\nЦвет: " + color  + ",\nПроцессор: " 
        + CPU + ",\nКоличество ядер: " + numberOfCores + ",\nЧастота: " 
        + freq + ",\nRAM: " + RAM + ",\nВид памяти: " + kindOfMemory + 
        ",\nHD: " + hardDisk  + ",\nСистема: " 
        + operatingSystem + ",\nРазмер экрана: " + size  + ",\nРазрешение: " 
        + screenResolution  + ",\nТехнология матрицы: " + matrixTechnology 
        + ",\nЦена: " + price + "\n\n";
    }
}
